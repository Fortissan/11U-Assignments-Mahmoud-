/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_5;

import java.util.Scanner;

/**
 *
 * @author Pures8098
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 0;
        //while the word is greater than zero
        while (a < 1) {
            System.out.print("Enter your word!: ");
            //Get a word to translate
            Scanner words = new Scanner(System.in);
            String word = words.nextLine();
            //Make a way to exit the program
            String ex = "Exit";
            if (word.equals(ex)) {
                //System bids goodbye and ends
                System.out.print("goodbye");
                break;
            }
            //Clean out the string
            String translate = "";

            Boolean foundvowel = false;
            //Count the vowels
            for (int i = 0; i < word.length(); i++) {

                //Add the vowels at the "i" spot. 
                if ((word.charAt(i) == 'a'
                        || word.charAt(i) == 'e'
                        || word.charAt(i) == 'i'
                        || word.charAt(i) == 'o'
                        || word.charAt(i) == 'u')
                        && foundvowel == false) {
                    //add and ub with the vowel.
                    translate = translate + "ub";
                    translate = translate + word.charAt(i);
                    foundvowel = true;
                } else {
                    //Skip the ub after two consecutive vowels
                    if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == true) {
                        translate = translate + word.charAt(i);
                    } else {
                        translate = translate + word.charAt(i);
                        foundvowel = false;
                    }
                }
            }
            System.out.print("your word in ubbi dubbi is " + translate);
            a = a + 1;

        }
    }
}