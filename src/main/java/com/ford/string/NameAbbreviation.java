package com.ford.string;

import java.util.Scanner;

public class NameAbbreviation {
    public String userName;

    public String getUserName(String userName) {
        //Scanner in = new Scanner(System.in);
        //String s = in.nextLine();
        //return s;
        int index =0;
        String result = " ";
        String[] words = userName.split(" ");
        for(index = 0;index < words.length-1;index++){
            result += words[index].charAt(0) + ".";
        }
        return result+words[index];

    }
}
