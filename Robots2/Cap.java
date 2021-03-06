import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Random;
public class Cap extends Robot
{
    public Cap(){
        super(Color.red);
    }

    public void init(){

    }

    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearRight() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * getX() => returns x coordinate of robot
     * getY() => returns y coordinate of robot 
     */
    public void behave() {
        Random rand = new Random();
        double randy = rand.nextFloat();
        if (getX()%2 != 0) {
            if (isClearDown()) {
                if (getY() < 38) {
                    down();
                }
                else {
                    right();
                }
            }
            else {
                if (randy > 0.3) {
                    right();
                }
                else {
                    left();
                }
            }
        }
        else {
            if (isClearUp()) {
                if (getY() > 1) {
                    up();
                }
                else {
                    right();
                }
            }
            else {
                if (randy > 0.3) {
                    right();
                }
                else {
                    left();
                }
            }
        }
        
        /*if (getX()%2 != 0) {
            if (isClearDown()) {
                if (getY() < 38) {
                    down();
                }
                else {
                    right();
                }
            }
            else {
                if (isClearRight()) {
                    right();
                }
                else {
                    left();
                }
            }
        }
        else {
            if (isClearUp()) {
                if (getY() > 1) {
                    up();
                }
                else {
                    right();
                }
            }
            else {
                if (isClearRight()) {
                    right();
                }
                else {
                    left();
                }
            }
        }*/
        
        
        /*if (getX()%2 != 0) {
        if (getY() < 38) {
        down();
        }
        else {
        right();
        }
        }
        else {
        if (getY() > 1) {
        up();
        }
        else {
        right();
        }
        }*/
    }
}
