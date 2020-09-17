package com.ford.streams;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClassTest {
    @Test
    public void shouldPrintFirstTenNumbers() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        integerList.stream()
                .limit(4)
                .forEach(System.out::println);
        Stream.of(1, 2, 3, 4, 5, 6)
                .limit(5)
                .forEach(System.out::println);//another method of giving input and this doesn't need list
        //StreamClass streamClass = new StreamClass();
        IntStream.range(1, 10)
                .forEach(System.out::println);
    }

    @Test
    public void shouldPrintSquareOfNumber() {
        Stream.of(1, 6, 3, 5)
                .map(e -> e * e)
                .forEach(System.out::println);
    }

    @Test
    public void shouldSortNumbers() {
        Stream.of(6, 4, 8, 9, 6, 2)
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    public void shouldPrintDistinctNumbers() {
        Stream.of(6, 4, 2, 9, 6, 2)
                .distinct()
                .sorted((e1, e2) -> e2.compareTo(e1))//in order to reverse the sorted list( e1<->e2(try) )
                .forEach(System.out::println);
    }

    @Test
    public void shouldFormStringFromCharStream() {
        Optional<String> reduce = Stream.of("p", "a", "v", "i")
                .reduce((x, y) -> x + y);
        System.out.println(reduce.get());
    }

    @Test
    public void shouldTestCountOperation() {
        Integer integer = Stream.of(6, 4, 2, 9, 6, 2)
                //.count();
                .max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(integer);
    }

    @Test
    public void shouldTestArrayStream() {
        String[] stringArray = new String[]{"Hi", "Pavi", "good", "bye"};
        String s = Arrays.stream(stringArray)
                .peek(System.out::println)
                .reduce((x, y) -> x + y).get();
        System.out.println(s);
    }

    @Test
    public void shouldTest2DArrayStreamConversionToFlatMap() {//flat map test
        Integer[][] integerArray = new Integer[][]{{1, 2, 3}, {4, 5, 6}};
        Integer integer = Arrays.stream(integerArray)
                .peek(System.out::println)//when doing this, we get reference value of the elements
                .flatMap(x -> Arrays.stream(x))//flatMapToInt(Arrays::stream) use this for 'int'
                .reduce((x, y) -> x + y).get();
        System.out.println(integer);
    }

    @Test
    public void shouldTestConditionMatching() {
        boolean b = Stream.of(1, 2, 3, 4, 5, 6, 3, 8, 5, 7)
                //.allMatch(x -> x < 10);//checks whether all theitems are less than 10
        .anyMatch(x -> x<1);
        Assert.assertTrue(b);
    }

    @Test
    public void shouldFindLongestLine() throws IOException {
        String s = Files.lines(Paths.get("C:\\Users\\lenovo\\Desktop\\FORD\\info.txt"))
                .max(Comparator.comparingInt(String::length)).get();
        System.out.println(s);
    }
}
