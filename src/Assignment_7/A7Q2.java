/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

import Examples1.Example_8;
import java.util.Scanner;

/**
 *
 * @author alkam5246
 */
public class A7Q2 {
public void examGrade(double examGrade) {
    
    if(examGrade < 50) {
        System.out.println("You have an F.");
    } else { 
        if(examGrade >= 50 && examGrade <= 59) {
            System.out.println("You have a D.");
        } else {
            if (examGrade >= 60 && examGrade <= 69) {
                System.out.println("You have a C.");
            } else {
                if (examGrade >= 70 && examGrade <= 79) {
                    System.out.println("You have a B.");
                } else {
                    if (examGrade >= 80) {
                        System.out.println("You have an A!");
                    }
                }
            }
        }
    }
    }
    //Double return type 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create an object to test
        A7Q2 test = new A7Q2();
        //Create scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your exam mark: ");
        double exam = in.nextDouble();
        //Store tahe exam mark
        test.examGrade(exam);
    }
}
