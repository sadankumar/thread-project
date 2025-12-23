package com.sadan.thread2;

public class UsingThreadClass {
    public static void main(String[] args) {

        Thread thread = new NewThread();
        thread.start();
    }

    private static class NewThread extends Thread{
        @Override
        public void run(){
            System.out.println("Executing Thread");
            System.out.println("newThread name : "+Thread.currentThread().getName());
            System.out.println("newThread priority : "+Thread.currentThread().getPriority());
        }
    }
}
