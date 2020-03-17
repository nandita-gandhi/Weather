package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),MainView {
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun GetCityName(): String {
        var city:String=etCity.text.toString().trim()
        return city
    }

    override fun OnButtonClicked() {
        btnGetWeather.setOnClickListener {
            DisplayText()
        }


    }
    override fun DisplayText() {
        presenter.display()

    }

    override fun UpdateText(string: String?) {
        tvDisplay.setText(string)

    }
}
