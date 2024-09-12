package fibonacciApp;

/**
 * Class for calculating Fibonacci numbers.
 * It inherits from the NumberSequence class.
 */
public class Fibonacci extends NumberSequence {

    /**
     * Constructor for Fibonacci sequence, sets the number N.
     * 
     * @param n The position of the Fibonacci number to calculate.
     */
    public Fibonacci(int n) {
        super(n);
    }

    /**
     * Method to calculate the N-th Fibonacci number.
     * If N <= 0, returns 0. If N == 1, returns 1.
     * For N >= 2, it iterates to calculate the N-th Fibonacci number.
     * 
     * @return The N-th Fibonacci number.
     */
    @Override
    public int calculate() {
        if (n == 0) return 0;
        if (n == 1 || n == -1) return 1;
        int a = 0, b = 1;
        for (int i = -2; i >= n; i--) {
            int tmp = a - b;
            a = b;
            b = tmp;
        }
        return b;
    
    }
}
