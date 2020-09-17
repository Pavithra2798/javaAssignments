package com.ford.streams;

import javafx.beans.binding.Binding;
import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
    @Test
    public void shouldTestForAnagramLength() {
        Anagram anagram = new Anagram();
        Assert.assertTrue(anagram.isValid("abcd", "adbc"));

    }
    @Test
    public void shouldTestForAnagramCharacters() {
        Anagram anagram = new Anagram();
        Assert.assertFalse(anagram.isValid("abcd", "bdbc"));

    }
}
