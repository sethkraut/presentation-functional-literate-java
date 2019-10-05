package com.sethkraut.literate;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 */
@AllArgsConstructor
@Getter
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isAdult() {
        return age >= 18;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
