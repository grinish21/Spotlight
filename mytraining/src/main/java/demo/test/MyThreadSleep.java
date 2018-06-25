package demo.test;

public class MyThreadSleep extends Thread{

    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        MyThreadSleep t1=new MyThreadSleep();
        MyThreadSleep t2=new MyThreadSleep();

        t1.start();
        t2.start();
    }
}
