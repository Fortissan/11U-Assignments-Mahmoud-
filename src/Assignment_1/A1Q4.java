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
public class A1Q4 {
    public static void main(String[] args) {

City Qwerty = new City();
Robot NPC = new Robot(Qwerty, 0, 0, Direction.SOUTH);
Robot PC = new Robot(Qwerty, 0, 1, Direction.SOUTH);
new Wall(Qwerty, 0, 1, Direction.WEST);
new Wall(Qwerty, 1, 1, Direction.WEST);
new Wall(Qwerty, 1, 1, Direction.SOUTH);

NPC.move();
PC.move();
NPC.move();
NPC.turnLeft();
PC.turnLeft();
PC.move();
PC.turnLeft();
PC.turnLeft();
PC.turnLeft();
PC.move();
NPC.move();
PC.turnLeft();
PC.turnLeft();
PC.turnLeft();
PC.move();

    }
}