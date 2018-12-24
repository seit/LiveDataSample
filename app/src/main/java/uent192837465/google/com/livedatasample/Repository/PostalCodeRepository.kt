package uent192837465.google.com.livedatasample.Repository

import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import uent192837465.google.com.livedatasample.Database.Entity.PostalCode
import javax.inject.Inject
import javax.inject.Singleton
import io.reactivex.Flowable

// Repositoryパターン
// https://qiita.com/toshihirooya/items/4f051881ec0f103b52ce
// https://qiita.com/rmakiyama/items/779cf6407f70b40e4ee7
// DI(Dagger2)
// https://qiita.com/SYABU555/items/43b9d9edc100c92970d0
@Singleton
class PostalCodeRepository :IRepository<PostalCode>{

    @Inject constructor(_postCode: PostalCode){}

    @Query("SELECT * FROM postalCode")
    override fun getAll(): List<PostalCode> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Query("SELECT * FROM postalCode WHERE id IN (:array)")
    override fun loadAllByIds(array: IntArray): List<PostalCode> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // Flowableで返却
    @Query("SELECT postal_code FROM postalCode WHERE address == (:address)")
    fun loadAllByAddress(address: String): Flowable<List<String>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Query("SELECT * FROM postalCode WHERE id == (:id)")
    override fun getOne(id: Int): PostalCode {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Insert
    override fun insert(vararg t: PostalCode) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Delete
    override fun delete(id: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
