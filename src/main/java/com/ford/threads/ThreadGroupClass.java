package com.ford.threads;

public class ThreadGroupClass extends Thread {

    public void displayThreadGroupContent() throws InterruptedException, SecurityException, Exception {
        ThreadGroup threadGroup1 = new ThreadGroup("parent thread");
        //ThreadGroup threadGroup2 = new ThreadGroup(threadGroup1,"child thread");

        NewThread thread1 = new NewThread("one", threadGroup1);
        System.out.println("starting " + thread1.getName());
        //thread1.start();
        NewThread thread2 = new NewThread("two", threadGroup1);
        System.out.println("starting " + thread2.getName());
        //thread2.start();
        System.out.println("parent thread group info " + threadGroup1.getName());
        threadGroup1.list();
    }

    public void displaySystemThread() {
        Thread thread1 = new Thread();
        thread1.setName("thread one");
        thread1.start();
        ThreadGroup current = Thread.currentThread().getThreadGroup();
        int threadCount = current.activeCount();
        Thread[] listOfThreads = new Thread[threadCount];
        current.enumerate(listOfThreads);

        for (int i = 0; i < threadCount; i++) System.out.println("Thread No:" + i + " = "
                + listOfThreads[i].getName());


    }
    public void run(){
        System.out.println("running thread name is:"+Thread.currentThread().getName());
        System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

    }

    public void priorityThreads() {
        Thread threadOne = new Thread();
        Thread threadTwo = new Thread();
        threadOne.setPriority(3);
        threadTwo.setPriority(5);
//        System.out.println("Thread one priority " + threadOne.getPriority());
//        System.out.println("Thread two priority " + threadTwo.getPriority());
        threadOne.start();
        threadTwo.start();
    }


    class NewThread extends Thread {
        public NewThread(String threadName, ThreadGroup threadGroupObject) {
            super(threadGroupObject, threadName);
            start();
        }

//        public void run() {
//
//            for (int i = 0; i < 10; i++) {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException ex) {
//                    System.out.println("Thread " + Thread.currentThread().getName()
//                            + " interrupted");
//                }
//            }
//            System.out.println(Thread.currentThread().getName() +
//                    " finished executing");
//        }
    }


}


