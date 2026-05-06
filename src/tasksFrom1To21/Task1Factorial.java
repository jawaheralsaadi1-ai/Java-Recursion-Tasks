package tasksFrom1To21;//

import java.util.Scanner;

// Task 1: Factorial Calculation
// Goal : Recursive method to calculate n!
public class Task1Factorial {

    //Create a method named factorial
    public int factorial(int n) {
        if (n == 1) {
            return 1; // Base case: factorial of 1 is
        }
        return n * factorial(n - 1); // Recursive case: n * (n-1)!
    }
}
class factorialDemo {
    public static void main(String[] args ) {
        Task1Factorial obj = new Task1Factorial();

    }
}