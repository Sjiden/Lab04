public class HW1 {
    
    public static void printHelloWorld(int n) {
        if (n == 0) {
            return; // Base case: stop recursion when n is 0
        }
        
        System.out.println("Hello World"); // Print "Hello World"
        printHelloWorld(n - 1); // Recursive call with n-1
    }
    
    public static void main(String[] args) {
        int n = 5; // Number of times to print "Hello World"
        printHelloWorld(n); // Call the recursive function
    }
}