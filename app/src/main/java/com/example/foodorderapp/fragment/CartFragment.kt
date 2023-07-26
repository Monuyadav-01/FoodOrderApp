package com.example.foodorderapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodorderapp.Adapters.CartAdapter
import com.example.foodorderapp.R
import com.example.foodorderapp.databinding.FragmentCartBinding

class CartFragment : Fragment() {

    private lateinit var binding: FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(inflater, container, false)

        val cartFoodName = listOf("Burger", "Sandwich", "MoMos", "French Fries")

        val cartItemPrice = listOf("₹40", "₹50", "₹60", "₹80")

        val cartImage = listOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4
        )
        val adapter=CartAdapter(ArrayList(cartFoodName), ArrayList(cartItemPrice), ArrayList(cartImage))
        binding.cartRecyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter=adapter
        return binding.root
    }

    companion object {

    }
}