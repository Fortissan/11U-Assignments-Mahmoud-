
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
public class A1Q5 {
     public static void main(String[] args) {

City Qwerty = new City();
    Robot Karel = new Robot(Qwerty, 3, 3, Direction.EAST);
    Robot Maria = new Robot(Qwerty, 0, 1, Direction.WEST);

    Maria.setLabel("M");
    Karel.setLabel("K");

new Wall(Qwerty, 3, 3, Direction.SOUTH);
new Wall(Qwerty, 3, 3, Direction.EAST);
new Wall(Qwerty, 2, 3, Direction.EAST);
new Wall(Qwerty, 2, 3, Direction.NORTH);
new Wall(Qwerty, 2, 3, Direction.WEST);
     
new Thing(Qwerty, 0, 0);
new Thing(Qwerty, 1, 0);
new Thing(Qwerty, 1, 1);
new Thing(Qwerty, 2, 2);
new Thing(Qwerty, 1, 2);

Maria.move();
Maria.pickThing();
Maria.turnLeft();
Maria.move();
Karel.turnLeft();
Karel.turnLeft();
Maria.pickThing();
Maria.turnLeft();
Karel.move();
Karel.turnLeft();
Karel.turnLeft();
Karel.turnLeft();
Karel.move();
Karel.pickThing();
Maria.move();
Maria.pickThing();
        Karel.move();
        Karel.pickThing();
        Karel.turnLeft();
     }
}
