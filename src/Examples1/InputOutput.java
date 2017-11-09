/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples1;

import java.util.Scanner;

/**
 *
 * @author alkam5246
 */
public class InputOutput {
    private static int count;
    private static int countAge;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Say something.
        System.out.println("Meme me");
        System.out.print("MEME");

        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Name variable
        String firstname = " dude!";

        //Get name from the user
        System.out.println("Please enter your name.");
        String secondname = input.nextLine();


        //Put variable to the screen
        System.out.println("Hello " + secondname);
        
        System.out.println("Please enter the year you were born.");
        // Get the year
        int birthYear = input.nextInt();
        
        //Basic error checking
        while(birthYear > 2017) {
         System.out.println("That's extremely stupid!");
         birthYear = input.nextInt();
        }
        
        // Calculate age
        int age = 2017 - birthYear;
        System.out.println("You were born in  " + age + "!");
        
    }
        
    }

