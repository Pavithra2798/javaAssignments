package com.ford.string;

public class AlphabetOccurrence {
    public char maximumOccurredAlphabet;

    public char findMaximumOccurrence(String alphabetInput) {
        int charArray[] = new int[127];
        for(int index = 0;index < alphabetInput.length();index++){
            charArray[alphabetInput.charAt(index)]++;
        }
        int maximum = 0;
        for(int index = 0;index<alphabetInput.length();index++){
            if(maximum < charArray[alphabetInput.charAt(index)]){
                maximum = charArray[alphabetInput.charAt(index)];
                maximumOccurredAlphabet = alphabetInput.charAt(index);
            }
        }
        return maximumOccurredAlphabet;
    }
}
