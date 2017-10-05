/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author alkam5246
 */
public class VariableExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Meme = new City();
        int yearBorn = 2001;
        Robot Steve = new Robot(Meme, 1, 1, Direction.EAST);
        
        //Create a move-counting variable.
        int moveCounter = 0;
        //Continue when counter is less than 10.
        while(moveCounter < 10) {
            //Move forward
            Steve.move();
            moveCounter = moveCounter + 1;
        }
        
        Steve.turnLeft();
        Steve.turnLeft();
        
        //Counted for loop
        for(int count = 0; count < 10; count = count +1) {
        //Move the robot
        Steve.move();
    }
}
}