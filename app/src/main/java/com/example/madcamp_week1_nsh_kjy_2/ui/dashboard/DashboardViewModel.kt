package com.example.madcamp_week1_nsh_kjy_2.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "nshoon had modified"
    }
    val text: LiveData<String> = _text
}