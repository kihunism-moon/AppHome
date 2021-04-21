package com.example.appkotlin;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {

    @Test
    public void test1() {
        Assert.assertEquals(4, 2 + 2);
    }

    @Test
    public void testGetterSetter() {
        Person person = new Person("john");
        person.setAge(20);

        Assert.assertEquals(20, person.getAge());
        Assert.assertEquals("john", person.getName());
    }
}
