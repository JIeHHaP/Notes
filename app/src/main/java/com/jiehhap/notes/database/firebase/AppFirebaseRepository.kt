package com.jiehhap.notes.database.firebase

import androidx.lifecycle.LiveData
import com.google.firebase.auth.FirebaseAuth
import com.jiehhap.notes.database.DatabaseRepository
import com.jiehhap.notes.models.AppNote
import com.jiehhap.notes.utilits.EMAIL
import com.jiehhap.notes.utilits.PASSWORD

class AppFirebaseRepository:DatabaseRepository {

    private val mAuth = FirebaseAuth.getInstance()

    override val AllNotes: LiveData<List<AppNote>> = AllNotesLiveData()


    override suspend fun insert(note: AppNote, onSuccess: () -> Unit) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> Unit) {
        TODO("Not yet implemented")
    }

    override fun connectToDatabase(onSuccess: () -> Unit, onFail: (String) -> Unit) {
        mAuth.signInWithEmailAndPassword(EMAIL, PASSWORD)
            .addOnSuccessListener { onSuccess() }
            .addOnFailureListener {
                mAuth.createUserWithEmailAndPassword(EMAIL, PASSWORD)
                    .addOnSuccessListener { onSuccess() }
                    .addOnFailureListener {onFail(it.message.toString())}
            }
    }

    override fun signOut() {
        mAuth.signOut()
    }
}