package com.example.birthdayapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View)
    {
        val name = nameInput.editableText.toString()
        Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show()
        val intent = Intent(this,BirthdayGreetings::class.java)
        intent.putExtra("key",name)
        startActivity(intent)
    }


}