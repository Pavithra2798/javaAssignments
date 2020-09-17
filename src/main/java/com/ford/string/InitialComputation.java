package com.ford.string;

public class InitialComputation {
    String initial = "";
    public void getInitialFromFullName() {
        StringBuilder name = new StringBuilder();
        name.append("Kandhasamy ");
        /*System.out.println(name[0]);
        String[] words = name.s
        for(int index = 0;index<name.length()-1;index++){
            System.out.println(name[index].charAt(0));
        }*/
        initial = name.charAt(0)+".";
        int length = name.length();
        name.append("Selvaraj");
        initial += name.charAt(length)+".";
        length= 0;
        length = name.length();
        name.append("Pavithra");
        initial +=name.charAt(length);
        System.out.println(initial);
    }
}
