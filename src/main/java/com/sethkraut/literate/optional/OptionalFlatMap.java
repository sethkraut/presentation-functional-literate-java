package com.sethkraut.literate.optional;

import java.util.Optional;

public class OptionalFlatMap {
    public static void main(String[] args) {
        System.out.println(toInteger("45"));
    }

    private static int toInteger(String value) {
        return Optional.of(value)
            .flatMap(OptionalFlatMap::parseInteger)
            .orElse(0);
    }

    private static Optional<Integer> parseInteger(String s) {
        try {
            return Optional.of(Integer.valueOf(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
