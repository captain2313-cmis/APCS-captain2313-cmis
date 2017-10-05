public class ArrayMungerSol
{
    public static void main(String[] args){
        int[] a = {0, 1, 2, 3, 4, 5};
        int[] b = {2, 3, 7, 6};
        int[] r = munge(a, b);
        for(int i: r){
            System.out.println(i);
        }
    }
    /**
     * Write a method that takes 2 integer arrays as arguments.
     * It should return the the array for which the sum of the first, last, and middle values is the greatest.
     * If the sum is equal, it should return an array that contains the sum of the first values, 
     * the sum of the middle values, and the sum of the last values.
     */
    public static int[] munge(int[] arr1, int[] arr2){

    }
}
