package tasksFrom1To21; //

public class Task2BunnyEars {
    // STEP 1: INITIALIZE STRUCTURE & BASE CASE
    // Create method and define the stopping point.
    public int bunnyEars(int n) {
        //Base cause :  If there are no bunnies, there are no ears.
        if (n == 0) return 0;
        if (n % 2 == 0) {
            return 1 + bunnyEars(n / 2);
        }
        return n;
        
    }
}