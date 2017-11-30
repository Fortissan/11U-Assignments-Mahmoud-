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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Ask for the amount of students
        System.out.println("How many students are there?: ");

        //Create and show number of students
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        double[] students = new double[numStudents];

        //Enter marks of each student
        System.out.println("Enter the marks: ");
        for (int i = 0; i < numStudents; i++) {
            students[i] = in.nextInt();
        }

        //Calculate the total
        double sum = 0;
        for (int e = 0; e < numStudents; e++) {
            sum += students[e];
        }
        double average = (Math.ceil(sum / numStudents * 100)) / 100;

        //Show class average
        System.out.println("The class average is: " + average);

    }
}
