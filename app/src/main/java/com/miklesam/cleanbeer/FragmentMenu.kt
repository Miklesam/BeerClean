package com.miklesam.cleanbeer

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.miklesam.cleanbeer.databinding.FragmentMenuBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentMenu : Fragment(R.layout.fragment_menu) {

    private lateinit var navController: NavController
    private lateinit var binding: FragmentMenuBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMenuBinding.bind(view)
        navController = findNavController()

        binding.beerRandom.setOnClickListener {
            navController.navigate(R.id.action_fragmentMenu_to_fragmentRandomBeer)
        }

        binding.beerCategory.setOnClickListener {

        }
    }
}
