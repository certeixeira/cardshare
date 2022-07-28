package com.certeixeira.businesscard

import android.app.Application
import com.certeixeira.businesscard.data.AppDatabase
import com.certeixeira.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}