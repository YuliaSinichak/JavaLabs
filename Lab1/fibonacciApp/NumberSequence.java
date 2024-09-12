package fibonacciApp;

/**
 * Abstract class representing a number sequence.
 * It serves as a base class for specific sequences like Fibonacci.
 */
public abstract class NumberSequence {
    protected int n;

    /**
     * Constructor that sets the number N for the sequence.
     * 
     * @param n The position of the number in the sequence.
     */
    public NumberSequence(int n) {
        this.n = n;
    }

    /**
     * Abstract method to calculate the N-th number in the sequence.
     * 
     * @return The N-th number in the sequence.
     */
    public abstract int calculate();

    /**
     * Getter method for the number N.
     * 
     * @return The position N.
     */
    public int getN() {
        return n;
    }
}
