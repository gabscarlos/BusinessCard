package com.gabs.businesscard

import android.app.Application
import com.gabs.businesscard.data.AppDatabase
import com.gabs.businesscard.data.BusinessCardRepository

class App : Application() {
    private val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}