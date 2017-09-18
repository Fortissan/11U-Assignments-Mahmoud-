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
public class ConditionExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        Robot Karel = new Robot(kw, 2, 1, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Thing(kw, 2, 4);
        //Check if the front is clear.
        if(Karel.frontIsClear()){
            //Move forward if clear
            Karel.move();
        }else {
            //If not turn left
            Karel.turnLeft();
        }
            while(Karel.frontIsClear()){
                //move forward
                Karel.move();
            //If there is something to pick up.
            if(Karel.canPickThing()){
            Karel.pickThing();
            
            }
            }
    }
}
