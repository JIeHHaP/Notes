package com.jiehhap.notes.database

import androidx.lifecycle.LiveData
import com.jiehhap.notes.models.AppNote

interface DatabaseRepository {
    val AllNotes:LiveData<List<AppNote>>
    suspend fun insert(note: AppNote, onSuccess:()->Unit)
    suspend fun delete(note: AppNote, onSuccess:()->Unit)

}