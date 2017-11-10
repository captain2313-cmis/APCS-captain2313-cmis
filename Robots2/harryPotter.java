import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class harryPotter extends Robot
{
    public harryPotter(){
        super(Color.magenta);
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
    public void behave(){
        //0 get to the top left
        if (getData(0) == 0) {
            if (isClearUp()) {
                up();
            }
            else {
                if (isClearLeft()) {
                    left();
                }
                else {
                    setData(0, 1);
                }
            }
        }
        else {
            //1
            if (getData(0) == 1) {
                //1.0 get down while counting then record
                if (getData(1) == 0) {
                    if (isClearDown()) {
                        setData(2, getData(2) + 1);
                        down();
                    }
                    else {
                        setData(1, 1);
                    }
                }
                //1.1 get up and move to the right
                else {
                    if (isClearUp()) {
                        up();
                    }
                    else {
                        setData(0, 2);
                        setData(1, 0);
                        right();
                    }
                }
            }
            else {
                //2
                if (getData(0) == 2) {
                    //2.0 get down whilst scanning, calculate room coordinates
                    if (getData(1) == 0) {
                        if (isClearDown()) {
                            setData(3, getData(3) + 1);
                            down();
                        }
                        else {
                            setData(1, 1);
                        }
                    }
                    //2.1 return upward and to the right
                    else {
                        if (getData(3) == getData(2)) {
                            if (isClearUp()) {
                                up();
                            }
                            else {
                                setData(3, 0);
                                setData(1, 0);
                                right();
                            }
                        }
                        else {
                            setData(4, getX() + 11);
                            setData(5, getY() + 12);
                            setData(6, getX() - 1);
                            setData(0, 3);
                            setData(1, 0);
                        }
                    }
                }
                else {
                    //3
                    if (getData(0) == 3) {
                        //3.0 scan top try to get it
                        if (getData(1) == 0) {
                            
                        }
                    }
                }
            }
        }
        //3.1 scan right try to get it
        //3.2 scan bottom try to get it
        //3.3 scan left try to get it

        //4 get in
    }

    public static void locateOpening(int x, int y) {
        int x1 = x + 11, y1 = y + 11, x2 = x - 1;

    }
}