package com.sethkraut.literate.numbers;

import java.util.ArrayList;
import java.util.List;

public class NumbersFor {
    public static void main(String[] args) {
        List<Integer> results = new ArrayList<>();
        for (int i=0; i < 1000; i++) {
            if (i%3 == 0 && i%5 == 0) {
                results.add(i * 2) ;
            }
        }
        System.out.println(results);
    }
}
