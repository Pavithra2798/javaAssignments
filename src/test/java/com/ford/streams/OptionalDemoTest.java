package com.ford.streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class OptionalDemoTest {
    @Test
    public void shouldCheckForNull() {
        //Optional<String> s = Optional.of(null);//gives an error
        Optional<String> s = Optional.ofNullable(null);//does not give an error
        //Optional<String> s = Optional.of("hi");
        Assert.assertTrue(s.isPresent());
    }

    @Test
    public void shouldGetDefaultValue() {
//        Optional<String> s = (Optional<String>) Optional.ofNullable(null).orElse(Optional.ofNullable("hi"));
//        Assert.assertEquals("hi",s.get());
        String s1 = "hi";// or use s1 = null
        String s2 = Optional.ofNullable(s1).orElse("hello");//try orElseGet(),isPresent(),orElseThrow()
        Assert.assertEquals("hi", s2);
        //sysntax for isPresent() - isPresent(x->sout(x))
    }
}
