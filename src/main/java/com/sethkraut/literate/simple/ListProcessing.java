package com.sethkraut.literate.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListProcessing {
    public static void main(String[] args) {
        List<Object> mixedList = new ArrayList<>();

        List<String> justStrings =
                mixedList.stream()
                        .filter(Objects::nonNull)
                        .filter(String.class::isInstance)
                        .map(String.class::cast)
                        .collect(Collectors.toList());
    }
}
