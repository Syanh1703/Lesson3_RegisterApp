package com.example.lesson3_registerapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.calculation_activity.*
import java.math.RoundingMode
import java.text.DecimalFormat

class CalculationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculation_activity)

        //Press plus btn
        btnPlus.setOnClickListener {
            plusNum()
            Toast.makeText(this, "You just did the addition", Toast.LENGTH_SHORT).show()
        }

        btnMinus.setOnClickListener {
            minusNum()
            Toast.makeText(this, "You just did the subtraction", Toast.LENGTH_SHORT).show()
        }

        btnMultiply.setOnClickListener {
            multiplyNum()
            Toast.makeText(this, "You just did the multiplication", Toast.LENGTH_SHORT).show()
        }

        btnDivide.setOnClickListener {
            divideNum()
            Toast.makeText(this, "You just did the division", Toast.LENGTH_SHORT).show()
        }

    }

    private fun plusNum()
    {
        val inputOneConvert = (edtTxtInputNum1.text.toString()).toDouble()
        val inputTwoConvert = (edtTxtInputNum2.text.toString()).toDouble()
        val tempValue =  (inputOneConvert + inputTwoConvert).toString()
        txtViewResult.text = removeZeroAfterDot(tempValue)
    }

    private fun minusNum()
    {
        val inputOneConvert = (edtTxtInputNum1.text.toString()).toDouble()
        val inputTwoConvert = (edtTxtInputNum2.text.toString()).toDouble()
        val tempValue =  (inputOneConvert - inputTwoConvert).toString()
        txtViewResult.text = removeZeroAfterDot(tempValue)
    }

    private fun multiplyNum()
    {
        val inputOneConvert = (edtTxtInputNum1.text.toString()).toDouble()
        val inputTwoConvert = (edtTxtInputNum2.text.toString()).toDouble()
        val tempValue =  (inputOneConvert * inputTwoConvert).toString()
        txtViewResult.text = removeZeroAfterDot(tempValue)
    }

    private fun divideNum()
    {
        val inputOneConvert = (edtTxtInputNum1.text.toString()).toDouble()
        val inputTwoConvert = (edtTxtInputNum2.text.toString()).toDouble()
        val df = DecimalFormat("#.###")
        df.roundingMode = RoundingMode.DOWN
        val tempValue =  (inputOneConvert / inputTwoConvert)
        txtViewResult.text = (df.format(tempValue)).toString()
    }

    private fun removeZeroAfterDot(value: String):String
    {
        var result = value
        if(result.contains("0"))
        {
            result = value.substring(0, value.length - 2)
        }
        return result
    }
}