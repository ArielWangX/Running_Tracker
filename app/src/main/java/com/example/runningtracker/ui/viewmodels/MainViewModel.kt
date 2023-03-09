package com.example.runningtracker.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.runningtracker.repositories.MainRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {


}