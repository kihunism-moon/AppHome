package com.example.appkotlin

import android.widget.Toast

fun toastShort(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(MainApplication.getAppContext(), message, length).show()
}