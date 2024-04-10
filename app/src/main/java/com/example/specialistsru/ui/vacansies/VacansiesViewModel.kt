package com.example.specialistsru.ui.vacansies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VacansiesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is vacansies Fragment"
    }
    val text: LiveData<String> = _text
}