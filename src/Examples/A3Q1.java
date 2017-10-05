/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author alkam5246
 */
public class A3Q1 {

    private static int moveSlots;
    private static int count;
    private static int moveCounter;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City meme = new City();
        Robot karel = new Robot(meme, 0, 2, Direction.WEST);

        
        //Create the buildings.
        new Wall(meme, 1, 1, Direction.NORTH);
        new Wall(meme, 1, 1, Direction.WEST);
        new Wall(meme, 1, 2, Direction.NORTH);
        new Wall(meme, 1, 2, Direction.EAST);
        new Wall(meme, 2, 1, Direction.WEST);
        new Wall(meme, 2, 1, Direction.SOUTH);
        new Wall(meme, 2, 2, Direction.EAST);
        new Wall(meme, 2, 2, Direction.SOUTH);
        
        //Move karel one space, turn if possible.
        for (int count = 0; count < 24; count = count + 1) {
            karel.move();
            karel.turnLeft();

            //Check if karel can turn.
            if (!karel.frontIsClear()) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
        }

    }
}
