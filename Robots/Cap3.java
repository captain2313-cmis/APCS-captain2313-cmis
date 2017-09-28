import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Cap3 extends Robot
{
    public Cap3(){
        super(Color.orange);
    }

    public void init(){
        boolean isUp = true;
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
     */
    public void behave(){
        if (isClearRight()) {
            right();
        }
        else {
            if (isClearUp()) {
                if (!isClearRight()) {
                    up();
                }
            }
            else {
                if (!isClearRight()) {
                    down();
                }
            }
        }
    }
}
