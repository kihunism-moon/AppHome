package com.example.appkotlin

import android.provider.ContactsContract
import java.sql.Array
import kotlin.Array as Array1

fun getFacebookName(accountId: Int) = "fb:$accountId"

interface UserInterface{
    val nickname: String
}

//  인터페이스 상속 => UserInterface
class PrivateUser(override val nickname: String): UserInterface

class SubscribingUser(val email: String): UserInterface {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int): UserInterface {
    override val nickname = getFacebookName(accountId)
}

fun main() {

    var privateUser = PrivateUser("codermoon@naver.com")
    var subscribingUser = SubscribingUser("resacle93@naver.com")

    println("Full Email address : ${privateUser.nickname}")
    println("half Email address : ${subscribingUser.nickname}")

//    println(PrivateUser("test@kotlinlang.org").nickname)
//    println(SubscribingUser("test@kotlinlang.org").nickname)
}