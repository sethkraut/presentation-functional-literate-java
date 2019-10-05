package com.sethkraut.literate;

import lombok.Builder;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Generates random people.
 */
@Builder
public class RandomPersonGenerator {
    @Builder.Default
    private Random random = new Random();
    private List<String> firstNames;
    private List<String> lastNames;
    private int maximumAge;

    public static RandomPersonGenerator sample() {
        return builder()
                .firstNames(Arrays.asList("Joe", "Mary", "Bob", "Amber"))
                .lastNames(Arrays.asList("Doe", "Johnson", "Cunningham", "Maxwell"))
                .maximumAge(90)
                .build();
    }

    public Person newPerson() {
        return new Person(
                randomFrom(firstNames),
                randomFrom(lastNames),
                random.nextInt(maximumAge)
        );
    }

    private String randomFrom(List<String> values) {
        return values.get(random.nextInt(values.size()));
    }
}
