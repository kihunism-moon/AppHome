package com.example.appkotlin

class Person(val name: String) {
    var age: Int = 0 // 프로퍼티

    var nickname: String = "" // 프로퍼티
        set(value) {
            field = value.toLowerCase()
        }
}

class PropertySample {
    var name: String
        set(value: String) {
            print("set")
        }
        get():String {
            return "Alice"
        }
}

var batman1 = Batman("크리스찬 베일")