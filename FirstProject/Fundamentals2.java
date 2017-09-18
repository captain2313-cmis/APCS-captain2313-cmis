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
    
    
}
