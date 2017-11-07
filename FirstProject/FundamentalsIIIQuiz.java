public class FundamentalsIIIQuiz
{
    public static void main(String[] args){
        int[][] scores1 = new int[10][10];
        for(int y = 0; y < scores1.length; y++){
            for(int x = 0; x < scores1[0].length; x++){
                if(Math.random() > 0.95){
                    scores1[y][x] = 1;
                }else{
                    scores1[y][x] = 0;
                }
            }
        }
        int[][] scores2 = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
            };

        System.out.println("Test 1\n======");
        printArray(scores1);
        crossOut(scores1);
        printArray(scores1);

        System.out.println("Test 2\n======");
        printArray(scores2);
        crossOut(scores2);
        printArray(scores2);
    }

    public static void printArray(int[][] array){
        System.out.print("{");
        for(int r = 0; r < array.length; r++){
            int[] row = array[r];
            System.out.print("{");
            for(int c = 0; c < row.length;c++){
                System.out.print(row[c] + (c < row.length-1 ? ", " : ""));
            }
            System.out.print("}"+(r < array.length-1 ? ",\n" : ""));
        }

        System.out.println("}\n");            
    }

    /**
     * For each column that contains a 1, replace every value in that column with 1.
     * For each row that contains a 1, replace every value in that row with 1.
     * 
     * Sample out put from call to main(); Note: Array from Test 1 contains random values.
    Test 1
    ======
    Before
    ------
    {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}}

    After
    -----
    {{0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0}}

    Test 2
    ======
    Before
    ------
    {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}}

    After
    -----
    {{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}}
     */
    public static void crossOut(int[][] array){
        //Create Memory Arrays
        int[] i3  = new int[100];
        int[] i4 = new int[100];
        for (int ii = 0; ii < i3.length; ii++) {
            i3[ii] = -1;
            i4[ii] = -1;
        }

        //Record Coordinates
        for (int i1 = 0,  i3i = 0, i4i = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                if (array[i1][i2] != 0) {
                    i3[i3i] = i1;
                    i4[i4i] = i2;
                    i3i++;
                    i4i++;
                }
            }
        }

        //Color Horizontal
        for (int i3i = 0; i3i < i3.length; i3i++) {
            if (i3[i3i] != -1) {
                for (int i2 = 0; i2 < array[0].length; i2++) {
                    array[i3[i3i]][i2] = 1;
                }
            }
        }

        //Color Vertical
        for (int i4i = 0; i4i < i4.length; i4i++) {
            if (i4[i4i] != -1) {
                for (int i1 = 0; i1 < array.length; i1++) {
                    array[i1][i4[i4i]] = 1;
                }
            }
        }
    }
}
