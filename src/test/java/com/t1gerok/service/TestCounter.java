package com.t1gerok.service;

import org.junit.Assert;
import org.junit.Test;

public class TestCounter {

    @Test
    public void testAddRule1(){
        Counter.addRule1();
        Assert.assertEquals(1, Counter.getRule1());
        Counter.clear();
    }

    @Test
    public void testAddRule2(){
        Counter.addRule2();
        Counter.addRule2();
        Assert.assertEquals(2, Counter.getRule2());
        Counter.clear();
    }

    @Test
    public void testAddRule3(){
        Counter.addRule3();
        Counter.addRule3();
        Counter.addRule3();
        Assert.assertEquals(3, Counter.getRule3());
        Counter.clear();
    }

    @Test
    public void testClear(){
        Counter.addRule1();
        Counter.addRule2();
        Counter.addRule3();
        Assert.assertEquals(1, Counter.getRule1());
        Assert.assertEquals(1, Counter.getRule2());
        Assert.assertEquals(1, Counter.getRule3());
        Counter.clear();
        Assert.assertEquals(0, Counter.getRule1());
        Assert.assertEquals(0, Counter.getRule2());
        Assert.assertEquals(0, Counter.getRule3());
    }
}
