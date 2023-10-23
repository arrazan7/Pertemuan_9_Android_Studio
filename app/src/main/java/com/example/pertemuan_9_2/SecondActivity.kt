package com.example.pertemuan_9_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan_9_2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("PASSING_USERNAME")
        val email = intent.getStringExtra("PASSING_EMAIL")
        val phone = intent.getStringExtra("PASSING_PHONE")
        val password = intent.getStringExtra("PASSING_PASSWORD")

        with(binding){
            txtUsername.setText("Hello, $name!")
            txtEmail.setText("Your Email is $email")
            txtPhone.setText("Your Phone is $phone")
            txtPassword.setText("Your Password is $password")

            btnLogout.setOnClickListener{
                val intentToMainActivity = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intentToMainActivity)
                finish()
            }
        }
    }
}