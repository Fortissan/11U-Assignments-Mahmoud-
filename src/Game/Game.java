/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Game.Game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author alkam5246
 */
public class Game extends JComponent {
    // Height and Width of our game

    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Hotshot";

    //Set up lower FPS for blockier movement
    long desiredFPS = 16;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE

    //Create the player and direction movements
    Rectangle player = new Rectangle(40, 40, 20, 20);
    int playerDX = 0;
    int playerDY = 0;
    //Create the borders array
    Rectangle[] border = new Rectangle[4];
    //Create the controls variables
    boolean left = false;
    boolean right = false;
    boolean up = false;
    boolean down = false;
    //Create a font for loss message
    Font biggerFont = new Font("arial", Font.BOLD, 42);
    //Create font for point counter
    Font pointCount = new Font("sec", Font.ITALIC, 15);
    //Create variable for loss (to stop from displaying 'loss' msg at start
    int lose = 0;
    //Create pahse 1 random spawns for X and Y shots on the border
    int ballXSpawn = (int) (Math.random() * WIDTH);
    int ballYSpawn = (int) (Math.random() * HEIGHT);
    //Create variables for the X and Y projectile speed + size
    int shotX = 20;
    int shotY = 24;
    //Create the rectangles for the projectiles
    Rectangle projectileX = new Rectangle(ballXSpawn, 0, shotX, shotX);
    Rectangle projectileY = new Rectangle(0, ballYSpawn, shotX, shotX);
    //Create level numbers (start at 2 to avoid level loop problem)
    int level = 2;
    
