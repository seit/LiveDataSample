package uent192837465.google.com.livedatasample

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import uent192837465.google.com.livedatasample.ViewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var model: MainViewModel

    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text) as TextView
        button = findViewById(R.id.button) as Button
        model = ViewModelProviders.of(this).get(MainViewModel::class.java)

        // Buttonを押されたらModelの中身を変更する
        button.setOnClickListener {
            model.sampleText.value = "hoge"
        }

        // onChangedを持つObserverクラスのインスタンスを作成
        // Modelが変更されたらonChangedがコールされる。Textを受け取ってTextViewに突っ込む。
        val textObserver = Observer<String> { newText ->
            textView.text = newText
        }
        // 作成したObserverオブジェクトをLiveDataオブジェクトにアタッチ。
        // LiveDataは、setValueが呼ばれるとアタッチされたObserverオブジェクトのonChangedをコールバックする。
        model.sampleText.observe(this,textObserver)


    }
}
