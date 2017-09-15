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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City Meme = new City();
        Robot NPC = new Robot(Meme, 3, 0, Direction.EAST);
        new Wall(Meme, 3, 2, Direction.WEST);
        new Wall(Meme, 3, 2, Direction.NORTH);
        new Wall(Meme, 2, 3, Direction.WEST);
        new Wall(Meme, 1, 3, Direction.WEST);
        new Wall(Meme, 1, 3, Direction.NORTH);
        new Wall(Meme, 1, 3, Direction.EAST);
        new Wall(Meme, 2, 4, Direction.NORTH);
        new Wall(Meme, 2, 4, Direction.EAST);
        new Wall(Meme, 3, 4, Direction.EAST);
        new Thing(Meme, 3, 1);
        //Movement
        NPC.move();
        NPC.pickThing();
        NPC.turnLeft();
        NPC.move();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.move();
        NPC.turnLeft();
        NPC.move();
        NPC.move();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.move();
        NPC.putThing();
        NPC.move();
        NPC.turnLeft();
        NPC.move();
        NPC.turnLeft();
        NPC.move();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.turnLeft();
        NPC.move();
        NPC.move();
        NPC.turnLeft();
    }
}
