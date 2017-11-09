/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author alkam5246
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Request an input
        System.out.println("Please enter in 4 numbers on separate lines:");
        
        //Create a scanner for the user's input.
        Scanner input = new Scanner(System.in);
        Scanner inputTwo = new Scanner(System.in);
        Scanner inputThree = new Scanner(System.in);
        Scanner inputFour = new Scanner(System.in);
        
        //Get the numbers.
        double number = input.nextDouble();
        double numberTwo = inputTwo.nextDouble();
        double numberThree = inputThree.nextDouble();
        double numberFour = inputFour.nextDouble();
        
        //Show the numbers on the same line.
        System.out.println("Your numbers were " + number + ", " + numberTwo + ", " + numberThree + ", and " + numberFour + ".");

    }
}
