package com.sethkraut.literate.numbers;

import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class NumbersLiterate {
    public static void main(String[] args) {
        IntStream.range(1, 1000)
                .filter(divisibleBy(3))
                .filter(divisibleBy(5))
                .map(multiplyBy(2))
                .forEach(System.out::println);
    }

    private static IntUnaryOperator multiplyBy(int i) {
        return num -> num * i;
    }

    private static IntPredicate divisibleBy(int i) {
        return num -> num % i == 0;
    }
}
