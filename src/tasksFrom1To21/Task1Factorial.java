package tasksFrom1To21;//


// Task 1: Factorial Calculation
// Goal : Recursive method to calculate n!
public class Task1Factorial {

    //Create a method named factorial
    public int Factorial(int n) {
        if (n == 1) {
            return 1; // Base case: factorial of 1 is
        }
        return n * Factorial(n - 1); // Recursive case: n * (n-1)!
    }
}
class factorialDemo {
    static void main() {
        Task1Factorial obj = new Task1Factorial();

// Testing with values 1, 2, and 3 and display results for Factorial
        System.out.println("factorial(1) -> " + obj.Factorial(1));
        System.out.println("factorial(2) -> " + obj.Factorial(2));
        System.out.println("factorial(3) -> " + obj.Factorial(3));
    }
}