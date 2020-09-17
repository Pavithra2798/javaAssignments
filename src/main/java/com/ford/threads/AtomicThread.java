package com.ford.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicThread extends Thread{
        int atomicThread = 0;
        private AtomicInteger count = new AtomicInteger(10);

        public void run() {
            increment();
            decrement();
        }

        public AtomicInteger increment() {
            count.getAndIncrement();
            System.out.println(Thread.currentThread().getName()+ " increment "+ count);
            return count;
        }

        public AtomicInteger decrement() {
            count.getAndDecrement();
            System.out.println(Thread.currentThread().getName()+ " decrement "+ count);
            return count;
        }

    public static void main(String args[]) throws InterruptedException {
        AtomicThread atomicThread = new AtomicThread();
        Thread t1 = new Thread(atomicThread);
        t1.setName("threadOne");
        t1.start();
        Thread t2 = new Thread(atomicThread);
        t2.setName("threadTwo");
        t2.start();
    }

}



