package com.techleads.app.tdd;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FizzBuzzTest {

    //if number is divisible by 3, print Fizz
    //if number is divisible by 5, print Buzz

    //if number is divisible by 3 and 5 print FizzBuzz

    //if number is not divisible by 3 and 5, print number

    @Test
    @DisplayName("{1} testForDivisibleBy3()")
    void testForDivisibleBy3() {
        String expected="Fizz";
        assertEquals(expected,FizzBuzz.compute(6));
    }

    @Test
    @DisplayName("{2} testForDivisibleBy5()")
    void testForDivisibleBy5() {

        String expected="Buzz";
        assertEquals(expected,FizzBuzz.compute(5));
        assertEquals(String.valueOf(4),FizzBuzz.compute(4));
    }

    @Test
    @DisplayName("{3} testForDivisibleBy3AndDivisibleBy5()")
    void testForDivisibleBy3AndDivisibleBy5() {

        String expected="FizzBuzz";
        assertEquals(expected,FizzBuzz.compute(15));
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(ints = {19,23,1,28})
    @DisplayName("{4} testForNotDivisibleBy3AndDivisibleBy5()")
    void testForNotDivisibleBy3AndDivisibleBy5(int num) {

        assertEquals(String.valueOf(num),FizzBuzz.compute(num));
    }


    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @DisplayName("{5} testDivisibleBy3Or5WithCSVSourceFile()")
    void testDivisibleBy3Or5WithCSVSourceFile(int value, String expected) {

        assertEquals(expected,FizzBuzz.compute(value));
    }

    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            "4, 4",
            "5, Buzz",
            "6, Fizz",
            "7, 7",
            "8, 8",
            "9, Fizz",
            "10, Buzz",
            "11, 11",
            "12, Fizz",
            "13, 13",
            "14, 14",
            "15, FizzBuzz"
    })
    @DisplayName("{6} testDivisibleBy3Or5WithCSVSource()")
    void testDivisibleBy3Or5WithCSVSource(int value, String expected) {

        assertEquals(expected, FizzBuzz.compute(value));
    }


    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    @DisplayName("{7} testDivisibleBy3Or5WithCSVSourceFileMedium()")
    void testDivisibleBy3Or5WithCSVSourceFileMedium(int value, String expected) {

        assertEquals(expected,FizzBuzz.compute(value));
    }

    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/large-test-data.csv")
    @DisplayName("{8} testDivisibleBy3Or5WithCSVSourceFileLarge()")
    void testDivisibleBy3Or5WithCSVSourceFileLarge(int value, String expected) {

        assertEquals(expected,FizzBuzz.compute(value));
    }
}



