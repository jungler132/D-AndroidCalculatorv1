package com.example.calculatorismail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.Exception
import kotlin.text.isNullOrEmpty as textIsNullOrEmpty


class MainActivity : AppCompatActivity() {
    lateinit var display : TextView
    private lateinit var buttonValue : String
    var buttonValueCount : String = ""
    lateinit var operationValue : String
    private var dotTrigger : Boolean = false
    private var strForOper : String = ""
    private var firstNum : Double = 0.0
    private var secondNum : Double = 0.0
    private var operType : String = ""
    private var resultNum : Double = 0.0
    private var resultNumInt : Int = 0
    private var resultNumString : String = ""
    private var resultNumIntString : String = ""
    private lateinit var button0 : Button
    private lateinit var button1 : Button
    private lateinit var button2 : Button
    private lateinit var button3 : Button
    private lateinit var button4 : Button
    private lateinit var button5 : Button
    private lateinit var button6 : Button
    private lateinit var button7 : Button
    private lateinit var button8 : Button
    private lateinit var button9 : Button
    private lateinit var buttonclear : Button
    private lateinit var buttonanswer : Button
    private lateinit var buttonmultiply : Button
    private lateinit var buttondivide : Button
    private lateinit var buttonminus : Button
    private lateinit var buttonplus : Button
    private lateinit var buttondot : Button
    private var isError : Boolean = true
    private var errorText = "ERROR divide by 0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
           supportActionBar?.hide()
        button0 = findViewById(R.id.button_0)
        button1 = findViewById(R.id.button_1)
        button2 = findViewById(R.id.button_2)
        button3 = findViewById(R.id.button_3)
        button4 = findViewById(R.id.button_4)
        button5 = findViewById(R.id.button_5)
        button6 = findViewById(R.id.button_6)
        button7 = findViewById(R.id.button_7)
        button8 = findViewById(R.id.button_8)
        button9 = findViewById(R.id.button_9)
        buttonclear = findViewById(R.id.button_c)
        buttonanswer = findViewById(R.id.button_result)
        buttonmultiply = findViewById(R.id.button_multiply)
        buttondivide = findViewById(R.id.button_divide)
        buttonminus = findViewById(R.id.button_minus)
        buttonplus = findViewById(R.id.button_plus)
        buttondot = findViewById(R.id.button_dot)
        button0.isClickable = true
        buttonplus.isClickable = false
        buttonminus.isClickable = false
        buttondivide.isClickable = false
        buttonmultiply.isClickable = false
        buttonanswer.isClickable = false




    }
    fun buttonAction(view: View) {
//            dotValue = view.tag.toString()
//            buttonValue = view.tag.toString()
//            buttonValueCount += buttonValue
//            display.text = buttonValueCount
//            if (dotValue == "button_dot" && dotTrigger) {
//                buttonValueCount += "."
//            }

        if(isError){
        display = findViewById<TextView>(R.id.display)
        buttonValue = view.tag.toString()
        when(buttonValue) {
            "0" -> {
                if (buttonValue == "0") {
                    buttonValueCount += buttonValue
                } else if (display.text == "0") {
                    buttonValueCount = buttonValue
                }
                display.text = buttonValueCount
                buttonplus.isClickable = true
                buttonminus.isClickable = true
                buttondivide.isClickable = true
                buttonmultiply.isClickable = true
                buttonanswer.isClickable = true
                if (display.text == "0") {
                    button0.isClickable = display.text.contains(".")
                }

            }
            "1" -> {
                if (display.text == "0") {
                    buttonValueCount = buttonValue
                } else {
                    buttonValueCount += buttonValue
                }
                display.text = buttonValueCount
                buttonplus.isClickable = true
                buttonminus.isClickable = true
                buttondivide.isClickable = true
                buttonmultiply.isClickable = true
                buttonanswer.isClickable = true
                button0.isClickable = true
            }
            "2" -> {
                if (display.text == "0") {
                    buttonValueCount = buttonValue
                } else {
                    buttonValueCount += buttonValue
                }
                display.text = buttonValueCount
                buttonplus.isClickable = true
                buttonminus.isClickable = true
                buttondivide.isClickable = true
                buttonmultiply.isClickable = true
                buttonanswer.isClickable = true
                button0.isClickable = true
            }
            "3" -> {
                if (display.text == "0") {
                    buttonValueCount = buttonValue
                } else {
                    buttonValueCount += buttonValue
                }
                display.text = buttonValueCount
                buttonplus.isClickable = true
                buttonminus.isClickable = true
                buttondivide.isClickable = true
                buttonmultiply.isClickable = true
                buttonanswer.isClickable = true
                button0.isClickable = true
            }
            "4" -> {
                if (display.text == "0") {
                    buttonValueCount = buttonValue
                } else {
                    buttonValueCount += buttonValue
                }
                display.text = buttonValueCount
                buttonplus.isClickable = true
                buttonminus.isClickable = true
                buttondivide.isClickable = true
                buttonmultiply.isClickable = true
                buttonanswer.isClickable = true
                button0.isClickable = true
            }
            "5" -> {
                if (display.text == "0") {
                    buttonValueCount = buttonValue
                } else {
                    buttonValueCount += buttonValue
                }
                display.text = buttonValueCount
                buttonplus.isClickable = true
                buttonminus.isClickable = true
                buttondivide.isClickable = true
                buttonmultiply.isClickable = true
                buttonanswer.isClickable = true
                button0.isClickable = true
            }
            "6" -> {
                if (display.text == "0") {
                    buttonValueCount = buttonValue
                } else {
                    buttonValueCount += buttonValue
                }
                display.text = buttonValueCount
                buttonplus.isClickable = true
                buttonminus.isClickable = true
                buttondivide.isClickable = true
                buttonmultiply.isClickable = true
                buttonanswer.isClickable = true
                button0.isClickable = true
            }
            "7" -> {
                if (display.text == "0") {
                    buttonValueCount = buttonValue
                } else {
                    buttonValueCount += buttonValue
                }
                display.text = buttonValueCount
                buttonplus.isClickable = true
                buttonminus.isClickable = true
                buttondivide.isClickable = true
                buttonmultiply.isClickable = true
                buttonanswer.isClickable = true
                button0.isClickable = true
            }
            "8" -> {
                if (display.text == "0") {
                    buttonValueCount = buttonValue
                } else {
                    buttonValueCount += buttonValue
                }
                display.text = buttonValueCount
                buttonplus.isClickable = true
                buttonminus.isClickable = true
                buttondivide.isClickable = true
                buttonmultiply.isClickable = true
                buttonanswer.isClickable = true
                button0.isClickable = true
            }
            "9" -> {
                if (display.text == "0") {
                    buttonValueCount = buttonValue
                } else {
                    buttonValueCount += buttonValue
                }
                display.text = buttonValueCount
                buttonplus.isClickable = true
                buttonminus.isClickable = true
                buttondivide.isClickable = true
                buttonmultiply.isClickable = true
                buttonanswer.isClickable = true
                button0.isClickable = true
            }

            "110" -> {
                if (dotTrigger == false) {
                    buttonValueCount += "."
                    dotTrigger = true
                    if (display.text == "" || display.text == "+" || display.text == "/" || display.text == "*" || display.text == "-") {
                        buttonValueCount = "0$buttonValueCount"
                        display.text = buttonValueCount
                        button0.isClickable = true
                    } else {
                        display.text = buttonValueCount
                        button0.isClickable = true
                    }
                }
            }
        } }
        else{
            isError
            buttonValue = ""
            buttonValueCount = ""
            dotTrigger = false
            firstNum = 0.0
            display.text = ""
            strForOper = ""
            secondNum = 0.0
            buttonplus.isClickable = false
            buttonminus.isClickable = false
            buttondivide.isClickable = false
            buttonmultiply.isClickable = false
            buttonanswer.isClickable = false
            button0.isClickable = true
            isError = true
        }
    }
        fun buttonPerformance(view: View) {
            display = findViewById<TextView>(R.id.display)
            operationValue = view.tag.toString()
            when (operationValue) {
                "101" -> { //clear
                    buttonValue = ""
                    buttonValueCount = ""
                    dotTrigger = false
                    firstNum = 0.0
                    display.text = ""
                    strForOper = ""
                    secondNum = 0.0
                    buttonplus.isClickable = false
                    buttonminus.isClickable = false
                    buttondivide.isClickable = false
                    buttonmultiply.isClickable = false
                    buttonanswer.isClickable = false
                    button0.isClickable = true
                    isError = true
                }
                "103" -> {  //multiply
                    strForOper = "*"
                    if (isError) {
                        firstNum = display.text.toString().toDouble()
                    }
                    else{
                        errorText
                        buttonValue = ""
                        buttonValueCount = ""
                        dotTrigger = false
                        firstNum = 0.0
                        display.text = ""
                        strForOper = ""
                        secondNum = 0.0
                        buttonplus.isClickable = false
                        buttonminus.isClickable = false
                        buttondivide.isClickable = false
                        buttonmultiply.isClickable = false
                        buttonanswer.isClickable = false
                        button0.isClickable = true
                        isError = true
                    }
                    display.text = strForOper
                    buttonValueCount = ""
                    dotTrigger = false
                    operType = "103"
                    buttonplus.isClickable = false
                    buttonminus.isClickable = false
                    buttondivide.isClickable = false
                    buttonmultiply.isClickable = false
                    buttonanswer.isClickable = false
                    button0.isClickable = true
                }
                "104" -> {   //divide
                    strForOper = "/"
                    if (isError) {
                        firstNum = display.text.toString().toDouble()
                    }
                    else{
                        errorText
                        buttonValue = ""
                        buttonValueCount = ""
                        dotTrigger = false
                        firstNum = 0.0
                        display.text = ""
                        strForOper = ""
                        secondNum = 0.0
                        buttonplus.isClickable = false
                        buttonminus.isClickable = false
                        buttondivide.isClickable = false
                        buttonmultiply.isClickable = false
                        buttonanswer.isClickable = false
                        button0.isClickable = true
                        isError = true
                    }
                    display.text = strForOper
                    buttonValueCount = ""
                    dotTrigger = false
                    operType = "104"
                    buttonplus.isClickable = false
                    buttonminus.isClickable = false
                    buttondivide.isClickable = false
                    buttonmultiply.isClickable = false
                    buttonanswer.isClickable = false
                    button0.isClickable = true

                }
                "105" -> {   //minus
                    strForOper = "-"
                    if (isError) {
                        firstNum = display.text.toString().toDouble()
                    }
                    else{
                        errorText
                        buttonValue = ""
                        buttonValueCount = ""
                        dotTrigger = false
                        firstNum = 0.0
                        display.text = ""
                        strForOper = ""
                        secondNum = 0.0
                        buttonplus.isClickable = false
                        buttonminus.isClickable = false
                        buttondivide.isClickable = false
                        buttonmultiply.isClickable = false
                        buttonanswer.isClickable = false
                        button0.isClickable = true
                        isError = true
                    }
                    display.text = strForOper
                    buttonValueCount = ""
                    dotTrigger = false
                    operType = "105"
                    buttonplus.isClickable = false
                    buttonminus.isClickable = false
                    buttondivide.isClickable = false
                    buttonmultiply.isClickable = false
                    buttonanswer.isClickable = false
                    button0.isClickable = true
                }
                "106" -> {
                    //plus
                    strForOper = "+"
                    if (isError) {
                        firstNum = display.text.toString().toDouble()
                    }
                    else{
                        errorText
                        buttonValue = ""
                        buttonValueCount = ""
                        dotTrigger = false
                        firstNum = 0.0
                        display.text = ""
                        strForOper = ""
                        secondNum = 0.0
                        buttonplus.isClickable = false
                        buttonminus.isClickable = false
                        buttondivide.isClickable = false
                        buttonmultiply.isClickable = false
                        buttonanswer.isClickable = false
                        button0.isClickable = true
                        isError = true
                    }
                    display.text = strForOper
                    buttonValueCount = ""
                    dotTrigger = false
                    operType = "106"
                    buttonplus.isClickable = false
                    buttonminus.isClickable = false
                    buttondivide.isClickable = false
                    buttonmultiply.isClickable = false
                    buttonanswer.isClickable = false
                    button0.isClickable = true
                }
                "102" -> {
                    //result
                    if(isError == true){
                        secondNum = display.text.toString().toDouble()
                    }
                    else {
                        errorText
                    }
                    if(display.text.toString() != "") {
                        when (operType) {
                            "103" -> {
                                resultNum = firstNum * secondNum
                                resultNumString = resultNum.toString()
                                if(resultNumString[resultNumString.length - 1].toString() == "0" && resultNumString[resultNumString.length - 2].toString() == "."){
                                    resultNumInt = resultNum.toInt()
                                    display.text = resultNumInt.toString()
                                }
                                else{
                                    display.text = resultNum.toString()
                                }
                                dotTrigger = false
                                buttonValue = ""
                                buttonValueCount = ""
                                operationValue = ""
                                dotTrigger  = false
                                strForOper  = ""
                                firstNum  = 0.0
                                secondNum = 0.0
                                operType = ""
                                button0.isClickable = true
                            }
                            "104" -> {
                                if(firstNum != 0.0 && secondNum != 0.0) {
                                    resultNum = firstNum / secondNum
                                    resultNumString = resultNum.toString()
                                    if(resultNumString[resultNumString.length - 1].toString() == "0" && resultNumString[resultNumString.length - 2].toString() == "."){
                                        resultNumInt = resultNum.toInt()
                                        display.text = resultNumInt.toString()
                                    }
                                    else{
                                        display.text = resultNum.toString()
                                    }
                                    dotTrigger = false
                                    buttonValue = ""
                                    buttonValueCount = ""
                                    operationValue = ""
                                    dotTrigger  = false
                                    strForOper  = ""
                                    firstNum  = 0.0
                                    secondNum = 0.0
                                    operType = ""
                                    button0.isClickable = true
                                }
                                else if (secondNum == 0.0){
                                    isError = false
                                    display.text = errorText
                                }
                                else if (firstNum == 0.0){
                                    display.text = "0"
                                }

                            }
                            "105" -> {
                                resultNum = firstNum - secondNum
                                resultNumString = resultNum.toString()
                                if(resultNumString[resultNumString.length - 1].toString() == "0" && resultNumString[resultNumString.length - 2].toString() == "."){
                                    resultNumInt = resultNum.toInt()
                                    display.text = resultNumInt.toString()
                                }
                                else{
                                    display.text = resultNum.toString()
                                }
                                dotTrigger = false
                                buttonValue = ""
                                buttonValueCount = ""
                                operationValue = ""
                                dotTrigger  = false
                                strForOper  = ""
                                firstNum  = 0.0
                                secondNum = 0.0
                                operType = ""
                                button0.isClickable = true
                            }
                            "106" -> {
                                resultNum = firstNum + secondNum
                                resultNumString = resultNum.toString()
                                if(resultNumString[resultNumString.length - 1].toString() == "0" && resultNumString[resultNumString.length - 2].toString() == "."){
                                    resultNumInt = resultNum.toInt()
                                    display.text = resultNumInt.toString()
                                }
                                else{
                                    display.text = resultNum.toString()
                                }
                                dotTrigger = false
                                buttonValue = ""
                                buttonValueCount = ""
                                operationValue = ""
                                dotTrigger  = false
                                strForOper  = ""
                                firstNum  = 0.0
                                secondNum = 0.0
                                operType = ""
                                button0.isClickable = true
                            }
                        }
                    }
                }
            }
        }
}

























