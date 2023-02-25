/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Luis A. Mendez
 */


//Task 2
 
public class Task2 {
    
/*This code outputs the following:
 36 12
    
*/
    
//Modified code using subtraction instead of %    
    public static int gcd(int x, int y) {
    if (x == y) {
        return x;
    } else if (x > y) {
        return gcd(x - y, y);
    } else {
        return gcd(x, y - x);
    }
}

}






