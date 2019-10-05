package com.sethkraut.literate.simple;

import com.sethkraut.literate.Person;

import java.util.Optional;

/**
 *
 */
public class OptionalExample {
    public static void main(String[] args) {
        System.out.println(
            Optional.of(new Person("Joe", "Maxwell", 45))
                .map(Person::getFirstName)
                .orElse("None")
        );

        System.out.println(
            Optional.of(new Person("Prince", null, 45))
                .map(Person::getLastName)
                .orElse("None")
        );
    }
}
