package com.example.foodorderapp.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorderapp.databinding.CartItemBinding

class CartAdapter(
    private val CartItems: MutableList<String>,
    private val CartItemPrice: MutableList<String>,
    private var CartImage: MutableList<Int>
) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {


    private val itemQuantity = IntArray(CartItems.size) { 1 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CartViewHolder(binding)
    }


    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class CartViewHolder(private val binding: CartItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                val quantities = itemQuantity[position]
                cartFoodName.text = CartItems[position]
                itemPrice.text = CartItemPrice[position]
                foodImage.setImageResource(CartImage[position])
                quantity.text = quantities.toString()

                minusItem.setOnClickListener {
                    decreaseQuantity(position)
                }

                plusItem.setOnClickListener {
                    increaseQuantity(position)
                }

                trash.setOnClickListener {
                    val itemPosition = adapterPosition
                    if(itemPosition !=RecyclerView.NO_POSITION){
                        deleteItems(itemPosition)
                    }

                }
            }


        }

        private fun decreaseQuantity(position: Int) {
            if (itemQuantity[position] > 1) {
                itemQuantity[position]--

                binding.quantity.text = itemQuantity[position].toString()
            }
        }

        private fun increaseQuantity(position: Int) {
            if (itemQuantity[position] < 10) {
                itemQuantity[position]++

                binding.quantity.text = itemQuantity[position].toString()
            }
        }

        private fun deleteItems(position: Int) {
            CartItems.removeAt(position)
            CartItemPrice.removeAt(position)
            CartImage.removeAt(position)
            notifyItemRemoved(position)
            notifyItemChanged(position, CartItems.size)
        }

    }

    override fun getItemCount(): Int {
        return CartItems.size
    }
}