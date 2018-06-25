package demo.test;

public class MyRunnableDemo implements Runnable{

    public void run(){

        System.out.println("thread is running with runnable...");
    }

    public static void main(String args[]){
        MyRunnableDemo m1=new MyRunnableDemo(); //instantiating
        Thread t1 =new Thread(m1); //instance of my thread
        t1.start();
    }


}
