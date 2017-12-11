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
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public void factors (double sum) {
        
        for (int i = 0; i <= sum; i++) {
            if(sum % i == 0) {
            System.out.println("This number can be divided by: " + i);
        }
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create an object to test
        A7Q3 test = new A7Q3();
        //Create scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double sum = in.nextDouble();
        //Store tahe exam mark
        test.factors(sum);
    }
}
