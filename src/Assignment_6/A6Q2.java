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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Ask for all heights to be inputted
        System.out.println("How many heights are being inputted: ");

        //Scan and make an array for the heights
        Scanner in = new Scanner(System.in);
        int heights = in.nextInt();
        double[] people = new double[heights];

        //Enter all heights
        System.out.println("Enter all heights (inches): ");
        for (int i = 0; i < heights; i++) {
            people[i] = in.nextInt();
        }
        //Calculate average
        double sum = 0; 
        for (int e = 0; e < heights; e++) {
            sum += people[e];
        }
        //Calculate above-average heights
        double averageHeight =  (Math.ceil(sum / heights * 100)) / 100;
        
        for (int a = 0; a < heights; a++) {
            if (averageHeight < people[a]) {
            
            
            //Show all above-average heights
            System.out.println("The following height is above average: " + people[a]);
        }
        }
    }
}
