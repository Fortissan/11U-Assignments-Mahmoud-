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
public class A4Q2 {

    private static double Cm;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Request a measurement in inches
        System.out.println("Please enter the measurement in inches you wish to convert:");
        Scanner input = new Scanner(System.in);

        //Get inches
        
        double inches = input.nextDouble();

        //Convert inches to centimeters
        double Cm = inches * 2.54;

        //Print out calculation
        System.out.println(inches + " inches is the same as " + Cm + " cm.");

    }
}
