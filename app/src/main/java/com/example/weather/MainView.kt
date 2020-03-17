package com.example.weather

interface MainView {
    fun GetCityName():String

    fun OnButtonClicked()

    fun DisplayText()

    fun UpdateText(string: String?)
}