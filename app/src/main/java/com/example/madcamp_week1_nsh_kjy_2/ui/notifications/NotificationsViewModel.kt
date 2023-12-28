package com.example.madcamp_week1_nsh_kjy_2.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "my name is jooyoung"
    }
    val text: LiveData<String> = _text
}