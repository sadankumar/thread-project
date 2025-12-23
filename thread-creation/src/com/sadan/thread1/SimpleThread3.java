package com.sadan.thread1;

public class SimpleThread3 {
    public static void main(String[] args) {

        Thread newThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executing Thread");
                System.out.println("newThread name : "+Thread.currentThread().getName());
                System.out.println("newThread priority : "+Thread.currentThread().getPriority());
            }
        });

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Before executing the new thread");
        newThread.setPriority(Thread.MAX_PRIORITY);
        newThread.start();
        System.out.println("After executing the new thread");

        for(int i =0; i< 100; i++){
            System.out.println(i);
        }
    }
}
