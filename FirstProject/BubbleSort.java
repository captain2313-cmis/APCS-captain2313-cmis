
/**
 * Write a description of class BubbleSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSort
{
    public static void main(String[] args) {
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }
    
    public static void print(int[] array) {
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }
    
    public static void sort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i1 = 0, i2 = 1; i2 < array.length; i1++, i2++) {
                if (array[i1] > array[i2]) {
                    isSorted = false;
                    int hold = array[i1];
                    array[i1] = array[i2];
                    array[i2] = hold;
                }
            }
        }
    }
}
