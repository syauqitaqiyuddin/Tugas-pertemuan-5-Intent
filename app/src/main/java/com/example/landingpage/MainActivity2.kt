package com.example.landingpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import com.example.landingpage.databinding.ActivityMain2Binding
import com.example.landingpage.databinding.ActivityMainBinding
import com.example.landingpage.MainActivity



class MainActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra(MainActivity.EXTRA_NAME)
        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE)
        with(binding){
            displayUsername.text = "Welcome $nama"
            displayEmail.text = "Your $email has been activated"
            displayPhone.text = "Your $phone has been registered"
        }
    }
}