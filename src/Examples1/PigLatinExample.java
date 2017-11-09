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
public class PigLatinExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creates scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a word");
        String word = input.nextLine();
        
        //Convert to lowercase
        word = word.toLowerCase();
        
        //See if word starts witha  vowel
        if (word.startsWith("a") || word.startsWith("e") || word.startsWith("u") 
                || word.startsWith("i") || word.startsWith("o")) {
        String translated = word + "way";
        System.out.println("Word in piglatin is translated to " + translated);
        } else {
            //Not a vowel, special rule time
            //Find the first vowel by going through word
            for(int i = 0; i < word.length(); i = i++) {
                if(word.charAt(i) == ('e') || word.charAt(i) == ('a') || word.charAt(i) == ('o') 
                        || word.charAt(i) == ('i') || word.charAt(i) == ('u')) {
                //Chop the word up at the vowel
                    String front = word.substring(0, 1);
                    String  ending = word.substring(i);
                    //Tell the user the translation
                    String translated = ending + front + "way";
                            //Tell the user the translation
                            System.out.println(word + " in pig latin is " + translated);
                    //Stop looking for vowels
                    break;
                }
            }
        }
    }
}
