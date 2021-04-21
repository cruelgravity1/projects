package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class DetailsFragmentViewmodel: ViewModel() {


    val _shoelist = MutableLiveData<MutableList<Shoe>>()
    val shoelist: LiveData<MutableList<Shoe>>
        get() = _shoelist



    fun saveshoe(shoe: Shoe?) {
        shoe?.let {
            shoelist.value?.add(it)
        }


    }
}