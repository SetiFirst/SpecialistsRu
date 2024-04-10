package com.example.specialistsru.ui.forums

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ForumsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is forums Fragment"
    }
    val text: LiveData<String> = _text
}