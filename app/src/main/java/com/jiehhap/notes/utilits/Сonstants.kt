package com.jiehhap.notes.utilits

import com.jiehhap.notes.MainActivity
import com.jiehhap.notes.database.DatabaseRepository

lateinit var APP_ACTIVITY:MainActivity
lateinit var REPOSITORY:DatabaseRepository
lateinit var EMAIL:String
lateinit var PASSWORD:String
const val TYPE_DATABASE = "type database"
const val TYPE_ROOM = "type room"
const val TYPE_FIREBASE = "type firebase"
