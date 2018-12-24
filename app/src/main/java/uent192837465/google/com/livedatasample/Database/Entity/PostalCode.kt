package uent192837465.google.com.livedatasample.Database.Entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class PostalCode(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "address") var address: String?,
    @ColumnInfo(name = "postal_code") var postalCode: String?
)