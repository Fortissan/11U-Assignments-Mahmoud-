/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author alkam5246
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City Meme = new City();
        Robot Karel = new Robot(Meme, 5, 0, Direction.NORTH);

        new Wall(Meme, 1, 1, Direction.NORTH);
        new Wall(Meme, 1, 1, Direction.EAST);
        new Wall(Meme, 1, 1, Direction.WEST);
        new Wall(Meme, 1, 1, Direction.SOUTH);
        new Wall(Meme, 4, 1, Direction.NORTH);
        new Wall(Meme, 4, 1, Direction.EAST);
        new Wall(Meme, 4, 1, Direction.WEST);
        new Wall(Meme, 4, 1, Direction.SOUTH);
        new Wall(Meme, 4, 4, Direction.NORTH);
        new Wall(Meme, 4, 4, Direction.EAST);
        new Wall(Meme, 4, 4, Direction.WEST);
        new Wall(Meme, 4, 4, Direction.SOUTH);
        new Wall(Meme, 2, 2, Direction.NORTH);
        new Wall(Meme, 2, 2, Direction.WEST);
        new Wall(Meme, 3, 2, Direction.WEST);
        new Wall(Meme, 3, 2, Direction.SOUTH);
        new Wall(Meme, 1, 4, Direction.NORTH);
        new Wall(Meme, 1, 4, Direction.EAST);
        new Wall(Meme, 1, 4, Direction.WEST);
        new Wall(Meme, 1, 4, Direction.SOUTH);
        new Wall(Meme, 3, 3, Direction.EAST);
        new Wall(Meme, 2, 3, Direction.EAST);
        new Wall(Meme, 2, 3, Direction.NORTH);
        new Wall(Meme, 3, 3, Direction.SOUTH);
        
        while (Karel.getStreet() != 94) { 
         if (Karel.frontIsClear()) {
             Karel.move();
             Karel.turnLeft();
             Karel.turnLeft();
             Karel.turnLeft();
         } else {
             Karel.turnLeft();
             
         }
        }
        while (!Karel.frontIsClear()) {
            Karel.turnLeft();
        }
    }
}
