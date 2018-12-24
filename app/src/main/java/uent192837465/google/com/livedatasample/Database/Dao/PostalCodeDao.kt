package uent192837465.google.com.livedatasample.Database.Dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import uent192837465.google.com.livedatasample.Database.Entity.PostalCode

@Dao
interface PostalCodeDao {
    @Query("SELECT * FROM postalCode")
    fun getAll(): List<PostalCode>

    @Query("SELECT * FROM postalCode WHERE uid IN (:postalCodes)")
    fun loadAllByIds(postalCodes: IntArray): List<PostalCode>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByAddress(address: String): PostalCode

    @Insert
    fun insertAll(vararg postalCodes: PostalCode)

    @Delete
    fun delete(postalCode: PostalCode)
}