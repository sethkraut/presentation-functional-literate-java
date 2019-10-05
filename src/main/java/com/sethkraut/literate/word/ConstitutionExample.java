package com.sethkraut.literate.word;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConstitutionExample {
    static List<String> constitution =
            Arrays.asList("We the People of the United States, in Order to form a more perfect Union, establish Justice, insure domestic Tranquility, provide for the common defense, promote the general Welfare, and secure the Blessings of Liberty to ourselves and our Posterity, do ordain and establish this Constitution for the United States of America.",
                    "All legislative Powers herein granted shall be vested in a Congress of the United States, which shall consist of a Senate and House of Representatives.",
                    "The House of Representatives shall be composed of Members chosen every second Year by the People of the several States, and the Electors in each State shall have the Qualifications requisite for Electors of the most numerous Branch of the State Legislature.",
                    "No Person shall be a Representative who shall not have attained to the Age of twenty five Years, and been seven Years a Citizen of the United States, and who shall not, when elected, be an Inhabitant of that State in which he shall be chosen.",
                    "Representatives and direct Taxes shall be apportioned among the several States which may be included within this Union, according to their respective Numbers, which shall be determined by adding to the whole Number of free Persons, including those bound to Service for a Term of Years, and excluding Indians not taxed, three fifths of all other Persons. The actual Enumeration shall be made within three Years after the first Meeting of the Congress of the United States, and within every subsequent Term of ten Years, in such Manner as they shall by Law direct. The Number of Representatives shall not exceed one for every thirty Thousand, but each State shall have at Least one Representative; and until such enumeration shall be made, the State of New Hampshire shall be entitled to chuse three, Massachusetts eight, Rhode-Island and Providence Plantations one, Connecticut five, New-York six, New Jersey four, Pennsylvania eight, Delaware one, Maryland six, Virginia ten, North Carolina five, South Carolina five, and Georgia three.");

    public static void main(String[] args) {
        Map<String, Integer>  wordCounts = constitution.stream()
                .flatMap(splitOn(" "))
                .map(remove(",", "\\."))
                .map(String::toLowerCase)
                .filter(longerThan(3))
                .collect(countInstances());

        System.out.println(wordCounts);

    }

    private static Collector<String, ?, Map<String, Integer>> countInstances() {
        return Collectors.toMap(Function.identity(), s -> 1, (a, b) -> a + b);
    }

    private static Predicate<String> startsWIth(String start) {
        return s -> s.startsWith(start);
    }

    private static Predicate<String> longerThan(int size) {
        return s -> s.length() > size;
    }

    private static Function<String, Stream<String>> splitOn(String splitOn) {
        return s -> Arrays.stream(s.split(splitOn));
    }

    private static Function<String, String> remove(String... toRemove) {
        return s -> {
            for (String remove : toRemove) {
                s = s.replaceAll(remove, "");
            }
            return s;
        };
    }
}
