package com.demo.test;

public class MyTesting {

    public static void main(String args[]) {
        String ErrorMessage = "Check your value";

        try {
//            String s = null;
//            System.out.print(s.length());
            int a = 50 / 0;
            // System.out.println("in Try");
        } catch (NullPointerException npe) {
            System.out.println("I caught an NullPointerException and printing it>>> " + ErrorMessage);
        } catch (ArithmeticException ae) {
           throw new ArithmeticException();
        } catch (Exception e) {
            System.out.println("I caught an generic exception and printing it>>> " + e.getClass());
        }
//        finally{
//            System.out.println("In finally block");
//        }

        System.out.println("After Catch Block");
    }



}