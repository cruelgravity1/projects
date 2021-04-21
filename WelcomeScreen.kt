package com.udacity.shoestore

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentWelcomeScreenBinding
import kotlinx.android.synthetic.main.fragment_welcome_screen.view.*


class WelcomeScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentWelcomeScreenBinding= DataBindingUtil.inflate(
            inflater, R.layout.fragment_welcome_screen, container, false)

        binding.buttoninstructions.setOnClickListener {
            findNavController().navigate(WelcomeScreenDirections.actionWelcomeScreenToInstructions())
        }

        binding.buttonshoelist.setOnClickListener {
            findNavController().navigate(WelcomeScreenDirections.actionWelcomeScreenToListingFragment())
        }
        return binding.root
    }
}
