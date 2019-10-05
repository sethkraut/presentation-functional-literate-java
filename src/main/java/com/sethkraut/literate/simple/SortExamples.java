package com.sethkraut.literate.simple;

import com.sethkraut.literate.Person;
import com.sethkraut.literate.RandomPersonGenerator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

/**
 *
 */
public class SortExamples {
    public static void main(String[] args) {
        RandomPersonGenerator generator = RandomPersonGenerator.sample();

        Stream.generate(generator::newPerson)
                .limit(20)
                .sorted(comparingInt(Person::getAge))
                .collect(Collectors.toList());


        Stream.generate(generator::newPerson)
                .limit(20)
                .sorted(comparing(Person::getFullName)
                        .thenComparing(Person::getLastName)
                        .thenComparingInt(Person::getAge))
                .collect(Collectors.toList());
    }
}
