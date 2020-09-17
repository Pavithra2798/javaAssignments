package com.ford.threads;

public class ThreadPriorityClass extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " thread running");
    }

    public static void main(String args[])
    {
        ThreadGroup threadGroup = new ThreadGroup("parent");
        Thread t1 = new Thread(threadGroup,"one");
        t1.setPriority(5);
        t1.start();
        Thread t2 = new Thread(threadGroup,"two");
        t2.setPriority(1);
        t2.start();
        Thread t3 = new Thread(threadGroup,"three");
        t3.setPriority(10);
        t3.start();

    }


}
