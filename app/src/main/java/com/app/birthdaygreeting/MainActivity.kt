package com.app.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

//ctrl+del for deleting whole line
//shift+f1+f6 for refractoring everywhere
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createBirthdayGreeting.setOnClickListener {
            val name=nameInput.text.toString()
            val intent=Intent(this,BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
            startActivity(intent)
        }
    }
}