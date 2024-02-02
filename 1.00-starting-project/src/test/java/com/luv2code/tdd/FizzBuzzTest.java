package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {
    //If number is divisible
    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
    void testForDivisibleByThree(){
        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }

    //If number is divisible
    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    void testForDivisibleByFive(){
        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }
    //If number is divisible
    @DisplayName("Divisible by three and Five")
    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive(){
        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }//If number is divisible
    @DisplayName("Divisible by neither")
    @Test
    @Order(4)
    void testForDivisibleByNeither(){
        String expected = "1";

        assertEquals(expected, FizzBuzz.compute(1), "Should return 1");
    }
}
