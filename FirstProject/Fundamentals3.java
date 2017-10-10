
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

    //setValue
    public static void setValue(int[][] arr, int r, int c, int v) {
        arr[r][c] = v;
    }

    public static void setValue(double[][] arr, int r, int c, double v) {
        arr[r][c] = v;
    }

    public static void setValue(String[][] arr, int r, int c, String v) {
        arr[r][c] = v;
    }

    //initializeArray
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
    
    //print2DArray
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
            
        }

    }
}
