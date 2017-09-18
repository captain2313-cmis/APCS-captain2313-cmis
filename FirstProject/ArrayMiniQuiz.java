
public class ArrayMiniQuiz
{
    public static void main(String[] args){
        int[] a1 = {2, 4, 6, 8, 10, 12};
        int[] a2 = new int[5];

        a2[0] = a1[a1.length - 1];
        a2[1] = a1[a1.length - a1[0]];
        a2[a1[1]] = a1[a2[a1[1]]];
        a2[a2[a2.length - 1]] = a1[a1[1]];
        a2[a1[1] - 1] = a1[1] - a2[a2.length - 1];
        
        printArray(a2);
    }

    public static void printArray(int[] a) {
        String result = "";
        for (int i = 0; i < a.length; i++) {
            result += a[i] + "\n";
        }
        System.out.println(result);
    }
}