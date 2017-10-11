import java.util.Random;

public class Fundamentals3 {
    //MAIN
    public static void main(String[] args) {
        //Declaring, Setting and Getting Values
        int[][] int5x5Array1 = new int[5][5];
        int[][] int5x5Array2 = {{0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0}, 
                {0, 0, 0, 0, 0}};
        double[][] double5x5Array1 = new double[5][5];
        double[][] double5x5Array2 = {{0.0, 0.0, 0.0, 0.0, 0.0}, 
                {0.0, 0.0, 0.0, 0.0, 0.0},
                {0.0, 0.0, 0.0, 0.0, 0.0},
                {0.0, 0.0, 0.0, 0.0, 0.0},
                {0.0, 0.0, 0.0, 0.0, 0.0}};
        String[][] cBoard8x8 = {{"#", " ", "#", " ", "#", " ", "#", " "}, 
                {" ", "#", " ", "#", " ", "#", " ", "#"}, 
                {"#", " ", "#", " ", "#", " ", "#", " "}, 
                {" ", "#", " ", "#", " ", "#", " ", "#"}, 
                {"#", " ", "#", " ", "#", " ", "#", " "}, 
                {" ", "#", " ", "#", " ", "#", " ", "#"}, 
                {"#", " ", "#", " ", "#", " ", "#", " "}, 
                {" ", "#", " ", "#", " ", "#", " ", "#"}};

        //System.out.println(int5x5Array1);
    }

    //3. setValue
    public static void setValue(int[][] arr, int r, int c, int v) {
        arr[r][c] = v;
    }

    public static void setValue(double[][] arr, int r, int c, double v) {
        arr[r][c] = v;
    }

    public static void setValue(String[][] arr, int r, int c, String v) {
        arr[r][c] = v;
    }

    //4. initializeArray
    public static void initializeArray(int[][] array, int value) {
        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                array[i1][i2] = value;
            }
        }
    }

    public static void initializeArray(double[][] array, double value) {
        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                array[i1][i2] = value;
            }
        }
    }

    public static void initializeArray(boolean[][] array, boolean value) {
        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                array[i1][i2] = value;
            }
        }
    }

    public static void initializeArray(String[][] array, String value) {
        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                array[i1][i2] = value;
            }
        }
    }

    //5. print2DArray
    public static void print2DArray(int[][] array, boolean rowMajor) {
        if (rowMajor) {
            /*System.out.print("{");
            for (int i1 = 0; i1 < array.length; i1++) {
            System.out.print("{");
            if (i1 < array.length - 1) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
            if (i2 < array[i1].length - 1) {
            System.out.print(array[i1][i2] + ", ");
            }
            else {
            System.out.print(array[i1][i2] + "}, ");
            }
            }
            }
            else {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
            if (i2 < array[i1].length - 1) {
            System.out.print(array[i1][i2] + ", ");
            }
            else {
            System.out.print(array[i1][i2] + "}");
            }
            }
            System.out.print("}");
            }
            }*/
            for (int i1 = 0; i1 < array.length; i1++) {
                for (int i2 = 0; i2 < array[i1].length; i2++) {
                    System.out.print(array[i1][i2] + " ");
                }
                System.out.print("\n");
            }
        }
        else {
            for (int i1 = 0; i1 < array[0].length; i1++) {
                for (int i2 = 0; i2 < array.length; i2++) {
                    System.out.print(array[i2][i1] + " ");
                }
                System.out.print("\n");
            }
        }
    }
    
    public static void print2DArray(double[][] array, boolean rowMajor) {
        if (rowMajor) {
            for (int i1 = 0; i1 < array.length; i1++) {
                for (int i2 = 0; i2 < array[i1].length; i2++) {
                    System.out.print(array[i1][i2] + " ");
                }
                System.out.print("\n");
            }
        }
        else {
            for (int i1 = 0; i1 < array[0].length; i1++) {
                for (int i2 = 0; i2 < array.length; i2++) {
                    System.out.print(array[i2][i1] + " ");
                }
                System.out.print("\n");
            }
        }
    }
    
        public static void print2DArray(boolean[][] array, boolean rowMajor) {
        if (rowMajor) {
            for (int i1 = 0; i1 < array.length; i1++) {
                for (int i2 = 0; i2 < array[i1].length; i2++) {
                    System.out.print(array[i1][i2] + " ");
                }
                System.out.print("\n");
            }
        }
        else {
            for (int i1 = 0; i1 < array[0].length; i1++) {
                for (int i2 = 0; i2 < array.length; i2++) {
                    System.out.print(array[i2][i1] + " ");
                }
                System.out.print("\n");
            }
        }
    }
    
        public static void print2DArray(String[][] array, boolean rowMajor) {
        if (rowMajor) {
            for (int i1 = 0; i1 < array.length; i1++) {
                for (int i2 = 0; i2 < array[i1].length; i2++) {
                    System.out.print(array[i1][i2] + " ");
                }
                System.out.print("\n");
            }
        }
        else {
            for (int i1 = 0; i1 < array[0].length; i1++) {
                for (int i2 = 0; i2 < array.length; i2++) {
                    System.out.print(array[i2][i1] + " ");
                }
                System.out.print("\n");
            }
        }
    }
    
    //6. snakePrint
    public static void snakePrint(int[][] arr) {
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (i1%2 != 1) {
                for (int i2 = 0; i2 < arr[i1].length; i2++) {
                    System.out.print(arr[i1][i2] + " ");
                }
            }
            else {
                for (int i2 = arr[i1].length - 1; i2 >= 0; i2--) {
                    System.out.print(arr[i1][i2] + " ");
                }
            }
        }
    }
    
    //7. locate
    /*public static String[][] locate(String[][] arr) {
        
        boolean foundHash = false;
        while (!foundHash) {
            
        }
    }*/
    
    //8. replace
    public static int[][] replace(int[][] array, int threshold, int newValue) {
        int[][] resultArray = new int[array.length][array[0].length];
        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                if (array[i1][i2] > threshold) {
                    resultArray[i1][i2] = threshold;
                }
                else {
                    resultArray[i1][i2] = array[i1][i2];
                }
            }
        }
        return resultArray;
    }
    
    //9. shift
    //10. rotate
    //11. analyze
}
