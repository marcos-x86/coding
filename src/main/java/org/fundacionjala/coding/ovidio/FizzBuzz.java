package org.fundacionjala.coding.ovidio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OvidioMiranda on 8/25/2017.
 */
public class FizzBuzz {
    private List<String> number;
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    /**
     *
     */
    public FizzBuzz() {
        number = new ArrayList<>();
    }

    /**
     * FizzBuzzOf.
     *
     * @param number int.
     * @return string.
     */
    public String fizzBuzzOf(int number) {
        boolean modThree = number % 3 == 0;
        boolean modFive = number % 5 == 0;
        if (modThree && modFive) {
            return FIZZ_BUZZ;
        }
        return modThree ? FIZZ : modFive ? BUZZ : Integer.toString(number);
    }

    /**
     * Print Numbers for Game.
     *
     * @param until int.
     */
    public void printNumbers(int until) {
        for (int i = 1; i <= until; i++) {
            number.add(fizzBuzzOf(i));
        }
    }

    /**
     * Counter.
     *
     * @param name String.
     * @return long.
     */
    public long counter(String name) {
        return number.stream()
                .filter(x -> name.equals(x))
                .count();
    }
}
