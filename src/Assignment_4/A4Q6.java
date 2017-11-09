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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Ask for the speed limit
        System.out.println("Enter the speed limit:");

        //Scan the answer:
        Scanner firstTotal = new Scanner(System.in);

        //Get the number.
        double limit1 = firstTotal.nextDouble();

        //Scan for what the car's speed was.
        System.out.println("Enter the recorded speed of your car:");

        //Scan the answer.
        Scanner firstCar = new Scanner(System.in);

        //Get the answer's number.
        double speed1 = firstCar.nextDouble();

        if (limit1 > speed1 - 31 == false) {
            System.out.println("You are speeding and your fine is $500");
        } else {
            if (limit1 > speed1 - 21 == false) {
                System.out.println("You are speeding and your fine is $270");
            } else {
                if (limit1 > speed1 - 20 == false || limit1 > speed1 ==  false) {
                    System.out.println("You are speeding and your fine is $100");
                } else {
                System.out.println("Congratulations, you are within the speed limit!");
            } 
        }
}
    }
}
