/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author alkam5246
 */
public class A2Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City Meme = new City();
        Robot Lol = new Robot(Meme, 2, 2, Direction.SOUTH);
        new Wall(Meme, 2, 1, Direction.EAST);
        new Wall(Meme, 3, 1, Direction.EAST);
        new Wall(Meme, 4, 1, Direction.EAST);
        new Wall(Meme, 5, 1, Direction.EAST);
        new Wall(Meme, 6, 1, Direction.EAST);
        new Wall(Meme, 7, 1, Direction.EAST);
        new Wall(Meme, 8, 1, Direction.EAST);
        new Wall(Meme, 9, 1, Direction.EAST);
        new Wall(Meme, 10, 1, Direction.EAST);
        new Wall(Meme, 11, 1, Direction.EAST);
        new Wall(Meme, 11, 2, Direction.SOUTH);
        new Wall(Meme, 11, 2, Direction.EAST);
        new Wall(Meme, 10, 3, Direction.SOUTH);
        new Wall(Meme, 10, 4, Direction.SOUTH);
        new Wall(Meme, 10, 5, Direction.SOUTH);
        new Wall(Meme, 10, 6, Direction.SOUTH);
        new Wall(Meme, 10, 7, Direction.SOUTH);
        new Wall(Meme, 10, 7, Direction.EAST);
        new Wall(Meme, 9, 7, Direction.EAST);
        new Wall(Meme, 9, 7, Direction.NORTH);
        new Wall(Meme, 9, 6, Direction.NORTH);
        new Wall(Meme, 9, 5, Direction.NORTH);
        new Wall(Meme, 9, 4, Direction.NORTH);
        new Wall(Meme, 9, 3, Direction.NORTH);
        new Wall(Meme, 8, 3, Direction.WEST);
        new Wall(Meme, 7, 3, Direction.WEST);
        new Wall(Meme, 6, 3, Direction.NORTH);
        new Wall(Meme, 6, 4, Direction.NORTH);
        new Wall(Meme, 6, 5, Direction.NORTH);
        new Wall(Meme, 6, 3, Direction.NORTH);
        new Wall(Meme, 6, 3, Direction.SOUTH);
        new Wall(Meme, 6, 5, Direction.SOUTH);
        new Wall(Meme, 6, 3, Direction.SOUTH);
        new Wall(Meme, 6, 4, Direction.SOUTH);
        new Wall(Meme, 6, 5, Direction.EAST);
        new Wall(Meme, 5, 2, Direction.EAST);
        new Wall(Meme, 4, 3, Direction.SOUTH);
        new Wall(Meme, 4, 4, Direction.SOUTH);
        new Wall(Meme, 4, 5, Direction.SOUTH);
        new Wall(Meme, 3, 3, Direction.NORTH);
        new Wall(Meme, 3, 4, Direction.NORTH);
        new Wall(Meme, 3, 5, Direction.NORTH);
        new Wall(Meme, 3, 6, Direction.EAST);
        new Wall(Meme, 4, 6, Direction.SOUTH);
        new Wall(Meme, 3, 6, Direction.NORTH);
        new Wall(Meme, 4, 6, Direction.EAST);
        new Wall(Meme, 2, 2, Direction.EAST);
        
        new Thing(Meme, 3, 2);
        new Thing(Meme, 3, 3);
        new Thing(Meme, 3, 4);
        new Thing(Meme, 3, 5);
        new Thing(Meme, 4, 4);
        new Thing(Meme, 6, 2);
        new Thing(Meme, 4, 2);
        new Thing(Meme, 6, 3);
        new Thing(Meme, 6, 4);
        new Thing(Meme, 9, 2);
        new Thing(Meme, 9, 3);
        new Thing(Meme, 10, 3);
        new Thing(Meme, 10, 6);
        new Thing(Meme, 9, 7);
        new Thing(Meme, 10, 4);

                }
        }