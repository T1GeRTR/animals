package com.t1gerok.service;

public class Counter {
    private static int rule1;
    private static int rule2;
    private static int rule3;

    public static void addRule1(){
        rule1+=1;
    }

    public static void addRule2(){
        rule2+=1;
    }

    public static void addRule3(){
        rule3+=1;
    }

    public static int getRule1() {
        return rule1;
    }

    public static int getRule2() {
        return rule2;
    }

    public static int getRule3() {
        return rule3;
    }

    public static void clear(){
        rule1 = rule2 = rule3 = 0;
    }
}
