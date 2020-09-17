package com.ford.string;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import org.junit.Test;

public class NameAbbreviationTest {
    @Test
    public void shouldReturnAbbreviationOfName(){
        NameAbbreviation name = new NameAbbreviation();
        String abbreviation = name.getUserName("Kandhasamy Selvaraj Pavithra");
        System.out.println(abbreviation);

    }

}
