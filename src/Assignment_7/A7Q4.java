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
public class A7Q4 {

    public double compoundInterest(double initial, double rate, int time) {
        //calculate answer
        //B=P(1+r)^n
        double total = (1 + rate);
        double answer = initial * Math.pow(total, time);
        //send back the answer
        return answer;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make an object
        A7Q4 test = new A7Q4();
        //Get your intial amount and turn it into a double
        System.out.println("Enter your initial amount:");
        Scanner in = new Scanner(System.in);
        double i = in.nextDouble();
        
        //Get your interest rate and turn it into a double
        System.out.println("Enter your interest rate:");
        Scanner in2 = new Scanner(System.in);
        double r = in2.nextDouble();
        
        //Get the length of time (in years) and turn it into an integer.
        System.out.println("Enter the amount of years passed:");
        Scanner in3 = new Scanner(System.in);
        int y = in3.nextInt();
        
        //Use the function
        double answer = test.compoundInterest(i, r, y);
        
        System.out.println("Your new balance is: " + answer);
    }
}
