package com.example.appkotlin

class PersonTest {
    var name: String = ""
    var age: Int? = null

    constructor(name: String){
        this.name = name
    }
    constructor(name:String, age:Int) {
        this.name = name
        this.age = age
    }
}