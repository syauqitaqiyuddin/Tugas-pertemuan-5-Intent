package com.example.landingpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.landingpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    companion object{
        const val EXTRA_NAME = "extra_username"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PASS = "extra_pass"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btn.setOnClickListener{
                val resultIntent = Intent(this@MainActivity,MainActivity2::class.java)
                resultIntent.putExtra(EXTRA_NAME, username.text.toString())
                resultIntent.putExtra(EXTRA_EMAIL, email.text.toString())
                resultIntent.putExtra(EXTRA_PHONE, phone.text.toString())
                resultIntent.putExtra(EXTRA_PASS, password.text.toString())
                startActivity(resultIntent)
            }
        }
    }
}