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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Ask for the user's name.
        System.out.println("Please enter your name:");

        //Scan the answer.
        Scanner name = new Scanner(System.in);

        //Get the name.
        String username = name.nextLine();

        //Ask for the test's total.
        System.out.println("What was the first test out of?:");

        //Scan the answer:
        Scanner firstTotal = new Scanner(System.in);

        //Get the number.
        double total1 = firstTotal.nextDouble();

        //Scan for what the user got out of the test.
        System.out.println("What mark did you get?:");

        //Scan the answer.
        Scanner firstMark = new Scanner(System.in);

        //Get the answer's number.
        double mark1 = firstMark.nextDouble();

        //Repeat for the remaining questions.
        System.out.println("What was the second test out of?:");
        Scanner secondTotal = new Scanner(System.in);
        double total2 = secondTotal.nextDouble();

        System.out.println("What mark did you get?:");
        Scanner secondMark = new Scanner(System.in);
        double mark2 = secondMark.nextDouble();

        System.out.println("What was the third test out of?:");
        Scanner thirdTotal = new Scanner(System.in);
        double total3 = thirdTotal.nextDouble();

        System.out.println("What mark did you get?:");
        Scanner thirdMark = new Scanner(System.in);
        double mark3 = thirdMark.nextDouble();

        System.out.println("What was the fourth test out of?:");
        Scanner fourthTotal = new Scanner(System.in);
        double total4 = fourthTotal.nextDouble();

        System.out.println("What mark did you get?:");
        Scanner fourthMark = new Scanner(System.in);
        double mark4 = fourthMark.nextDouble();

        System.out.println("What was the fifth test out of?:");
        Scanner fifthTotal = new Scanner(System.in);
        double total5 = fifthTotal.nextDouble();

        System.out.println("What mark did you get?:");
        Scanner fifthMark = new Scanner(System.in);
        double mark5 = fifthMark.nextDouble();


        //Calculate total mark for each test
        double final1 = mark1 / total1 * 100;
        double final2 = mark2 / total2 * 100;
        double final3 = mark3 / total3 * 100;
        double final4 = mark4 / total4 * 100;
        double final5 = mark5 / total5 * 100;

        //list out final of each test
        System.out.println("Test Scores for " + username + ".");
        System.out.println("Test 1: " + final1);
        System.out.println("Test 2: " + final2);
        System.out.println("Test 3: " + final3);
        System.out.println("Test 4: " + final4);
        System.out.println("Test 5: " + final5);

        //Calculate average of all tests together
        double totalPercent = final1 + final2 + final3 + final4 + final5;
        double average = totalPercent / 5;

        //show the final percentage
        System.out.println("Average: " + average);
    }
}
