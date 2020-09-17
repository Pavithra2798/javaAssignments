package com.ford.functionalprogramming;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfacesTest {
    @Test
    public void shouldTestBuiltInFunctionalSupplier() {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "hi";
            }
        };
        Assert.assertEquals("hi", supplier.get());
    }

    @Test
    public void shouldTestPredicate() {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
//                if(integer % 2 == 0)
//                    return true;
//                else
//                    return false;
                return integer % 2 == 0;
            }
        };
        Assert.assertTrue(predicate.test(4));
    }

    @Test
    public void shouldTestConsumer() {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("hi " + s);
            }
        };
        List<Integer> numbers = Arrays.asList(1,5,3,6,4);
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        consumer.accept("pavi");
    }

    @Test
    public void shouldTestFunction() {
        Function<String,String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return "Hi " + s;
            }
        };
        Assert.assertEquals("Hi Pavi", function.apply("Pavi"));
    }

    @Test
    public void shouldTestBiFunction() {
        BiFunction<Integer,Integer,Integer> biFunction = (integer, integer2) -> integer+integer2;
        BiFunction<Integer,Integer,Integer> integerBiFunction = (number1, number2) -> number1 + number2;
        Assert.assertEquals(Integer.valueOf(4), biFunction.apply(Integer.valueOf(3),Integer.valueOf(1)));
        Assert.assertEquals(Integer.valueOf(6), integerBiFunction.apply(4,2));
    }

    @Test
    public void shouldAddAndThenMultiply() {
        Function<Integer,Integer> function = (num1) -> num1 + 6;
        Function<Integer,Integer> function2 = (num1) -> num1 * 10;
        Assert.assertEquals(Integer.valueOf(6),function.andThen(function2).apply(2));
    }
}
