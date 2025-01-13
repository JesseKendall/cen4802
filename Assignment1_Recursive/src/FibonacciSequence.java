/**
 * This method calculates a number in the Fibonacci sequence based on its position.
 *
 * The Fibonacci sequence is a series of numbers where each number is the sum
 * of the two numbers before it. The sequence starts like this: 0, 1, 1, 2, 3, 5, 8, ...
 *
 * For example:
 * - fibonacci(0) returns 0 (the first number in the sequence)
 * - fibonacci(1) returns 1 (the second number in the sequence)
 * - fibonacci(5) returns 5 (the sixth number in the sequence)
 *
 * @param n the position in the Fibonacci sequence (starting from 0)
 * @return the Fibonacci number at the given position
 */

public class FibonacciSequence {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result);
    }
}
