package tasksFrom1To21; //

public class Task2BunnyEars {
    // STEP 1: INITIALIZE STRUCTURE & BASE CASE
    // Create method and define the stopping point.
    public int bunnyEars(int n) {
        //Base cause :  If there are no bunnies, there are no ears.
        if (n == 0) return 0;
        // STEP 2: IMPLEMENT CONDITIONAL RECURSION
        // Implement Even/Odd logic
        if (n % 2 == 0){ // Check if the current bunny index is Even
            return 3 + bunnyEars(n - 1);
        }
        else { //Otherwise  the curren bunny index is Odd
            return 2 + bunnyEars(n - 1);
        }
    }
}
//STEP 3: TESTING & VALIDATION
// Create another Class named BunnyEarsDemo for Testing
class  BunnyEarsDemo {
    // Create main Method and Create object
    public static void main(String[] args) {
        //Create an object(bunnyManager) of the Task2BunnyEars class
        Task2BunnyEars bunnyManager = new Task2BunnyEars();
        /* Call the bunnyEars() method using the object */
        int result0 = bunnyManager.bunnyEars(0); // Call & Test the method with value of 0
        int result1 = bunnyManager.bunnyEars(1); // Call & Test the method with value of 1
        int result2 = bunnyManager.bunnyEars(2); // Call & Test the method with value of 2

        // Display the results using System.out.println()
        System.out.println("ResultN=0: " + result0);
        System.out.println("ResultN=1: " + result1);
        System.out.println("ResultN=2: " + result2);





    }
}

