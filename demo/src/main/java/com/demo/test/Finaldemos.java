package com.demo.test;

public class Finaldemos {


    public static void main(String args[]) {

//        final int x = 20;
//        x = 10;
//        System.out.print(x);

        Finaldemos fd1 = new Finaldemos();
        Finaldemos fd2 = new Finaldemos();

        fd1 = null;
        fd2 = null;
        System.out.println("before  Garbage Collection");
        System.gc();
    }

public void finalize (){

        System.out.println("executing finalize");
}
}
