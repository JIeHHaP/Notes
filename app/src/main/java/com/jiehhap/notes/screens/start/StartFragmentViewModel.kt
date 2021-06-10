package com.jiehhap.notes.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.jiehhap.notes.database.firebase.AppFirebaseRepository
import com.jiehhap.notes.database.room.AppRoomDatabase
import com.jiehhap.notes.database.room.AppRoomRepository
import com.jiehhap.notes.utilits.REPOSITORY
import com.jiehhap.notes.utilits.TYPE_FIREBASE
import com.jiehhap.notes.utilits.TYPE_ROOM
import com.jiehhap.notes.utilits.showToast

class StartFragmentViewModel(application: Application):AndroidViewModel(application) {
    private val mContext = application

    fun initDatabase(type:String, onSuccess:()->Unit){

        when(type){
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
                REPOSITORY = AppRoomRepository(dao)
                onSuccess()
            }

            TYPE_FIREBASE -> {
                REPOSITORY = AppFirebaseRepository()
                REPOSITORY.connectToDatabase({onSuccess()},{ showToast(it)})
            }

        }

    }
}