/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author alkam5246
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Detroit = new City();
        Robot NPC = new Robot(Detroit, 0, 2, Direction.WEST);
        new Wall(Detroit, 1, 2, Direction.NORTH);
        new Wall(Detroit, 1, 1, Direction.NORTH);
        new Wall(Detroit, 2, 1, Direction.WEST);
        new Wall(Detroit, 1, 1, Direction.WEST);
        new Wall(Detroit, 2, 2, Direction.EAST);
        new Wall(Detroit, 1, 2, Direction.EAST);
        new Wall(Detroit, 2, 2, Direction.SOUTH);
        new Wall(Detroit, 2, 1, Direction.SOUTH);
        
        //Movement
        NPC.move();
        NPC.move();
        NPC.turnLeft();
        NPC.move();
        NPC.move();
        NPC.move();
        NPC.turnLeft();
        NPC.move();
        NPC.move();
        NPC.move();
        NPC.turnLeft();
        NPC.move();
        NPC.move();
        NPC.move();
        NPC.turnLeft();
        NPC.move();
    }
}
