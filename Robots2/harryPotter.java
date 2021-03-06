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
                            if (getData(3) == getData(2)) {
                                setData(1, 1);
                                setData(3, 0);
                                right();
                            }
                            else {
                                setData(0, 3);
                                setData(1, 0);
                                setData(2, 11);
                                setData(3, 0);
                            }
                        }
                    }
                    //2.1 get up whilst scanning
                    else if (getData(1) == 1) {
                        if (isClearUp()) {
                            setData(3, getData(3) + 1);
                            up();
                        }
                        else {
                            if (getData(3) == getData(2)) {
                                setData(1, 0);
                                setData(3, 0);
                                right();
                            }
                            else {
                                setData(1, 2);
                                setData(3, 0);
                                setData(2, 12);
                                left();
                            }
                        }
                    }
                    //2.2 get from bottom corner to top corner, calculate
                    else {
                        if (getData(3) < getData(2)) {
                            setData(3, getData(3) + 1);
                            up();
                        }
                        else{
                            setData(0, 3);
                            setData(1,0);
                            setData(2, 11);
                            setData(3, 0);
                            right();
                        }
                    }
                }
                else {
                    //3
                    if (getData(0) == 3) {
                        //3.0 scan top try to get in
                        if (getData(1) == 0) {
                            if (getData(3) < getData(2)) {
                                if (isClearDown()) {
                                    setData(0, 4);
                                    setData(1, 0);
                                    down();
                                }
                                else {
                                    setData(3, getData(3) + 1);
                                    right();
                                }
                            }
                            else {
                                setData(1, 1);
                                setData(3, 0);
                                down();
                            }
                        }
                        //3.1 scan right try to get in
                        else if (getData(1) == 1) {
                            if (getData(3) < getData(2)) {
                                if (isClearLeft()) {
                                    setData(0, 4);
                                    setData(1, 1);
                                    left();
                                }
                                else {
                                    setData(3, getData(3) + 1);
                                    down();
                                }
                            }
                            else {
                                setData(1, 2);
                                setData(3, 0);
                                left();
                            }
                        }
                        //3.2
                        else if (getData(1) == 2) {
                            if (getData(3) < getData(2)) {
                                if (isClearUp()) {
                                    setData(0, 4);
                                    setData(1, 2);
                                    up();
                                }
                                else {
                                    setData(3, getData(3) + 1);
                                    left();
                                }
                            }
                            else {
                                setData(1, 3);
                                setData(3, 0);
                                up();
                            }
                        }
                        //3.3
                        else {
                            if (getData(3) < getData(2)) {
                                if (isClearRight()) {
                                    setData(0, 4);
                                    setData(1, 3);
                                    right();
                                }
                                else {
                                    setData(3, getData(3) + 1);
                                    up();
                                }
                            }
                            else {
                                setData(1, 0);
                                setData(3, 0);
                                right();
                            } 
                        }
                    }
                    else {
                        //4
                        if (getData(0) == 4) {
                            //4.0 down
                            if (getData(1) == 0) {
                                setData(1, 4);
                                setData(4, getX() - 4);
                                setData(5, getY() - 1);
                                down();
                            }
                            //4.1 left
                            else if (getData(1) == 1) {
                                setData(1, 4);
                                setData(4, getX() - 10);
                                setData(5, getY() + 4);
                                left();
                            }
                            //4.2 up
                            else if (getData(1) == 2) {
                                setData(1, 4);
                                setData(4, getX() - 4);
                                setData(5, getY() + 10);
                                up();
                            }
                            //4.3 right
                            else if (getData(1) == 3) {
                                setData(1, 4);
                                setData(4, getX() + 1);
                                setData(5, getY() + 4);
                                right();
                            }
                            //4.4 get to top left corner of room(use coordinates
                            else {
                                if (getY() != getData(5)) {
                                    up();
                                }
                                else {
                                    if (getX() != getData(4)) {
                                        left();
                                    }
                                    else {
                                        setData(0, 5);
                                        setData(1, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            //5 Snake inside room
        }
    }

    public static void locateOpening(int x, int y) {
        int x1 = x + 11, y1 = y + 11, x2 = x - 1;

    }
}
