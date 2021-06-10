package com.jiehhap.notes.screens.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.jiehhap.notes.utilits.REPOSITORY

class MainFragmentViewModel(application: Application): AndroidViewModel(application){
    val allNotes = REPOSITORY.AllNotes
}