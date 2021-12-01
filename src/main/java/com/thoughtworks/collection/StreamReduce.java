package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().filter(number -> number %2 == 1).reduce((first , second) -> second).orElse(-1);
        //return 0;
    }

    public String getLongest(List<String> words) {

        return words.stream().max(Comparator.comparingInt(String::length)).get();
    }

    public int getTotalLength(List<String> words) {

        return words.stream().map(String::length).reduce(0 , Integer::sum);
    }
}
