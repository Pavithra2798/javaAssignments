package com.ford.threads;

import org.junit.Test;

public class HelloRunnableTest {
    @Test
    public void executeRunnable() {
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread1 = new Thread(helloRunnable);
        thread1.setName("myThreadOne");
        thread1.start();
        thread1.setPriority(Thread.NORM_PRIORITY);
        Thread thread2 = new Thread(helloRunnable);
        thread2.setName("MyThreadTwo");
        thread2.start();
        thread2.setPriority(Thread.MIN_PRIORITY);
        Thread thread3 = new Thread(helloRunnable);
        thread3.setName("MyThreadThree");
        thread3.start();
        thread3.setPriority(Thread.MAX_PRIORITY);
        //helloRunnable.run();
    }
}
