/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author alkam5246
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City Meme = new City();
        Robot Karel = new Robot(Meme, 1, 1, Direction.EAST);
        
        new Thing (Meme, 1, 2);
        new Thing (Meme, 1, 3);
        new Thing (Meme, 1, 4);
        new Thing (Meme, 1, 5);
        new Thing (Meme, 1, 6);
        new Thing (Meme, 1, 7);
        new Thing (Meme, 1, 8);
        new Thing (Meme, 1, 9);
        new Thing (Meme, 1, 10);
        new Thing (Meme, 1, 11);
        
        while (Karel.getAvenue() <= 10 ){
        Karel.countThingsInBackpack();
        if (Karel.countThingsInBackpack() == 7 ){
            Karel.move();
            Karel.move();
            Karel.move();
            Karel.move();
        }  else {
            Karel.move();
            Karel.pickThing();
        }
    }
}
    
}

