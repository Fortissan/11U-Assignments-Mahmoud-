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
public class A3Q3 {

    private static int count;
    private static int rowCount;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City meme = new City();
        Robot karel = new Robot(meme, 1, 1, Direction.EAST, 20);
        meme.showThingCounts(true);

        
        for (int count = 0; count < 2000; count = count + 100) {
            karel.move();
            karel.putThing();
            if (karel.getAvenue() == 6 && karel.getDirection() == Direction.EAST) {
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
                        if (karel.getAvenue() == 2 && karel.getDirection() == Direction.WEST) {
                karel.move();
                            karel.turnLeft();
                karel.move();
                karel.turnLeft();
                } else {
                for(int repetitionCount = 0; repetitionCount > 1; repetitionCount = repetitionCount +1) {
                    karel.turnLeft();
                    karel.turnLeft();

                }
            }
        }
        karel.move();
    }
}
