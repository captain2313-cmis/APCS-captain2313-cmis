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
            //for wave from bottom.
            boolean sorted = false;
            int iDiff = 1;
            if (array[i1] > array[i1 - iDiff]) {
                    sorted = true;
                }
            while (iDiff != i1 && !sorted) {
                if (array[i1] > array[i1 - iDiff]) {
                    int hold2 = array[i1 - iDiff + 1];
                    array[i1 - iDiff + 1] = array[i1];
                    int hold1 = hold2;
                    for (int i2 = i1 - iDiff + 2; i2 <= i1; i2++) {
                        hold2 = array[i2];
                        array[i2] = hold1;
                        hold1 = hold2;
                    }
                    sorted = true;
                }
                else {
                    iDiff++;
                }
            }
        }
    }
}