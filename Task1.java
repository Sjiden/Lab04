/*
 * @author Luis A. Mendez
 */
// Task 1

/*1)

   The algorithm output the following:
   ...
   ...
   ...
   ...
   ...
   Blastoff!*/

public class Task1 {

//Modified Countdown algorithm that prints only even numbers
    public static void countDown(int num) {
        if (num == 0) {
            System.out.println("Blastoff!");
        } else if (num % 2 == 1) {
          countDown(num - 1);
        } else {
         System.out.println(num);
            countDown(num - 2);
        }
    }
    
/* 2)
    
   The time complexity of this algorithm is O(n) because the input determines the
   number of operations that are done. If the input, int num, is not 0, it will 
   the function recursively num times.*/
