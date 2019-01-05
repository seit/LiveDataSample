package uent192837465.google.com.livedatasample.ViewModel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import uent192837465.google.com.livedatasample.Database.Entity.PostalCode
import uent192837465.google.com.livedatasample.Repository.PostalCodeRepository
import uent192837465.google.com.livedatasample.util.toLiveData

class MainViewModel(private val repository: PostalCodeRepository) : ViewModel(){

    private var address = MutableLiveData<String>();
    private fun setAddress(_address: String) {
        address.value = _address
    }

    private var postalCode = MutableLiveData<String>();
    private fun setPostalCode(_postalCode: String) {
        postalCode.value = _postalCode
    }

    // データベースへのinsert
    fun regist(){
        var postalCode = PostalCode(null,address.value,postalCode.value)
        repository.insert(postalCode)
    }

    // FlowableのオブジェクトをLiveDataに変換
//    private val postalCode: LiveData<List<String>> =
//        Transformations.switchMap(addressInput) {address -> repository.loadAllByAddress(address).toLiveData()};

    // LiveDataのインスタンスを生成
    val sampleText : MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}