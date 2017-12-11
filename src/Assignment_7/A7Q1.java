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


public class A7Q1 {
    public static double circleArea(double radius) {
//calculate answer
        radius = Math.PI * Math.pow(radius, 2);
        //send back the answer
        return radius;
}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create the method object
        A7Q1 test = new A7Q1();
        Scanner in = new Scanner(System.in);
        
        //Enter the circle radius
        System.out.println("Please enter a radius: ");
        double i = in.nextDouble();
        
        //Calculate the area
        double total = test.circleArea(i);
        System.out.println("Your circle's area is: " + total);
        

    }
}
