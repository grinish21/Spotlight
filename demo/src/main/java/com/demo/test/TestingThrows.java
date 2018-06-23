package com.demo.test;

import java.io.IOException;

public class TestingThrows {


    void method1() throws ArithmeticException,NullPointerException { // informing that this program can throw the exception

        int a = 10 / 5;
        throw new ArithmeticException();
        //System.out.println("printinngg int"+ a);
    }


    public static void main(String args[]) {
        try {

            TestingThrows t1 = new TestingThrows();
            t1.method1();
        }catch(Exception e){
            System.out.println("Exception handled>>> "+ e.getClass());
        }
        System.out.println("out of try catch");
    }
}
