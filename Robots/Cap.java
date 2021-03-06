import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
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
     */
    public void behave(){
        if (isClearRight()) {
            right();
        }
        else if (isClearUp()) {
            for (int i = 0; i <= 4; i++) {
                up();
            }
        }
        else if (isClearDown()) {
            for (int i = 0; i <= 4; i++) {
                down();
            }
        }
        else {
            for (int i = 0; i <= 4; i++) {
                for (int a = 0; a <= 4; a++) {
                    left();
                }
                for (int b = 0; b <= 4; b++) {
                    down();
                }
                for (int c = 0; c <= 2; c++) {
                    right();
                }
                for (int d = 0; d <= 2; d++) {
                    up();
                }
            }
        }

    }
}
