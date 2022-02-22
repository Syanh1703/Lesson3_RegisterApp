package com.example.lesson3_registerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnContinue.setOnClickListener {
            if(edtTxtAccName.text.isEmpty() || edtTxtAccName.length() < 6)
            {
                Toast.makeText(this, "Please correct your username", Toast.LENGTH_SHORT).show()
            }
            if (edtTxtEnterPass.text.isEmpty() || edtTxtEnterPass.length()<8 || edtTxtEnterPass.text.toString()!=edtTxtReEnterPass.text.toString())
            {
                Toast.makeText(this, "Please read the requirements", Toast.LENGTH_SHORT).show()
                txtView1.isVisible = true
                edtTxtEnterPass.setBackgroundColor(getColor(R.color.pink))
            }
            else
            {
                Toast.makeText(this, "Hooray", Toast.LENGTH_SHORT).show()
                txtView1.isVisible = false
                //Intent to Personal Information
                val intent = Intent(this, PersonalActivity::class.java)
                startActivity(intent)
                finish()
            }

        }
    }
}