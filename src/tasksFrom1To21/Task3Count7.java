package tasksFrom1To21;

import java.util.Scanner;

public class Task3Count7 {
    // STEP 1: INITIALIZE STRUCTURE & BASE CASE
    // Create method and define the stopping point.
    public int count7(int n) {
        //Base cause :If the number is 0, we have finished checking all digits.
        if (n == 0) {
            return 0;
        }

        // STEP 2: IMPLEMENT CONDITIONAL RECURSION
        // Logic 1 : Check if the current last digit is 7
        if (n % 10 == 7) {
            // Found a 7: Add 1 and continue with rest number (n / 10)
            return 1 + count7(n / 10); }
        // Not a 7 : continue the rest number (n / 10)
            else {
                return count7(n / 10);
            }
        }
    }
//STEP 3 :  TESTING & VALIDATION
// create another named Count7Demo Class for Testing
 class Count7DEmo{
    //Create main Method and object
    public static void main(String[] args) {
     // Create an object 'counter' of the Count7 class
        Task3Count7 counter = new Task3Count7();
         // Call & Test with value of 717 , 7 , and 123
        // Display the results
        System.out.println("count7(717) -> " + counter.count7(717)); // Expected: 2
        System.out.println("count7(7)   -> " + counter.count7(7));   // Expected: 1
        System.out.println("count7(123) -> " + counter.count7(123)); // Expected: 0
    }
}