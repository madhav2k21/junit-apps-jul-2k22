package com.techleads.app.tdd;

import java.util.function.Predicate;

public class FizzBuzz {

    private final static String FIZZ_BUZZ = "FizzBuzz";
    private final static String FIZZ = "Fizz";
    private final static String BUZZ = "Buzz";

    public static String compute(int num) {

        Predicate<Integer> divisibleBy3 = (a) -> a % 3 == 0;
        Predicate<Integer> divisibleBy5 = (a) -> a % 5 == 0;
        Predicate<Integer> divisibleBy3AndDivisibleBy5 = divisibleBy3.and(divisibleBy5);
        return (divisibleBy3AndDivisibleBy5.test(num)) ? FIZZ_BUZZ : (divisibleBy3.test(num) ? FIZZ : (divisibleBy5.test(num) ? BUZZ : String.valueOf(num)));
    }
}
