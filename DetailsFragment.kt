package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentDetailsBinding
import com.udacity.shoestore.models.Shoe


class DetailsFragment : Fragment() {

    lateinit var viewModel: DetailsFragmentViewmodel
    var shoe:Shoe= Shoe("bind","shoe","word3","word4")


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val binding: FragmentDetailsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_details, container, false
        )

        viewModel = ViewModelProvider(this).get(DetailsFragmentViewmodel::class.java)

        binding.button.setOnClickListener {
            oncancel()
        }


        binding.button2.setOnClickListener {
            onsave()
            shoe = Shoe(
                (binding.shoenametext).text.toString(),
                (binding.shoesizetext).text.toString(),
                (binding.shoecompanytext).text.toString(),
                (binding.shoedescriptiontext).text.toString()
            )
        }
    return binding.root
}

    private fun onsave(){
        findNavController().navigate(DetailsFragmentDirections.actionDetailsFragmentToListingFragment())
        viewModel.saveshoe(shoe)

 //check if all fields are entered, the save info into add info the the array list...

    }
    private fun oncancel(){
        findNavController().navigate(DetailsFragmentDirections.actionDetailsFragmentToListingFragment())
    }
    }
