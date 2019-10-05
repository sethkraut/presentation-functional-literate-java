package com.sethkraut.literate.numbers;

import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class NumbersFunctional {
    public static void main(String[] args) {
        IntStream.range(1, 1000)
                .filter(num -> num % 3 == 0)
                .filter(num -> num % 5 == 0)
                .map(num -> num * 2)
                .forEach(s -> System.out.println(s));
    }
}
