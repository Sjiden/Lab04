/**
 *
 * @author Luis A. Mendez
 */

public class HW2 {
    
//Find the sum for every multple of seven within a user specified range recursively
    public static int sum(int n1, int n2) {
        if (n1 > n2) {
            return 0;
        } else if (n1 % 7 == 0) {
            return n1 + sum(n1 + 7, n2);
        } else {
            return sum(n1 + 1, n2); 
    }
 
 //Sets the range for and calls the sum funtion       
    public static void main(String[] args) {
        int n1 = 1; // Start of range
        int n2 = 21; // End of range
        int sum = sum(n1, n2); // Call the recursive function
        System.out.println("The sum of the multiples of 7 is: " + sum); // Print the result
    }
}

