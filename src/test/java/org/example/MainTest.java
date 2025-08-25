package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Main.isEven;
import static org.example.Main.playFizzBuzz;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void isEven_shouldReturnTrue_withInput2() {
        assertTrue(isEven(2));
    }

    @Test
    void playFizzBuzz_shouldReturnFizz_ifNumberIsDividableBy3() {
        assertEquals("Fizz",playFizzBuzz(99));
    }

    @Test
    void playFizzBuzz_shouldReturnBuzz_ifNumberIsDividableBy5() {
        assertEquals("Buzz",playFizzBuzz(25));
    }

    @Test
    void playFizzBuzz_shouldReturnFizzBuzz_ifNumberIsDividableBy3And5() {
        assertEquals("Fizzbuzz",playFizzBuzz(15));
    }
}