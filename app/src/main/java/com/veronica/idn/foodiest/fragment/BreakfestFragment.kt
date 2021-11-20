package com.veronica.idn.foodiest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.veronica.idn.foodiest.adapter.FoodAdapter
import com.veronica.idn.foodiest.databinding.FragmentBreakfestBinding
import com.veronica.idn.foodiest.model.DataRecipes
import com.veronica.idn.foodiest.model.Recipes


class BreakfestFragment : Fragment() {

    private lateinit var breakfastBinding: FragmentBreakfestBinding
    private var list : ArrayList<Recipes> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        breakfastBinding = FragmentBreakfestBinding.inflate(inflater, container,false)

        return breakfastBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        list.addAll(DataRecipes.dataBreakfast)
        breakfastBinding.rvBreaksfast.apply{
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context,2)
            val foodAdapter = FoodAdapter(list)
            adapter = foodAdapter
        }
    }


}