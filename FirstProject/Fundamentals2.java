public class Fundamentals2 {
    //MAIN
    public static void main(String[] args) {
        int[] intArray = {2, 4, 5, 7, 8};
        double[] doubleArray = {2.1, 4.2, 5.3, 7.4, 8.5};
        String[] stringArray = {"as", "sd", "df", "fg", "gh"};

        System.out.println(intArray[0] + "\n" + doubleArray[2] + "\n" + stringArray[4]);

        printArray(intArray, true);
    }

    //Print Array
    public static void printArray(int[] a, boolean isAlternating) {
        String result = "";
        if (isAlternating) {
            for (int i = 0; i <= a.length; i += 2) {
                result += a[i] + "\n";
            }
        }
        else {
            for (int i = 0; i < a.length; i++) {
                result += a[i] + "\n";
            }
        }
        System.out.println(result);
    }

    public static void printArray(double[] a, boolean isAlternating) {
        String result = "";
        if (isAlternating) {
            for (int i = 0; i <= a.length; i += 2) {
                result += a[i] + "\n";
            }
        }
        else {
            for (int i = 0; i < a.length; i++) {
                result += a[i] + "\n";
            }
        }
        System.out.println(result);
    }

    public static void printArray(String[] a, boolean isAlternating) {
        String result = "";
        if (isAlternating) {
            for (int i = 0; i <= a.length; i += 2) {
                result += a[i] + "\n";
            }
        }
        else {
            for (int i = 0; i < a.length; i++) {
                result += a[i] + "\n";
            }
        }
        System.out.println(result);
    }

    //Last Item
    public static int lastItem(int[] a) {
        return a[a.length - 1];
    }

    public static double lastItem(double[] a) {
        return a[a.length - 1];
    }

    public static String lastItem(String[] a) {
        return a[a.length - 1];
    }

    //Middle Item
    public static int middleItem(int[] a) {
        return a[a.length/2];
    }

    public static double middleItem(double [] a) {
        return a[a.length/2];
    }

    public static String middleItem(String[] a) {
        return a[a.length/2];
    }

    //Copy
    public static int[] copy(int[] array) {
        int[] arrayCopy = new int[array.length]; 
        for (int i = 0; i < array.length; i ++) {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }

    public static double[] copy(double[] array) {
        double[] arrayCopy = new double[array.length]; 
        for (int i = 0; i < array.length; i ++) {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }

    public static String[] copy(String[] array) {
        String[] arrayCopy = new String[array.length]; 
        for (int i = 0; i < array.length; i ++) {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }
    
    //Pairs
    public static int[] pairs(int n) {
        int[] pairsArray = new int[2*n];
        int nCopy = n;
        for (int i = 2*n; i >= 0; i -= 2) {
            pairsArray[i] = 2*nCopy;
            pairsArray[i - 1] = 2*nCopy;
            nCopy--;
        }
        return pairsArray;
    }
    
    //concat
    public static int[] concat(int[] a, int[] b) {
        int[] resultArray = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            resultArray[i] = a[i];
        }
        //for (int i = a.length
        return resultArray;
    }
}
