package com.eyyuperdogan.calculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var num1 = ""
    var num2 = 0.0
    var num3 = ""
    var num4=0
    var result = ""
    var expectation = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        var butonChoose = view as Button
        result = textResult.text.toString()

        when (butonChoose.id) {
            //rakamlara basıldığı zaman
            button0.id -> {
                result += "0"
            }
            button1.id -> {
                result += "1"
            }
            button2.id -> {
                result += "2"
            }
            button3.id -> {
                result += "3"
            }
            button4.id -> {
                result += "4"
            }
            button5.id -> {
                result += "5"
            }
            button6.id -> {
                result += "6"
            }
            button7.id -> {
                result += "7"
            }
            button8.id -> {
                result += "8"
            }
            button9.id -> {
                result += "9"
            }
            buttonNegative.id -> {
                if (!textResult.text.toString().equals("")) {
                    result = "-" + result
                }
            }
        }

        textResult.setText(result)
    }

    fun fourOperations(view: View) {
        var butonChoose = view as Button
        var result: String = textResult.text.toString()
        //dört işlem
        when (butonChoose.id) {
            buttonDivide.id -> {
                num1 = textResult.text.toString()
                if (!textTransaction.text.toString().equals("")) {
                    var num4 = 0.0
                    num3 = textTransaction.text.toString()
                    num4 = expectation.toDouble()
                    num4 = num3.toDouble() / num1.toDouble()
                    result = num4.toString()
                }

            }
            buttonİmpact.id -> {
                num1 = textResult.text.toString()
                if (!textTransaction.text.toString().equals("")) {
                    num3 = textTransaction.text.toString()
                    expectation = num3.toDouble() * num1.toDouble()
                    result = expectation.toString()
                }

            }
            buttonExtraction.id -> {
                num1 = textResult.text.toString()
                if (!textResult.text.toString().equals("")) {
                    num3 = textTransaction.text.toString()
                    expectation = num3.toDouble() - num1.toDouble()
                    result = expectation.toString()
                }


            }
            buttonCollection.id -> {
                if (!textResult.text.toString().equals("")) {
                    num1 = textResult.text.toString()
                    num2 += num1.toDouble()
                    result = num2.toString()
                }
            }


        }
        textResult.setText("")
        textTransaction.setText(result)

    }

    fun otherOperations(view: View) {
        var butonChoose = view as Button
        result = textResult.text.toString()
        when (butonChoose.id) {



            buttonComma.id -> {
                result += ","

            }
            buttonDut.id -> {
                result += "."
                textTransaction.setText(result)
            }


        }
        textResult.setText(result)
        textTransaction.setText("")

    }

    fun deleteClean(view :View) {
        var butonChoose = view as Button
        result = textResult.text.toString()
    when (butonChoose.id) {
        buttonDelete.id -> {
            num1 = textResult.text.toString()
            num4 = num1.toInt()
            result =(num4 / 10).toString()
            textResult.setText(result)

        }
        buttonClean.id -> {
        num2 = 0.0
        expectation = 0.0
        textTransaction.setText("")
        textResult.setText("")
    }
        buttonEqual.id -> {
            if (!textTransaction.text.toString().equals("")) {
                textResult.setText(textTransaction.text.toString())
                textTransaction.setText("")
                num2 = 0.0
                expectation = 0.0
            }
        }
    }
}
}