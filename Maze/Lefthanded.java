import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Lefthanded extends Robot
{
    public Lefthanded(int d){
        super(Color.yellow, d);
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
     * public final int[] getData() => returns array of int data
     * public final int getData(int idx) => returns int data from index idx
     * public final void setData(int idx, int value) => sets value of data array at idx
     * public final void setData(int[] newData) => replaces values in data array with values in newData
     */
    public void behave() {
        if (getData(0) == 0) {
            if (isClearRight()) {
                setData(0, 1);
                right();
            }
            else if (isClearDown()) {
                setData(0, 1);
                setData(1, 1);
                down();
            }
        }
        else if (getData(0) == 1) {
            if (getData(1) == 0) {
                if (!isClearUp()) {
                    if (!isClearRight()) {
                        if (!isClearDown()) {
                            setData(1, 2);
                            left();
                        }
                        else {
                            setData(1, 1);
                            down();
                        }
                    }
                    right();
                }
                else {
                    setData(1, 3);
                    up();
                }
            }
            else if (getData(1) == 1) {
                if (!isClearRight()) {
                    if (!isClearDown()) {
                        if (!isClearLeft()) {
                            setData(1, 3);
                            up();
                        }
                        else {
                            setData(1, 2);
                            left();
                        }
                    }
                    down();
                }
                else {
                    setData(1, 0);
                    right();
                }
            }
            else if (getData(1) == 2) {
                if (!isClearDown()) {
                    if (!isClearLeft()) {
                        if (!isClearUp()) {
                            setData(1, 0);
                            right();
                        }
                        else {
                            setData(1, 3);
                            up();
                        }
                    }
                    left();
                }
                else {
                    setData(1, 1);
                    down();
                }
            }
            else if (getData(1) == 3) {
                if (!isClearLeft()) {
                    if (!isClearUp()) {
                        if (!isClearRight()) {
                            setData(1, 1);
                            down();
                        }
                        else {
                            setData(1, 0);
                            right();
                        }
                    }
                    up();
                }
                else {
                    setData(1, 2);
                    left();
                }
            }
        }
    }
}
