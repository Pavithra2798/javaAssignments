package com.ford.streams;

public class Anagram {
    public boolean isValid(String input1, String input2) {
        if(input1.length() == input2.length()){
            String sortedInput1 = input1.chars()
                    .sorted()
                    .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                    .toString();
            String sortedInput2 = input2.chars()
                    .sorted()
                    .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                    .toString();
            return sortedInput1.equals(sortedInput2);
        }
        return false;
    }
}
