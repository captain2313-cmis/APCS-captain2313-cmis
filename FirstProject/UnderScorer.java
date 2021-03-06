
/**
 * A) Write a method called underScore
 * 
 * The method should return values as follows:
 * +===============+================+
 * |  Method Call  |  return value  |
 * +===============+================+
 * | underScore(0) | "0"            |
 * | underScore(1) | "1_"           |
 * | underScore(2) | "2_0"          |
 * | underScore(3) | "3_1_"         |
 * | underScore(4) | "4_2_0"        |
 * | underScore(5) | "5_3_1_"       |
 * | underScore(6) | "6_4_2_0"      |
 * | underScore(7) | "7_5_3_1_"     |
 * | underScore(8) | "8_6_4_2_0"    |
 * | underScore(9) | "9_7_5_3_1_"   |
 * +---------------+----------------+
 * 
 * B) Call underScore from the main method and print out the results
 *    for all values from 0 to 100.
 */

public class UnderScorer {
    public static void main(String[] args){
        for (int a = 0; a < 100; a++) {
            System.out.println(underScore(a));
        }
    }

    public static String underScore(int a) {
        String result = "";
        if (a%2 == 0) {
            for (; a > 0; a -= 2) {
                result += a + "_";
            }
            return result + 0;
        }
        else {
            for (; a > 0; a -= 2) {
                result += a + "_";
            }
            return result;
        }
    }
}