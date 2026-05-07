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

        //Create an object of the class()
        Task2BunnyEars bunnyManager = new Task2BunnyEars();

        // Testing based on task requirements
        System.out.println("bunnyEars2(0) -> " + bunnyManager.bunnyEars(0)); // Expected: 0
        System.out.println("bunnyEars2(1) -> " + bunnyManager.bunnyEars(1)); // Expected: 2
        System.out.println("bunnyEars2(2) -> " + bunnyManager.bunnyEars(2)); // Expected: 5 (3+2)
    }

    }

