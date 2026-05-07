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



