package com.jiehhap.notes.utilits

import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.jiehhap.notes.MainActivity
import com.jiehhap.notes.database.DatabaseRepository


lateinit var AUTH:FirebaseAuth
lateinit var CURRENT_ID:String
lateinit var REF_DATABASE:DatabaseReference
lateinit var APP_ACTIVITY:MainActivity
lateinit var REPOSITORY:DatabaseRepository
lateinit var EMAIL:String
lateinit var PASSWORD:String
const val TYPE_DATABASE = "type database"
const val TYPE_ROOM = "type room"
const val TYPE_FIREBASE = "type firebase"
const val ID_FIREBASE = "id firebase"
const val NAME = "name"
const val TEXT = "text"
