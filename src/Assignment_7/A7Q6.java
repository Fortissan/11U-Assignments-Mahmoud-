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
public class A7Q6 {

    public double lastDigit (int sum) {
        
        //Figure out the final digit in the sum
        int answer = sum % 10;
        if (answer < 0) {
            answer = answer - answer - answer;
        }
        //send back the answer
        return answer;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make a test for the method
        A7Q6 test = new A7Q6();
        //Get a number inputted
        System.out.println("Give me a number!: ");
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        
        //Send the number through the method
        int digit = (int) test.lastDigit(num);
        
        //Print out the end digit
        System.out.println("Your number's last digit is: " + digit);
    }
}
