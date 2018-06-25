package demo.test;

public class MyThreadDemo extends Thread{


    public void run(){
        System.out.println("thread is running...");
    }


    public static void main(String args[]){
        MyThreadDemo t1=new MyThreadDemo();
        t1.start();
    }

}
