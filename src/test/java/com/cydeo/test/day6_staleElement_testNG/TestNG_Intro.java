package com.cydeo.test.day6_staleElement_testNG;

import org.bouncycastle.crypto.agreement.jpake.JPAKEUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import javax.sound.midi.Soundbank;

import static org.testng.Assert.assertEquals;

public class TestNG_Intro {



    @Test (priority = 2)
    public void test1(){
        System.out.println("Test1 is running...");
    }

    @Test (priority = 1)
    public void testOnePlusFive(){
        assertEquals(1+5, 6);

    }

    @Test
    public void tenMinusFour(){
        assertEquals(10-4, 6);
    }

    @BeforeClass
    public void setup(){
        System.out.println("BeforeClass running...");
    }

    @AfterClass
    public void teardown(){
        System.out.println("AfterClass running...");
    }







}
