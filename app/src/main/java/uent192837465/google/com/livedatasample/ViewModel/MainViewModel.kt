package uent192837465.google.com.livedatasample.ViewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val sampleText : MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}