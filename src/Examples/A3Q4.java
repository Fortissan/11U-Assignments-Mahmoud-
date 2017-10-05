/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author alkam5246
 */
public class A3Q4 {

    private static int moveCounter;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        City meme = new City();
        Robot karel = new Robot(meme, 3, 3, Direction.SOUTH);

        //create wall
        new Wall(meme, 1, 1, Direction.WEST);
        new Wall(meme, 2, 1, Direction.WEST);
        new Wall(meme, 1, 1, Direction.NORTH);
        new Wall(meme, 1, 2, Direction.NORTH);
        new Wall(meme, 2, 1, Direction.SOUTH);
        new Wall(meme, 2, 2, Direction.SOUTH);
        new Wall(meme, 2, 2, Direction.EAST);
        new Wall(meme, 1, 2, Direction.EAST);
        new Wall(meme, 1, 4, Direction.WEST);
        new Wall(meme, 2, 4, Direction.WEST);
        new Wall(meme, 1, 4, Direction.NORTH);
        new Wall(meme, 1, 5, Direction.NORTH);
        new Wall(meme, 2, 4, Direction.SOUTH);
        new Wall(meme, 2, 5, Direction.SOUTH);
        new Wall(meme, 2, 5, Direction.EAST);
        new Wall(meme, 1, 5, Direction.EAST);
        new Wall(meme, 4, 1, Direction.WEST);
        new Wall(meme, 5, 1, Direction.WEST);
        new Wall(meme, 4, 1, Direction.NORTH);
        new Wall(meme, 4, 2, Direction.NORTH);
        new Wall(meme, 5, 1, Direction.SOUTH);
        new Wall(meme, 5, 2, Direction.SOUTH);
        new Wall(meme, 5, 2, Direction.EAST);
        new Wall(meme, 4, 2, Direction.EAST);
        new Wall(meme, 4, 4, Direction.WEST);
        new Wall(meme, 5, 4, Direction.WEST);
        new Wall(meme, 4, 4, Direction.NORTH);
        new Wall(meme, 4, 5, Direction.NORTH);
        new Wall(meme, 5, 4, Direction.SOUTH);
        new Wall(meme, 5, 5, Direction.SOUTH);
        new Wall(meme, 5, 5, Direction.EAST);
        new Wall(meme, 4, 5, Direction.EAST);

        //Move the robot with this command four times.
        for (int moveCount = 0; moveCount < 4; moveCount = moveCount + 1) {

            for (int count = 0; count < 3; count = count + 1) {
                int movingCounter = 0;

                //Continue moving while the counter is less than three.
                while (movingCounter < 3) {
                    karel.move();

                    //Add one opint to the move counter.
                    movingCounter = movingCounter + 1;
                }

                //Turn around the corner.
                karel.turnLeft();

            }
            //Move through the open corridor.
            karel.move();
            karel.move();
            karel.move();
        }
    }
}
