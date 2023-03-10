package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.udacity.shoestore.databinding.FragmentWelcomeFregmentBinding

class WelcomeFregment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
val binding :FragmentWelcomeFregmentBinding =
    DataBindingUtil.inflate(inflater, R.layout.fragment_welcome_fregment, container, false)

        binding.WelcomeBoutton.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_welcomeFregment2_to_instructionsFragment)
        }

        return binding.root
    }

}