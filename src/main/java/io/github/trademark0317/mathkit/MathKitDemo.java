package io.github.trademark0317.mathkit;

/**
 * Executable entry point that demonstrates the MathKit library.
 * Run with: java -jar mathkit-1.0.0.jar
 */
public class MathKitDemo {

    /**
     * Prints example results for each MathKit operation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("MathKit 1.0.0 demo");
        System.out.println("------------------");
        System.out.println("add(2, 3)            = " + MathKit.add(2, 3));
        System.out.println("subtract(5, 3)       = " + MathKit.subtract(5, 3));
        System.out.println("multiply(2, 3)       = " + MathKit.multiply(2, 3));
        System.out.println("divide(10, 4)        = " + MathKit.divide(10, 4));
        System.out.println("modulus(10, 3)       = " + MathKit.modulus(10, 3));
        System.out.println("power(2, 8)          = " + MathKit.power(2, 8));
        System.out.println("squareRoot(81)       = " + MathKit.squareRoot(81));
        System.out.println("percentage(200, 15)  = " + MathKit.percentage(200, 15));
        System.out.println("average(4, 8, 15)    = " + MathKit.average(4, 8, 15));
        System.out.println("factorial(5)         = " + MathKit.factorial(5));
        System.out.println("isPrime(17)          = " + MathKit.isPrime(17));
    }
}