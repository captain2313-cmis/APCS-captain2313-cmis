public class Fundamentals2 {
    public static void main(String[] args) {
        int[] intArray = {2, 4, 5, 7, 8};
        double[] doubleArray = {2.1, 4.2, 5.3, 7.4, 8.5};
        String[] stringArray = {"as", "sd", "df", "fg", "gh"};
        
        System.out.println(intArray[0] + "\n" + doubleArray[2] + "\n" + stringArray[4]);
        
        printArray(intArray, true);
    }
    
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
}
