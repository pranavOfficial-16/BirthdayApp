package com.example.birthdayapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greetings.*

class BirthdayGreetings : AppCompatActivity() {
    /*
    companion object{
        const val name_extra = "name_extra"
    }
    */
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greetings)

        val name = intent.getStringExtra("key")
        BirthdayGreet.text="Happy Birthday\n$name!"
    }
}
