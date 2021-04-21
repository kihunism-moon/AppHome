package com.example.appkotlin

import org.junit.Assert
import org.junit.Test

class KotlinTest {

    @Test
    fun test1() {
        Assert.assertEquals(4,  2 + 2)
    }

    @Test
    fun testGetterSetter() {
        val person = Person("John")
        person.age = 20
        person.nickname = "MoonKihoon"

        Assert.assertEquals(20, person.age)
        Assert.assertEquals("John", person.name)
        Assert.assertEquals("moonkihoon", person.nickname)

        val prp = PropertySample()
        prp.name = "kihoon"


    }
}