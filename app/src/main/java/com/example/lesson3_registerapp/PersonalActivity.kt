package com.example.lesson3_registerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.personal_info_activity.*

class PersonalActivity : AppCompatActivity() {
    private var isFinish :Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personal_info_activity)

        btnContinue1.setOnClickListener {
            checkInfo2()
            if(isFinish == true)
            {
                val intent = Intent(this, CalculationActivity::class.java)
                startActivity(intent)
                finish()
            }
            else
            {
                Toast.makeText(this, "Please recheck information", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun checkInfo()
    {
            if(edtTxtPhoneNum.text.isNotEmpty()||edtTxtPhoneNum.length()>=10)
            {
                if(!edtTxtEmail.text.contains("@") || edtTxtEmail.text.isEmpty())
                {
                    txtViewIncorrectEmail.isVisible = true
                    edtTxtEmail.setBackgroundColor(getColor(R.color.pink))

                }
                if(edtTxtFullName.text.isEmpty())
                {
                    txtViewIncorrectName.isVisible = true
                    edtTxtFullName.setBackgroundColor(getColor(R.color.pink))
                }
                if(edtTxtCompany.text.isEmpty())
                {
                    txtViewIncorrectCompany.isVisible = true
                    edtTxtCompany.setBackgroundColor(getColor(R.color.pink))
                }
                if(edtTxtPass.text.isEmpty()||edtTxtPass.length()<8)
                {
                    txtViewIncorrectPass.isVisible = true
                    edtTxtPass.setBackgroundColor(getColor(R.color.pink))
                }
                isFinish = false
            }
            else
            {
                txtViewIncorrectEmail.isVisible = false
                edtTxtEmail.setBackgroundColor(getColor(R.color.light_blue))
                txtViewIncorrectCompany.isVisible = false
                edtTxtCompany.setBackgroundColor(getColor(R.color.light_blue))
                txtViewIncorrectName.isVisible = false
                edtTxtFullName.setBackgroundColor(getColor(R.color.light_blue))
                txtViewIncorrectPass.isVisible = false
                edtTxtPass.setBackgroundColor(getColor(R.color.light_blue))
                isFinish = true
            }
        if(isFinish == true)
        {
             val intent = Intent(this, CalculationActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun checkInfo2()
    {
        if(edtTxtPhoneNum.text.isEmpty() || edtTxtPhoneNum.length()<10)
        {
            Toast.makeText(this, "Phone number must contain at lease 10 digits", Toast.LENGTH_SHORT).show()
            edtTxtPhoneNum.setBackgroundColor(getColor(R.color.pink))
            isFinish = false
        }
        else
        {
            edtTxtPhoneNum.setBackgroundColor(getColor(R.color.light_blue))
            isFinish = true
        }

        if(edtTxtFullName.text.isEmpty())
        {
            txtViewIncorrectName.isVisible = true
            edtTxtFullName.setBackgroundColor(getColor(R.color.pink))
            isFinish = false
        }
        else
        {
            txtViewIncorrectName.isVisible = false
            edtTxtFullName.setBackgroundColor(getColor(R.color.light_blue))
            isFinish = true
        }

        if(!edtTxtEmail.text.contains("@") && !edtTxtEmail.text.contains(".com"))
        {
            txtViewIncorrectEmail.isVisible = true
            edtTxtEmail.setBackgroundColor(getColor(R.color.pink))
            isFinish = false
        }
        else
        {
            txtViewIncorrectEmail.isVisible = false
            edtTxtEmail.setBackgroundColor(getColor(R.color.light_blue))
            isFinish = true
        }

        if(edtTxtPass.text.isEmpty())
        {
            txtViewIncorrectPass.isVisible = true
            edtTxtPass.setBackgroundColor(getColor(R.color.pink))
            isFinish = false
        }
        else
        {
            txtViewIncorrectPass.isVisible = false
            edtTxtPass.setBackgroundColor(getColor(R.color.light_blue))
            isFinish = true
        }

        if(edtTxtCompany.text.isEmpty())
        {
            txtViewIncorrectCompany.isVisible = true
            edtTxtCompany.setBackgroundColor(getColor(R.color.pink))
            isFinish = false
        }
        else
        {
            txtViewIncorrectCompany.isVisible = false
            edtTxtCompany.setBackgroundColor(getColor(R.color.light_blue))
            isFinish = true
        }
    }
}
