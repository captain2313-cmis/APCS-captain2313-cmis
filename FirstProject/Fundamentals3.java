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
    public static String[][] locate(String[][] arr) {
        boolean isHashReplaced = false;
        double intLocation = Math.random();
        int totalHashes = (arr.length*arr[0].length)/2;
        int hashCounted = 0;
        double prob = hashCounted/totalHashes;
        Random rand = new Random();
        int randomInt = rand.nextInt(10);
        String randomIntStr = "";
        if (randomInt == 0) {
            randomIntStr = "0";
        }
        else if (randomInt == 1) {
            randomIntStr = "1";
        }
        else if (randomInt == 2) {
            randomIntStr = "2";
        }
        else if (randomInt == 3) {
            randomIntStr = "3";
        }
        else if (randomInt == 4) {
            randomIntStr = "4";
        }
        else if (randomInt == 5) {
            randomIntStr = "5";
        }
        else if (randomInt == 6) {
            randomIntStr = "6";
        }
        else if (randomInt == 7) {
            randomIntStr = "7";
        }
        else if (randomInt == 8) {
            randomIntStr = "8";
        }
        else {
            randomIntStr = "9";
        }
        for (int i1 = 0; !isHashReplaced; i1++) {
            for (int i2 = 0; !isHashReplaced; i2++) {
                if (intLocation > prob) {
                    if (arr[i1][i2] == "#") {
                        hashCounted += 1;
                    }
                }
                else {
                    arr[i1][i2] = randomIntStr;
                    isHashReplaced = true;
                }
            }
        }
        return arr;
    }

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
    public static double[][] shift(double[][] arr, int row) {
        double[] shiftRow = new double[arr[0].length];
        Random rand = new Random();
        double randomDouble = (double) (rand.nextInt(10)) + rand.nextFloat();
        for (int i = 0; i < shiftRow.length; i++) {
            shiftRow[i] = randomDouble;
        }
        double[][] resultArray = new double[arr.length][arr[0].length];
        for (int i1 = 0, i2 = 0; i1 < arr.length; i1++, i2++) {
            if (i1 == row) {
                resultArray[i1] = shiftRow;
                i2 -= 1;
            }
            else {
                for (int i3 = 0; i3 < arr[0].length; i3++) {
                    resultArray[i1][i3] = arr[i2][i3];
                }
            }
        }
        return resultArray;
    }

    //10. rotate
    public static double[][] rotate(double[][] arr) {
        double[][] resultArray = new double[arr[0].length][arr.length];
        for (int i1 = 0; i1 < resultArray.length; i1++) {
            for (int i2 = 0; i2 < resultArray[0].length; i2++) {
                resultArray[i1][i2] = arr[i2][i1];
            }
        }
        return resultArray;
    }

    //11. analyze
    public static boolean[][] analyze(double[][] array, double threshold) {
        boolean[][] resultArray = new boolean[array.length][array[0].length];
        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[0].length; i2++) {
                if (array[i1][i2] > threshold) {
                    resultArray[i1][i2] = true;
                }
                else {
                    resultArray[i1][i2] = false;
                }
            }
        }
        return resultArray;
    }
}
