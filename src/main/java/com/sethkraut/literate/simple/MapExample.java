package com.sethkraut.literate.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 */
public class MapExample {
    public static void main(String[] args) {
        new Random().ints(10, 1, 99)
                .boxed()
                .sorted()
                .map(eaglesRoster()::get)
        .forEachOrdered(System.out::println);
    }

    private static Map<Integer, String> eaglesRoster() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Cameron Johnston",	1);
        map.put("Jake Elliott",	4);
        map.put("Nate Sudfeld",	7);
        map.put("DeSean Jackson"	,10);
        map.put("Carson Wentz"	,11);
        map.put("Nelson Agholor"	,13);
        map.put("Mack Hollins"	,16);
        map.put("Alshon Jeffery"	,17);
        map.put("Josh McCown"	,18);
        map.put("J.J. Arcega-Whiteside"	,19);
        map.put("Ronald Darby"	,21);
        map.put("Sidney Jones"	,22);
        map.put("Rodney McLeod"	,23);
        map.put("Jordan Howard"	,24);
        map.put("Miles Sanders"	,26);
        map.put("Malcolm Jenkins"	,27);
        map.put("Avonte Maddox"	,29);
        map.put("Corey Clement"	,30);
        map.put("Rasul Douglas"	,32);
        map.put("Rudy Ford"	,36);
        map.put("Ryan Lewis"	,37);
        map.put("Orlando Scandrick"	,38);
        map.put("Craig James"	,39);
        map.put("Andrew Sendejo"	,42);
        map.put("Darren Sproles"	,43);
        map.put("Rick Lovato"	,45);
        map.put("Nathan Gerry"	,47);
        map.put("Duke Riley"	,50);
        map.put("Shareef Miller"	,51);
        map.put("Zach Brown"	,52);
        map.put("Nigel Bradham"	,53);
        map.put("Kamu Grugier-Hill"	,54);
        map.put("Brandon Graham"	,55);
        map.put("T.J. Edwards"	,57);
        map.put("Jason Kelce"	,62);
        map.put("Lane Johnson"	,65);
        map.put("Akeem Spence"	,66);
        map.put("Nate Herbig"	,67);
        map.put("Matt Pryor"	,69);
        map.put("Jason Peters"	,71);
        map.put("Halapoulivaati Vaitai"	,72);
        map.put("Isaac Seumalo"	,73);
        map.put("Daeshon Hall"	,74);
        map.put("Vinny Curry"	,75);
        map.put("Andre Dillard"	,77);
        map.put("Brandon Brooks"	,79);
        map.put("Zach Ertz"	,86);
        map.put("Dallas Goedert"	,88);
        map.put("Fletcher Cox"	,91);
        map.put("Tim Jernigan"	,93);
        map.put("Josh Sweat"	,94);
        map.put("Derek Barnett"	,96);
        map.put("Hassan Ridgeway"	,98);
        return map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }
}
