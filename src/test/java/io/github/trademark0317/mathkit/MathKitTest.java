package io.github.trademark0317.mathkit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

// Unit tests for every public method in the MathKit library
class MathKitTest {

    // Verifies basic addition
    @Test
    void addReturnsSum() {
        assertEquals(5.0, MathKit.add(2, 3));
    }

    // Verifies basic subtraction
    @Test
    void subtractReturnsDifference() {
        assertEquals(2.0, MathKit.subtract(5, 3));
    }

    // Verifies basic multiplication
    @Test
    void multiplyReturnsProduct() {
        assertEquals(6.0, MathKit.multiply(2, 3));
    }

    // Verifies division and the divide-by-zero error
    @Test
    void divideHandlesNormalAndZero() {
        assertEquals(2.5, MathKit.divide(10, 4));
        assertThrows(ArithmeticException.class, () -> MathKit.divide(1, 0));
    }

    // Verifies modulus and the modulus-by-zero error
    @Test
    void modulusHandlesNormalAndZero() {
        assertEquals(1.0, MathKit.modulus(10, 3));
        assertThrows(ArithmeticException.class, () -> MathKit.modulus(1, 0));
    }

    // Verifies exponentiation, including a zero exponent
    @Test
    void powerReturnsCorrectValue() {
        assertEquals(256.0, MathKit.power(2, 8));
        assertEquals(1.0, MathKit.power(7, 0));
    }

    // Verifies square root and the negative-input error
    @Test
    void squareRootHandlesNormalAndNegative() {
        assertEquals(9.0, MathKit.squareRoot(81));
        assertThrows(IllegalArgumentException.class, () -> MathKit.squareRoot(-1));
    }

    // Verifies percentage calculation
    @Test
    void percentageReturnsPortion() {
        assertEquals(30.0, MathKit.percentage(200, 15));
    }

    // Verifies average and the empty-input error
    @Test
    void averageHandlesValuesAndEmpty() {
        assertEquals(9.0, MathKit.average(4, 8, 15));
        assertThrows(IllegalArgumentException.class, () -> MathKit.average());
    }

    // Verifies factorial, including edge values and out-of-range errors
    @Test
    void factorialHandlesRange() {
        assertEquals(1L, MathKit.factorial(0));
        assertEquals(120L, MathKit.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> MathKit.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> MathKit.factorial(21));
    }

    // Verifies prime detection for primes, non-primes, and small numbers
    @Test
    void isPrimeDetectsCorrectly() {
        assertTrue(MathKit.isPrime(2));
        assertTrue(MathKit.isPrime(17));
        assertFalse(MathKit.isPrime(1));
        assertFalse(MathKit.isPrime(15));
    }
}