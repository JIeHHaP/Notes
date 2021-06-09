package com.jiehhap.notes.database.room

import androidx.lifecycle.LiveData
import com.jiehhap.notes.database.DatabaseRepository
import com.jiehhap.notes.models.AppNote

class AppRoomRepository(private val appRoomDao: AppRoomDao):DatabaseRepository {

    override val AllNotes: LiveData<List<AppNote>>
        get() = appRoomDao.getAllNotes()

    override suspend fun insert(note: AppNote, onSuccess: () -> Unit) {
        appRoomDao.insert(note)
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> Unit) {
        appRoomDao.delete(note)
    }
}