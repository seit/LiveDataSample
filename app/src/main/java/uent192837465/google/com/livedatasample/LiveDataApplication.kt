package uent192837465.google.com.livedatasample

import android.app.Application
import android.arch.persistence.room.Room
import uent192837465.google.com.livedatasample.Database.AppDatabase

class LiveDataApplication : Application(){
    companion object {
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(this, objectOf<AppDatabase>(), "kotlin_room_sample.db").build()
    }
}

internal inline fun <reified T : Any> objectOf() = T::class.java