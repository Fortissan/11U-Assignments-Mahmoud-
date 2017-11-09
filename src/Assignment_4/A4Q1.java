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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        
        //Ask for a name
        System.out.println("Please enter your name:");
        
        //Read the next input for user's name
        Scanner input = new Scanner(System.in);
        String firstname = input.nextLine();
        
        //Greet the user by name
        System.out.println("Hello " + firstname + ". How are you today?");
    }
}
