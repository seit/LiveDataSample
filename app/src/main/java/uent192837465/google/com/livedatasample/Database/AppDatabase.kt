package uent192837465.google.com.livedatasample.Database

import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Database
import uent192837465.google.com.livedatasample.Database.Dao.PostalCodeDao
import uent192837465.google.com.livedatasample.Database.Entity.PostalCode


@Database(entities = arrayOf(PostalCode::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract val postalCodeDao: PostalCodeDao
}