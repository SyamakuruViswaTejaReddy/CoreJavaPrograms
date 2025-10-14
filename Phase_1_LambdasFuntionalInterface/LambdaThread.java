package Phase_1_LambdasFuntionalInterface;

public class LambdaThread {
    public static void main(String[] args) {
    Runnable r1= () ->System.out.println("Thread 1 is running");
    Thread t1=new Thread(r1);
    t1.start();
    }
}
