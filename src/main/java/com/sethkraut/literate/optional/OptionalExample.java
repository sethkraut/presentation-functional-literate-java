package com.sethkraut.literate.optional;

import java.util.Optional;

/**
 * Convert a String to a number or return 0.
 */
public class OptionalExample {
    public static void main(String[] args) {
        System.out.println(toInteger("45"));
    }

    private static int toInteger(String value) {
        return Optional.of(value)
            .map(Integer::valueOf)
            .orElse(0);
        // There's a problem here.
    }
}
