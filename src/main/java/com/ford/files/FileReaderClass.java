package com.ford.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Thread.yield;

public class FileReaderClass implements Runnable {

    public int input = 0;
    public String line;
    public int threadVariable = 0;


    @Override
    public void run() {
        while (input != -1) {
            if (Thread.currentThread().getName().contains("personalRecord")) {
                if (input != -1 && threadVariable == 0) {
                    threadVariable = 1;
                    String fileName = "C:\\Users\\lenovo\\Desktop\\FORD\\info.txt";
                    try {
                        FileReader fileReader = new FileReader(fileName);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        for (int check = 0; check <= input; check++) {

                            line = bufferedReader.readLine();
                        }
                        if (line == null) {
                            input = -1;
                        } else {
                            System.out.println(line);
                            input++;
                        }
                        bufferedReader.close();
                    } catch (FileNotFoundException ex) {
                        System.out.println("file not found" );
                    } catch (IOException ex) {
                        ex.printStackTrace();

                    }
                }

                yield();
            }
        }
    }
    public static void main(String arge[]) {
        Thread personal = new Thread("personalRecord");
        Thread academic = new Thread("academicRecord");

        personal.start();
        academic.start();

    }

}

