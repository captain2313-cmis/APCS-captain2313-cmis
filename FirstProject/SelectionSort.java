public class SelectionSort
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

    public static void sort(int[] array){
        int hold = 0;
        for (int iSttc = 0; iSttc < array.length; iSttc++) {
            int iLow = iSttc;
            for (int i1 = iSttc; i1 < array.length; i1++) {
                if (array[iLow] > array[i1]) {
                    iLow = i1;
                }
            }
            hold = array[iSttc];
            array[iSttc] = array[iLow];
            array[iLow] = hold;
        }
    }
}
