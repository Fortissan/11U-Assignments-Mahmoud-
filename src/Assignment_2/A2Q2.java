/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author alkam5246
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Meme = new City();
        Robot Karel = new Robot(Meme, 5, 1, Direction.EAST);

        new Wall(Meme, 5, 1, Direction.SOUTH);
        new Wall(Meme, 5, 1, Direction.EAST);
        new Wall(Meme, 5, 2, Direction.SOUTH);
        new Wall(Meme, 5, 2, Direction.EAST);
        new Wall(Meme, 5, 3, Direction.SOUTH);
        new Wall(Meme, 5, 4, Direction.SOUTH);
        new Wall(Meme, 5, 4, Direction.EAST);
        new Wall(Meme, 5, 5, Direction.SOUTH);
        new Wall(Meme, 5, 6, Direction.SOUTH);
        new Wall(Meme, 5, 7, Direction.SOUTH);
        new Wall(Meme, 5, 7, Direction.EAST);
        new Wall(Meme, 5, 8, Direction.SOUTH);
        new Wall(Meme, 5, 9, Direction.SOUTH);
        new Thing(Meme, 5, 9);

        while (!Karel.canPickThing() && Karel.countThingsInBackpack() == 0) {
            if (Karel.frontIsClear() && Karel.countThingsInBackpack() == 0) {
                Karel.move();

            } else {
                Karel.turnLeft();
                Karel.move();
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.move();
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.move();
                Karel.turnLeft();
                Karel.frontIsClear();
            }
            if (Karel.canPickThing()) {
                Karel.pickThing();
            }
        }
    }
}

