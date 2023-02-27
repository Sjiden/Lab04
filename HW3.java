
/**
 *
 * @author Luis A. Mendez
 */

public class HW3 {
	
	
//Function performs a binary search using recursion    
    public static int findNum(int[] numArray, int left, int right, int userNum) {
        if (left > right) {
            return -1;
        }
        
        int mid = (left + right) / 2; 
        if (numArray[mid] == userNum) {
            return mid;
        } else if (userNum < numArray[mid]) {
            return findNum(numArray, left, mid - 1, userNum); 
        } else {
            return findNum(numArray, mid + 1, right, userNum); 
        }
    }
    
//Set the parameters of the findNum function and call the function    
    public static void main(String[] args) {
        int[] numArray = {1, 3, 5, 7, 9}; // Sorted numArrayay to search
        int userNum = 5; // userNum element to search for
        int index = findNum(numArray, 0, numArray.length - 1, userNum); 
        if (index == -1) {
            System.out.println(userNum + " is not in the array.");
        } else {
            System.out.println(userNum + " is at index " + index); 
        }
    }
}


