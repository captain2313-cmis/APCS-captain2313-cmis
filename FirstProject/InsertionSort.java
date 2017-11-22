public class InsertionSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(int[] array) {
        for (int i1 = 1; i1 < array.length; i1++) {
            boolean sorted = false;
            for (int i2 = 0; i2 < i1 && !sorted; i2++) {
                
            }
        }
    }
}