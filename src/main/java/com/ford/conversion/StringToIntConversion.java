package com.ford.conversion;

public class StringToIntConversion {
    public int convert(String num) {
        return Integer.parseInt(num);
    }

    public int addingString(String string1, String string2) {
        return convert(string1)+ convert(string2);
    }
}
