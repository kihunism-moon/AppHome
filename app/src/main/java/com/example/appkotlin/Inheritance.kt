package com.example.appkotlin

//  코틀린의 클래스는 기본적으로 상속불가하다.
//  상속을 허용하려면 "open" 키워드 사용

open class FooKotlin {
    var field1 = 0
}

//  객체지향에서 위임 -> 클래스의 특정 기능들을 대신 처리해 주는 것!!

//  데코레이터(Decorator) 패턴 -> 특정 클래스의 기능에 추가 기능을 덧붙이는 방법
//  특정 클래스에 기능을 덧붙이고자 위임을 사용

//  DelegatingArrayList.kt

class DelegatingArrayList<T>(val innerList: MutableCollection<T> = mutableListOf()): MutableCollection<T> by innerList {
    override fun add(element: T): Boolean {
//        확장 기능을 실행
        printlnItem(element)
        return innerList.add(element)
    }

    fun printlnItem(item:T) {
        println(item.toString())
    }
}



// 코틀린의 "by" 키워드