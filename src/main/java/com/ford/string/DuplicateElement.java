package com.ford.string;

public class DuplicateElement {
    private int index;
    private int anotherIndex;
    //String[] duplicateArray = new String[10];
    //int duplicateIndex = 0;
    public String findDuplicateElement() {
        String[] stringArray = new String[]{"pavi","pavi","ashi","ashi","vidhi"};
        for(index = 0;index < stringArray.length-1;index++){
            for(anotherIndex = 0;anotherIndex < stringArray.length-1;anotherIndex++){
                if(stringArray[index] == stringArray[anotherIndex+1]){
                    return stringArray[anotherIndex];
                    //duplicateArray[duplicateIndex] = stringArray[anotherIndex];
                    //duplicateIndex++;
                }
            }

        }
        //return duplicateArray;
        return null;
    }

}
