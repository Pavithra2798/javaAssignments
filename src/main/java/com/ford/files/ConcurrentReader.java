package com.ford.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConcurrentReader implements Runnable {
    //    public static void main(String args[]) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader("E:\\personalRecordFile.txt"));
//        BufferedReader reader2 = new BufferedReader(new FileReader("E:\\academicRecordFile.txt"));
//        String line = reader.readLine();
//        String line2 = reader2.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = reader.readLine();
//            System.out.println(line2);
//            line2 = reader2.readLine();
//        }
//        reader.close();
//    }
    public static void main(String args[]) {
        ConcurrentReader concurrentReader = new ConcurrentReader();
        Thread t1 = new Thread(concurrentReader);
        t1.start();
        Thread t2 = new Thread(concurrentReader);
        t2.start();
    }

    @Override
    public void run() {
        readingMethod1();
        readingMethod2();
    }

    private void readingMethod2() {
        BufferedReader reader2 = null;
        try {
            reader2 = new BufferedReader(new FileReader("E:\\academicRecordFile.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line2 = null;
        try {
            line2 = reader2.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (line2 != null) {
            System.out.println(line2);
            try {
                line2 = reader2.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            reader2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void readingMethod1() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("E:\\personalRecordFile.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (line != null) {
            System.out.println(line);
            try {
                line = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