    //Create phase 2, copied phase 1 w/ new variables
    int shot2Y = -20;
    int shot2X = -20;
    int ball2XSpawn = (int) (Math.random() * 800);
    int ball2YSpawn = (int) (Math.random() * 600);
    //Put projectiles away and out of distance from screen for later use (avoid random collision error)
    int heightProjectile = -40;
    int widthProjectile = -40;
    //Create phase 2 rectangles
    Rectangle projectile2X = new Rectangle(ball2XSpawn, heightProjectile / 2 - shot2Y / 2, shotX, shotX);
    Rectangle projectile2Y = new Rectangle(widthProjectile / 2 - shot2X / 2, ball2YSpawn, shotX, shotX);
    //Repeat phase 2 for phase 3
    int shot3Y = -20;
    int shot3X = -20;
    int ball3XSpawn = (int) (Math.random() * WIDTH);
    int ball3YSpawn = (int) (Math.random() * HEIGHT);
    Rectangle projectile3X = new Rectangle(ball3XSpawn, heightProjectile / 2 - shot3Y / 2, shotX, shotX);
    Rectangle projectile3Y = new Rectangle(widthProjectile / 2 - shot3X / 2, ball3YSpawn, shotX, shotX);
    //Create point counter
    int points = 0;
    //Create controls allowed before loss
    boolean controls = true;
    // GAME VARIABLES END HERE
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)

    public Game() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Game.Keyboard());
        Game.Mouse m = new Game.Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE

        //Fill the border rectangle array
        g.setColor(Color.BLACK);
        for (int i = 0; i < border.length; i++) {
            g.fillRect(border[i].x, border[i].y, border[i].width, border[i].height);
        }
        //Create the player cube
        g.setColor(Color.RED);
        g.fillRect(player.x, player.y,
                player.width, player.height);

        //Draw the shots
        g.setColor(Color.CYAN);
        g.fillRect(projectileY.x, projectileY.y, projectileY.width, projectileY.height);
        g.fillRect(projectileX.x, projectileX.y, projectileX.width, projectileX.height);

        //Repeat for second phase shots
        if (level >= 5) {
            g.setColor(Color.BLUE);
            g.fillRect(0, projectile2Y.y, projectile2Y.width, projectile2Y.height);
            g.fillRect(projectile2X.x, 0, projectile2X.width, projectile2X.height);
        }
        //Repeat for third phase shots
        if (level >= 7) {
            g.setColor(Color.GREEN);
            g.fillRect(0, projectile3Y.y, projectile3Y.width, projectile3Y.height);
            g.fillRect(projectile3X.x, 0, projectile3X.width, projectile3X.height);
        }
        //Create initial "start" for loss statement
        if (playerDX != 0 || playerDY != 0) {
            lose = lose + 1;
        }
        //Create loss parameters
        if (lose > 1 && (playerDX == 0 && playerDY == 0)) {
            //State loss
            g.setColor(Color.BLACK);
            g.setFont(biggerFont);
            g.drawString("You lose!", 300, 300);
        }
        //Create the level message notifier
        if (shotX == 50) {
            g.setColor(Color.GREEN);
            g.setFont(biggerFont);
            g.drawString("Level " + level + "!", 300, 300);
        }

        //Create a point counter over the player
        g.setColor(Color.BLACK);
        g.setFont(pointCount);
        g.drawString("Points: " + points, player.x - 12, player.y + 2);
        // GAME DRAWING ENDS HERE

    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

        //Set up the snake's borders
        border[0] = new Rectangle(0, 580, WIDTH, 40);
        border[1] = new Rectangle(0, -20, WIDTH, 40);
        border[2] = new Rectangle(780, 0, 40, HEIGHT);
        border[3] = new Rectangle(-20, 0, 40, HEIGHT);
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE


            //Create movement directions and speed for the player
            if (right == true) {
                playerDX = 10;
                playerDY = 0;
            } else if (left == true) {
                playerDX = -10;
                playerDY = 0;
            } else if (up == true) {
                playerDY = -10;
                playerDX = 0;
            } else if (down == true) {
                playerDY = 10;
                playerDX = 0;
            }
            
            //Shoot the projectile beams for each phase
            if (playerDX >= 10 || playerDX <= -10 || playerDY >= 10 || playerDY <= -10) {
                projectileX.height = projectileX.height + shotX;
                projectileY.width = projectileY.width + shotY;
                points = points + 1;
            }

            if (projectileY.width > WIDTH) {
                projectileY.y = (int) (Math.random() * 600);
                shotY = shotY + 1;
                if (shotY > 50) {
                    shotY = 24;
                }
                projectileY.width = shotY;
            }
            if (projectileX.height > HEIGHT) {
                projectileX.x = (int) (Math.random() * 600);
                shotX = shotX + 1;
                if (shotX > 50) {
                    shotX = 22;
                    level = level + 1;
                }
                projectileX.height = shotX;
            }
            if (level >= 5) {
                projectile2X.height = projectile2X.height + shot2X;
                projectile2Y.width = projectile2Y.width + shot2Y;
                if (projectile2Y.width > WIDTH) {
                    projectile2Y.y = (int) (Math.random() * 600);
                    shot2Y = shot2Y + 1;
                    if (shot2Y > 50) {
                        shot2Y = 26;
                    }
                    projectile2Y.width = shot2Y;
                }
                if (projectile2X.height > HEIGHT) {
                    projectile2X.x = (int) (Math.random() * 600);
                    shot2X = shot2X + 1;
                    if (shot2X > 50) {
                        shot2X = 20;
                    }
                    projectile2X.height = shot2X;
                }
                if (level >= 7) {
                    projectile3X.height = projectile3X.height + shot3X;
                    projectile3Y.width = projectile3Y.width + shot3Y;
                    if (projectile3Y.width > WIDTH) {
                        projectile3Y.y = (int) (Math.random() * 600);
                        shot3Y = shot3Y + 1;
                        if (shot3Y > 50) {
                            shot3Y = 28;
                        }
                        projectile3Y.width = shot3Y;
                    }
                    if (projectile3X.height > HEIGHT) {
                        projectile3X.x = (int) (Math.random() * 600);
                        shot3X = shot3X + 1;
                        if (shot3X > 50) {
                            shot3X = 24;

                        }
                        projectile3X.height = shot3X;
                    }
                }
            }
            //Raise shots X and Y of phase two into play
            if (level >= 5) {
                shot2Y = 26;
                shot2X = 22;
                heightProjectile = 800;
            }
            //Raise shots X and Y of phase three into play
            if (level >= 7) {
                shot3Y = 28;
                shot3X = 24;
                widthProjectile = 600;
            }
            //Stop the block if it travels over the border
            if (player.y > 570 || player.y < 15 || player.x > 770 || player.x < 15) {
                up = false;
                down = false;
                left = false;
                right = false;
                playerDY = 0;
                playerDX = 0;
                controls = false;
                done = true;
            }

            //Update the player
            player.x = player.x + playerDX;
            player.y = player.y + playerDY;

            //If player intersects projectiles of the first phase, push loss
            if (player.intersects(projectileX) || player.intersects(projectileY) ||
                    player.intersects(projectile2X) || player.intersects(projectile2Y) ||
                    player.intersects(projectile3X) || player.intersects(projectile3Y)) {
                up = false;
                down = false;
                left = false;
                right = false;
                playerDY = 0;
                playerDX = 0;
                controls = false;
                done = true;
            }
            //Stop all moving projectiles if lost
            if (lose > 2 && (playerDY == 0 && playerDX == 0)) {
                projectileX.height = 0;
                projectile2X.height = 0;
                projectile3X.height = 0;
                projectileY.width = 0;
                projectile2Y.width = 0;
                projectile3Y.width = 0;
            }
            // GAME LOGIC ENDS HERE
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            }
        }
    }
    // Used to implement any of the Mouse Actions

    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {

            //Determine the key for movement.
            int key = e.getKeyCode();
            //Figure out which key
            if (controls = true) {
                if (key == KeyEvent.VK_D) {
                    right = true;
                    left = false;
                    up = false;
                    down = false;
                } else if (key == KeyEvent.VK_A) {
                    left = true;
                    right = false;
                    up = false;
                    down = false;
                } else if (key == KeyEvent.VK_W) {
                    up = true;
                    left = false;
                    right = false;
                    down = false;
                } else if (key == KeyEvent.VK_S) {
                    down = true;
                    left = false;
                    right = false;
                    up = false;
                }
            }


        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            //Determine the key.
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        Game game = new Game();

        // starts the game loop
        game.run();
    }
}
