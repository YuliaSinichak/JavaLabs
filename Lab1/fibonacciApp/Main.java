package fibonacciApp;

import java.util.Scanner;

/**
 * Main class that executes the program.
 * It prompts the user to enter a number N and calculates the N-th Fibonacci number.
 */
public class Main {

    /**
     * The main method where the program starts.
     * It asks the user to input a number and outputs the corresponding Fibonacci number.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int n = getUserInput();

        // Create and calculate the Fibonacci sequence for the input value.
        NumberSequence sequence = new Fibonacci(n);
        System.out.println("N-th Fibonacci number: " + sequence.calculate());
    }

    /**
     * Method to read a valid integer input from the user.
     * Re-prompts the user until a valid integer is entered.
     * 
     * @return The valid integer input.
     */
    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        
        while (true) {
            System.out.print("Enter a non-negative integer N: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    break; // Exit loop if valid non-negative integer
                } else {
                    System.out.println("Please enter a negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Discard invalid input
            }
        }
        
        scanner.close(); // Close the scanner to prevent resource leak
        return n;
    }
}
