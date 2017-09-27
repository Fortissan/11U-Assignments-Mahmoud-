/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author alkam5246
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City Meme = new City();
        Robot Karel = new Robot(Meme, 9, 7, Direction.EAST);

        while (Karel.getStreet() != 0) {
            if (Karel.getDirection() == Direction.NORTH) {
                Karel.move();
            } else {
                Karel.turnLeft();

              
            }
        }
        
        
          while (Karel.getAvenue() != 0) {
                    if (Karel.getDirection() == Direction.WEST) {
                        Karel.move();
                    } else {
                        Karel.turnLeft();
                    }
                }
        
    }
}