package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    private val presenter: MainPresenter = MainPresenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //btnGetWeather.setOnClickListener(View.OnClickListener { OnButtonClicked() })
        btnGetWeather.setOnClickListener {
            displayText()
        }
    }

    override fun getCityName(): String {
        var city: String = etCity.text.toString().trim()
        return city
    }

    override fun displayText() {
        presenter.display()

    }

    override fun updateText(string: String?) {
        tvDisplay.setText(string)

    }

}
