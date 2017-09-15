/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author alkam5246
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Detroit = new City();
        Robot NPC = new Robot(Detroit, 1, 2, Direction.SOUTH);
        
        new Wall(Detroit, 1, 2, Direction.SOUTH);
        new Wall(Detroit, 1, 2, Direction.EAST);
        new Wall(Detroit, 1, 2, Direction.NORTH);
        new Wall(Detroit, 1, 1, Direction.NORTH);
        new Wall(Detroit, 1, 1, Direction.WEST);
        new Wall(Detroit, 2, 1, Direction.WEST);
        new Wall(Detroit, 2, 1, Direction.SOUTH);

        new Thing(Detroit, 2, 2);
        
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.move();
        NPC.turnLeft();
        NPC.move();
        NPC.turnLeft();
        NPC.move();
        NPC.pickThing();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.move();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.move();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.move();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.turnLeft();
    }
}
