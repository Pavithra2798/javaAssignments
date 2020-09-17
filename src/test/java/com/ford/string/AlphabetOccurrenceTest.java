package com.ford.string;

import org.junit.Test;

public class AlphabetOccurrenceTest {
    @Test
    public void shouldReturnMaximumOccurredAlphabet(){
        AlphabetOccurrence alphabets = new AlphabetOccurrence();
        System.out.println("Maximum occurred character is " + alphabets.findMaximumOccurrence("aappapappppppppppp sdjashjs"));

    }
}
