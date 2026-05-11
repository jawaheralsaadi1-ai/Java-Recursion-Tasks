package tasksFrom1To21;

/**
 * Task 4: Create a Recursive CountX Program in Java
 * Goal: Counting specific lowercase character 'x'
 * appears in a string
 */

public class Task4CountX {
    public int countX(String str) {
        // Base Case: If string is empty, we reached the end of our search.
        if (str == null || str.length() == 0) return 0;

        // Check if the first character is 'x'
        if (str.charAt(0) == 'x') {
            // Found 'x': Add 1 and process the rest of the string
            return 1 + countX(str.substring(1));
        }
        // Not 'x': Just process the rest of the string
        return countX(str.substring(1));
    }
}
//TESTING & VALIDATION
     class CountXDemo{
        public static void main(String[] args) {

            //Call the countX() method using the object
            Task4CountX counter = new Task4CountX();

            // Display the results
            System.out.println("countX('xxhix')->" + counter.countX("xxhixx")); // Expected: 4
            System.out.println("countX('xhixhix')->" + counter.countX("xhixhix")); // Expected: 3
            System.out.println("countX('hi')->" + counter.countX("hi"));// Expected: 0


        }
    }


