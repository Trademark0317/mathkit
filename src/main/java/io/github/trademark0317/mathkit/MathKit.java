package io.github.trademark0317.mathkit;

/**
 * MathKit is a lightweight utility library providing common arithmetic
 * and number operations. All methods are static, so no instance is needed.
 *
 * <p>Example: {@code double result = MathKit.add(2, 3); // 5.0}</p>
 *
 * @author Trenton Closs
 * @version 1.0.0
 */
public final class MathKit {

    // Private constructor prevents instantiation of this utility class
    private MathKit() {
    }

    /**
     * Adds two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     *
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return the difference a - b
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient a / b
     * @throws ArithmeticException if b is zero
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Returns the remainder of dividing the first number by the second.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the remainder of a / b
     * @throws ArithmeticException if b is zero
     */
    public static double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot perform modulus by zero");
        }
        return a % b;
    }

    /**
     * Raises a base to an exponent.
     *
     * @param base     the base
     * @param exponent the exponent
     * @return base raised to the power of exponent
     */
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Returns the square root of a number.
     *
     * @param value the number
     * @return the square root of value
     * @throws IllegalArgumentException if value is negative
     */
    public static double squareRoot(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Cannot take square root of a negative number");
        }
        return Math.sqrt(value);
    }

    /**
     * Calculates a percentage of a value (e.g. 25 percent of 200 is 50).
     *
     * @param value   the base value
     * @param percent the percentage to take
     * @return percent of value
     */
    public static double percentage(double value, double percent) {
        return (value * percent) / 100;
    }

    /**
     * Calculates the average of one or more numbers.
     *
     * @param values the numbers to average
     * @return the arithmetic mean of the values
     * @throws IllegalArgumentException if no values are given
     */
    public static double average(double... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("At least one value is required");
        }
        double sum = 0;
        for (double v : values) {
            sum += v;
        }
        return sum / values.length;
    }

    /**
     * Calculates the factorial of a non-negative integer (n!).
     *
     * @param n a number from 0 to 20
     * @return n factorial
     * @throws IllegalArgumentException if n is negative or greater than 20
     */
    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Checks whether a number is prime.
     *
     * @param n the number to check
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; (long) i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}