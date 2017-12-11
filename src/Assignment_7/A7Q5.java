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
public class A7Q5 {

    public void chaotic(int lines) {

        for (int i = 0; i < lines; i++) {
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            if (randNum == 5) {
                System.out.println("*****");
            }
            if (randNum == 4) {
                System.out.println("****");
            }
            if (randNum == 3) {
                System.out.println("***");
            }
            if (randNum == 2) {
                System.out.println("**");
            }
            if (randNum == 1) {
                System.out.println("*");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        A7Q5 test = new A7Q5();

        //Ask and accept a number of asterisk lines
        System.out.println("How many random lines would you like?");
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();

        //Test the procedure
        test.chaotic(lines);

    }
}
