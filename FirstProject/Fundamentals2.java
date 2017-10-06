import java.util.Random;

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

    //randomInts
    public static int[] randomInts(int n, int min, int max) {
        int[] resultArray = new int[n];
        Random rand = new Random();
        int randomInt = rand.nextInt((max - min) +1) + min;
        for (int i = 0; i < n; i++) {
            resultArray[i] = randomInt;
        }
        return resultArray;
    }

    //randomDoubles
    public static double[] randomDoubles(int n, int min, int max) {
        double[] resultArray = new double[n];
        Random rand = new Random();
        double randomDouble = (double) (rand.nextInt((max - min)) + min) + rand.nextFloat();
        for (int i = 0; i < n; i++) {
            resultArray[i] = randomDouble;
        }
        return resultArray;
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
        for (int i1 = a.length, i2 = 0; i1 < (a.length + b.length); i1++, i2++) {
            resultArray[i1] = b[i2];
        }
        return resultArray;
    }

    //Merge**
    public static int[] merge(int[] a, int[] b) {
        int[] resultArray = new int[a.length + b.length];
        boolean isOnA = true;
        for (int i = 0, iA = 0, iB = 0; i < (a.length + b.length); i++) {
            if (isOnA) {
                if (iA < a.length) {
                    resultArray[i] = a[iA]; //put this in while loop(for both a and b)
                    iA++;
                    isOnA = false;
                }
                else {
                    iA++;
                    isOnA = false;
                }
            }
            else {
                if (iB < b.length) {
                    resultArray[i] = b[iB];
                    iB++;
                    isOnA = true;
                }
                else {
                    iB++;
                    isOnA = true;
                }
            }
        }
        return resultArray;
    }

    //reverse
    public static void reverse(int[] array) {
        int[] resultArray = new int[array.length];
        for (int i1 = array.length - 1, i2 = 0; i1 >= 0; i1--, i2++) {
            resultArray[i2] = array[i1];
        }
        array = resultArray;
    }

    //subArray
    public static int[] subArray (int[] array, int start, int stop) {
        int[] resultArray = new int[stop - start + 1];
        for (int i1 = 0, i2 = start; i2 <= stop; i1++, i2++) {
            resultArray[i1] = array[i2];
        }
        return resultArray;
    }

    //comareArrays
    public static int[] compareArrays(int[] a, int[] b) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sum2 += b[i];
        }
        if (sum1 > sum2) {
            return a;
        }
        else {
            return b;
        }
    }

    //minimize
    public static int[] minimize(int[] array, int threshold) {
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > threshold) {
                resultArray[i] = threshold;
            }
            else {
                resultArray[i] = array[i];
            }
        }
        return resultArray;
    }

    //maximize
    public static void maximize(int[] array, int threshold) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < threshold) {
                array[i] = threshold;
            }
            else {
                array[i] = array[i];
            }
        }
    }

    //maxMerge
    public static double[] maxMerge(double[] a, double[] b) {
        int minLen = 0;
        int maxLen = 0;
        boolean aIsShorter = true;
        if (a.length < b.length) {
            minLen = a.length;
            maxLen = b.length;
            aIsShorter = true;
        }
        else {
            minLen = b.length;
            maxLen = a.length;
            aIsShorter = false;
        }
        double[] r = new double[maxLen];
        int i = 0;
        for (; i < minLen; i++) {
            if (a[i] > b[i]) {
                r[i] = a[i];
            }
            else {
                r[i] = b[i];
            }
        }
        for (; i < maxLen; i++) {
            if (aIsShorter) {
                r[i] = b[i];
            }
            else {
                r[i] = a[i];
            }
        }
        return r;
    }
}
