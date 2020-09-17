package com.ford.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderLocal {
    public static void main(String args[]) throws IOException {
        int c;
        FileReader fileReader = new FileReader("E:\\personalRecordFile.txt");
        while((c = fileReader.read()) != -1) {
            System.out.print((char)c);
        }
    }
}
