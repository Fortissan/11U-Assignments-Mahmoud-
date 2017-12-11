/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

import java.util.Scanner;

/**
 *
 * @author alkam5246
 */
public class A7Q7 {

    public double firstDigit(int sum) {

        //Account for negative numbers
        if (sum < 0) {
            sum = sum - sum - sum;
        }
        if (sum > 10 || (sum > -1)) {
            while (sum > 10) {
                //Figure out the first digit in the sum
                int answer = sum / 10;
                sum = (int) Math.ceil(answer);
            }
            if (sum < 0) {
                sum = sum - sum - sum;
            }
        }

        //send back the answer
        return sum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Make a test for the method
        A7Q7 test = new A7Q7();
        //Get a number inputted
        System.out.println("Give me a number!: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        //Send the inputted number through the method
        int digit = (int) test.firstDigit(num);

        //Print out the end digit
        System.out.println("Your number's first digit is: " + digit);
    }
}