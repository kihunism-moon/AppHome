package com.example.appkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testBtn.setOnClickListener {
            toastShort("클릭")
        }



        edtBtn.setOnClickListener {

            var count = edtTEST.text.toString().toInt()

            if(count % 2 == 0) {
                toastShort("${count}는/은 2의 배수 입니다.  ==> 짝수")
            }else{
                toastShort("${count}는/은 2의 배수가 아닙니다. ==> 홀수")
            }
        }



    }
}