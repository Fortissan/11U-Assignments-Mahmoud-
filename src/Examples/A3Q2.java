/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author alkam5246
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City meme = new City ();
        Robot karel = new Robot(meme, 1, 1, Direction.EAST);
        
        //Create the item pile.
        new Thing(meme, 1, 1);
        new Thing(meme, 1, 1);
        new Thing(meme, 1, 1);
        new Thing(meme, 1, 1);
        new Thing(meme, 1, 1);
        new Thing(meme, 1, 1);
        new Thing(meme, 1, 1);
        new Thing(meme, 1, 1);
        new Thing(meme, 1, 1);
        new Thing(meme, 1, 1);
        meme.showThingCounts(true);
        
        //Move an item from the pile one space, move back. Repeat.
        for(int moveCounter = 0; moveCounter < 10; moveCounter = moveCounter +1) {
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();

        }
        //Move forward if there's nothing carried.
            if (karel.countThingsInBackpack() == 0) {
                karel.move();
            }
    }
}
