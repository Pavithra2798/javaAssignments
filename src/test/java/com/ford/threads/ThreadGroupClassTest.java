package com.ford.threads;

import org.junit.Test;

public class ThreadGroupClassTest {
    @Test
    public void shouldDisplayInformationOfThreadGroup() throws Exception {
        ThreadGroupClass threadGroupClass = new ThreadGroupClass();
        threadGroupClass.displayThreadGroupContent();
    }

    @Test
    public void shouldDisplaySystemThread() {
        ThreadGroupClass threadGroupClass = new ThreadGroupClass();
        threadGroupClass.displaySystemThread();
    }

    @Test
    public void shouldFollowThreadPriority() {
        ThreadPriorityClass threadPriorityClass = new ThreadPriorityClass();
        Thread thread1 = new Thread(threadPriorityClass);
        thread1.setName("myThreadOne");
        thread1.start();
        thread1.setPriority(Thread.MIN_PRIORITY);
        Thread thread2 = new Thread(threadPriorityClass);
        thread2.setName("MyThreadTwo");
        thread2.start();
        thread2.setPriority(Thread.MAX_PRIORITY);
        Thread thread3 = new Thread(threadPriorityClass);
        thread3.setName("MyThreadThree");
        thread3.start();
        thread3.setPriority(Thread.NORM_PRIORITY);
    }
}
