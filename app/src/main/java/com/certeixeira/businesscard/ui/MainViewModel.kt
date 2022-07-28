package com.certeixeira.businesscard.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.certeixeira.businesscard.data.BusinessCard
import com.certeixeira.businesscard.data.BusinessCardRepository

class MainViewModel(private val businessCardRepository: BusinessCardRepository) : ViewModel() {

    fun insert(businessCard: BusinessCard) {

    }

    fun getAll(): LiveData<List<BusinessCard>> {
        return businessCardRepository.getAll()
    }
}

class MainViewModelFactory(private val repository: BusinessCardRepository) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MainViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknow viewmodel class")
    }

}