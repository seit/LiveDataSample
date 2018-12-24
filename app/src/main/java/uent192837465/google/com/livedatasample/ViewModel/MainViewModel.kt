package uent192837465.google.com.livedatasample.ViewModel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import uent192837465.google.com.livedatasample.Repository.PostalCodeRepository
import uent192837465.google.com.livedatasample.util.toLiveData

class MainViewModel(private val repository: PostalCodeRepository) : ViewModel(){

    private var addressInput = MutableLiveData<String>();
    private fun setInput(address: String) {
        addressInput.value = address

    }

    // FlowableのオブジェクトをLiveDataに変換
    private val postalCode: LiveData<List<String>> =
        Transformations.switchMap(addressInput) {address -> repository.loadAllByAddress(address).toLiveData()};

    // LiveDataのインスタンスを生成
    val sampleText : MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}