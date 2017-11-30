/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;

/**
 *
 * @author alkam5246
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Ask for two integers
        System.out.println("Enter two integers: ");

        //Scan, create, and accept two integers
        Scanner i = new Scanner(System.in);
        int[] ints = new int[2];
        ints[0] = i.nextInt();
        ints[1] = i.nextInt();
        
        if (ints[0] < ints [1]) {
            System.out.println("The integers in ascending order are: " + ints[0] + ", " + ints[1]);
        } else {
            System.out.println("The integers in ascending order are: " + ints[1] + ", " + ints[0]);
        }
    }
}