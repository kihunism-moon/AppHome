package com.example.appkotlin

import android.content.Context
import android.util.AttributeSet
import android.view.View
import java.util.jar.Attributes

//  자바에서 화는 것처럼 사용해도 무방
open class User(_nickname: String) {
    val nickname = _nickname
}

class Batman(_nickname: String): User(_nickname) {
    val batmanNickame = _nickname
}

//class TextView: View {
//    constructor(context: Context): this(context, null) {
//
//    }
//    constructor(context: Context, attr: AttributeSet): super(context, attr) {
//
//    }
//}

