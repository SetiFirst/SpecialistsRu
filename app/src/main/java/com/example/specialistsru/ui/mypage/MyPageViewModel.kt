package com.example.specialistsru.ui.mypage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyPageViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is myPage Fragment"
    }
    val text: LiveData<String> = _text
}