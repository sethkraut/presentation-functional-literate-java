package com.sethkraut.literate.word;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * DSL for words
 */
public class Words {

    public static Function<String, Stream<String>> fromSentence() {
        return s -> {
            return Arrays.stream(s.split(" "))
                .map(remove(",", "\\."));
        };
    }

    private static Function<String, String> remove(String... toRemove) {
        return s -> {
            for (String remove : toRemove) {
                s = s.replaceAll(remove, "");
            }
            return s;
        };
    }

    public static Predicate<String> longerThan(int size) {
        return s -> s.length() > size;
    }

    public static Predicate<String> shorterThan(int size) {
        return s -> s.length() < size;
    }

    public static Predicate<String> startingWIth(String start) {
        return s -> s.startsWith(start);
    }

    public static Predicate<String> endingWIth(String start) {
        return s -> s.startsWith(start);
    }
}
