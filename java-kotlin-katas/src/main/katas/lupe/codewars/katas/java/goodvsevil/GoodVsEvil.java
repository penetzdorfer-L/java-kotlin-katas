package lupe.codewars.katas.java.goodvsevil;


//worths:
//    Hobbits 1
//    Man 2
//    Elves 3
//    Dwarves 3
//    Eagles 4
//    Wizzards 10
//
//    Orcs 1
//    Men 2
//    Wargs 2
//    Goblins 2
//    Uruk Hai 3
//    Trolls 5
//    Wizzards 10

import java.util.Arrays;
import java.util.stream.IntStream;

public class GoodVsEvil {
    public String battle(String goodAmounts, String evilAmounts) {
        int[] goodWorth = new int[]{1, 2, 3, 3, 4, 10};
        int[] evilWorth = new int[]{1, 2, 2, 2, 3, 5, 10};
        int goodArmy = getAmount(goodAmounts, goodWorth);
        int evilArmy = getAmount(evilAmounts, evilWorth);
        return goodArmy > evilArmy ? "Battle Result: Good triumphs over Evil"
                : goodArmy < evilArmy ? "Battle Result: Evil eradicates all trace of Good"
                : "Battle Result: No victor on this battle field";
    }
    private int getAmount(String amounts, int[] worths) {
        int[] converted = Arrays.stream(amounts.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        return IntStream.rangeClosed(0, worths.length-1)
                .map(el->converted[el]*worths[el])
                .sum();
    }
}