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
        int hold;
        for (int i = 1; i < array.length; i++) {
            for (int i1 = i; i1 > 0; i1--) {
                if (array[i1] < array[i1 - 1]) {
                    hold = array[i1];
                    array[i1] = array[i1 - 1];
                    array[i1 - 1] = hold;
                }
            }
        }
    }
}