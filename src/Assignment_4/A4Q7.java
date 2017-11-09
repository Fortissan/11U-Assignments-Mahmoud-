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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Welcome the player and ask them to input their roll
        System.out.println("Welcome to the game!");
        System.out.println("Please input your roll.");

        //Scan the input, make sure it's possible
        Scanner input = new Scanner(System.in);

        //Name roll
        int roll = input.nextInt();

       
        for (int count = 0 + roll; count != 101; count = count + roll) {
            
            System.out.println("You got a " + count);
            roll = input.nextInt();
            if (count == 100) {
                System.out.println("You win!");
            }
            
            while (roll < 2 || roll > 12) {

                System.out.println("You Quit! Enter again!");
                roll = input.nextInt();

            }
            if (count == 54) {
                System.out.println("You got a " + count);
                int count2 = input.nextInt();
                count2 = count - 35;
                count = count2;
            }
            if (count == 90) {
                int count3 = input.nextInt();
                count3 = count - 42;
                count = count3;
                System.out.println("You got a " + count);
            }
            if (count == 99) {
                int count4 = input.nextInt();
                count4 = count - 22;
                count = count4;
                System.out.println("You got a " + count);
            }
            if (count == 9) {
                int count5 = input.nextInt();
                count5 = count - 25;
                count = count5;
                System.out.println("You got a " + count);
            }
            if (count == 40) {
                count = count - 24;
                System.out.println("You got a " + count);
            }
            if (count == 67) {
                count = count - 19;
                System.out.println("You got a " + count);
            }
            if (count == 100) {
                System.out.println("You win!");
            }
        }
    }
}