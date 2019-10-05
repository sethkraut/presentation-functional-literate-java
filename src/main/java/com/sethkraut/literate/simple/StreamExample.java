package com.sethkraut.literate.simple;

import com.sethkraut.literate.Person;
import com.sethkraut.literate.RandomPersonGenerator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 */
public class StreamExample {
    public static void main(String[] args) {
        RandomPersonGenerator randomPerson = RandomPersonGenerator.sample();

        System.out.println(
                Stream.generate(randomPerson::newPerson)
                        .limit(6)
                        .filter(Person::isAdult)
                        .map(Person::getFirstName)
                        .collect(Collectors.joining(","))
        );

    }
}
