package com.example.weather

interface MainView {
    fun getCityName(): String

    fun displayText()

    fun updateText(string: String?)
}