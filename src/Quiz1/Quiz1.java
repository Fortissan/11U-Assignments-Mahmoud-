/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author alkam5246
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create the city and robot.
        City meme = new City();
        Robot Karel = new Robot(meme, 1, 0, Direction.EAST);

        //Create the mine.
        new Wall(meme, 1, 0, Direction.WEST);
        new Wall(meme, 1, 2, Direction.NORTH);
        new Wall(meme, 1, 3, Direction.NORTH);
        new Wall(meme, 1, 4, Direction.NORTH);
        new Wall(meme, 1, 5, Direction.NORTH);
        new Wall(meme, 1, 6, Direction.NORTH);
        new Wall(meme, 1, 2, Direction.SOUTH);
        new Wall(meme, 1, 3, Direction.SOUTH);
        new Wall(meme, 1, 4, Direction.SOUTH);
        new Wall(meme, 1, 5, Direction.SOUTH);
        new Wall(meme, 1, 6, Direction.SOUTH);
        new Wall(meme, 1, 6, Direction.EAST);

        //Fill the mine for the initial situation.
        new Thing(meme, 1, 2);
        new Thing(meme, 1, 3);
        new Thing(meme, 1, 4);
        new Thing(meme, 1, 5);
        new Thing(meme, 1, 6);

        //Teach the robot to move forward if it can.
        while (Karel.frontIsClear()) {
            Karel.move();
            
            //Get the robot to pick up what they find in the mine.
            if (Karel.canPickThing()) {
                Karel.pickThing();
                Karel.turnLeft();
                Karel.turnLeft();
                
                //Get Karel to put the debris back outside of the mine.
                while (Karel.getAvenue() != 0) {
                    Karel.move();
                }
                while (Karel.countThingsInBackpack() != 0) {
                    Karel.putThing();
                    Karel.turnLeft();
                    Karel.turnLeft();
                    Karel.move();
                }
            }
        }
        //Get Karel out of the mine once finished.
        while (!Karel.frontIsClear()) {
            Karel.turnLeft();
            Karel.turnLeft();
            while (Karel.frontIsClear()) {
                Karel.move();
            }
            Karel.turnLeft();
            Karel.turnLeft();
        }
    }
}
