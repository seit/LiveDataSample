package uent192837465.google.com.livedatasample.Repository

import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import uent192837465.google.com.livedatasample.Database.Entity.PostalCode

interface IRepository<T> {

    fun getAll(): List<T>

    fun loadAllByIds(array: IntArray): List<T>

    fun getOne(id: Int): T

    fun insert(vararg t: T)

    fun delete(id: Int)
}