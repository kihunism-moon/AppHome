package com.example.appkotlin

import android.widget.Toast

fun toastShort(message: String) {
    Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_SHORT).show()
}