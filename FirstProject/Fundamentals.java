
import java.util.Scanner;
import java.util.Random;
public class Fundamentals
{
    public static void main(String[] args) {
        //Title
        System.out.println("APCS Fundamentals 1\n");

        //dataTypes
        System.out.println("----------------\n" + "dataTypes\n");
        dataTypes();

        //Addition and Multiplication(hard-coded)
        System.out.println("----------------\n" + "Calling add and multiply methods using hard coded variables as arguments.\n\nFor integers:");
        int sum1 = add(6, 2);
        int prod1 = mul(6, 2);
        System.out.println("6 + 2 = " + sum1 + "\n6 * 2 = " + prod1 + "\n");

        System.out.println("For doubles:");
        double sum2 = add(6.1d, 2.3d);
        double prod2 = mul(6.1d, 2.3d);
        System.out.println("6.1 + 2.3 = " + sum2 + "\n6.1 * 2.3 = " + prod2 + "\n");

        //Subtraction and Division(user-input)
        Scanner user_input = new Scanner(System.in);

        System.out.println("----------------\n" + "Calling subtract and divide methods using user input variables as arguments.");
        System.out.print("Type an integer that will be used as a minuend and dividend: ");
        int num_1 = (int) user_input.nextInt();
        System.out.print("Type an integer that will be used as a subtrahend and divisor: ");
        int num_2 = (int) user_input.nextInt();

        int diff1 = sub(num_1, num_2);
        int quo1 = div(num_1, num_2);
        System.out.println(num_1 + " - " + num_2 + " = " + diff1 + "\n" + num_1 + " / " + num_2 + " = " + quo1 + "\n");

        System.out.println("For doubles:");
        System.out.print("Type a decimal number that will be used as a minuend and dividend: ");
        double num_3 = (double) user_input.nextDouble();
        System.out.print("Type a decimal number that will be used as a subtrahend and divisor: ");
        double num_4 = (double) user_input.nextDouble();

        double diff2 = sub(num_3, num_4);
        double quo2 = div(num_3, num_4);
        System.out.println(num_3 + " - " + num_4 + " = " + diff2 + "\n" + num_3 + " / " + num_4 + " = " + quo2 + "\n");

        //Conditionals
        System.out.println("----------------\n" + "Calling conditionals.");
        System.out.println("i. compare\na = 10 and b = 15.");
        compare(10, 15);

        System.out.println("\nii. evenOddZero\nIt will return 1 if the number is even, -1 if it is odd, and 0 if it is zero\nnumber used: 7");
        System.out.println(evenOddZero(7));
    }

    //Data Types
    public static void dataTypes() {
        String booldesc = "i. boolean\nBoolean data type represents one bit of information with two possible values: true of false (1 or 0). Its default value is False.\n";
        String bytedesc = "ii. byte\nByte data is an 8-bit signed two's compliment integer that has a minimu value of -128 and maximum of 127(inclusive).\nIts default value is 0.\n";
        String chardesc = "iii. char\nChar data type is a single 16-bit Unicode character ranging from 0 to 65,535 inclusive.\n";
        String shortdesc = "iv. short\nShort data is 16-bit signed two's compliment integer ranging from -32,768 to 32,767 (inclusive). Its default value is zero.\n";
        String intdesc = "v. int\nint stands for integer. It is a 32-bit signed two's complent integer ranging from -2^31 to 2^31 - 1 (inclusive). Its default value is 0.\n";
        String longdesc = "vi. long\nLong data type is a 64-bit signed two's complement integer ranging from -2^63 to 2^63 - 1 (inclusive). Its default value is 0L.\n";
        String floatdesc = "vii. float\nFloat data type is a single-precision 32-bit IEEE 754 floating point. Its default value is 0.0f.\n";
        String doubledesc = "viii. double\nDouble data type is a double-precision 64-bit IEEE 754 floating point. Its default value is 0.0d\n";

        System.out.println(bytedesc + "\n" + bytedesc + "\n" + chardesc + "\n" + shortdesc + "\n" + intdesc + "\n" + longdesc + "\n" + floatdesc + "\n" + doubledesc);
    }

    //mathematical functions for integers
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int sub(int a, int b) {
        int diff = a - b;
        return diff;
    }

    public static int mul(int a, int b) {
        int prod = a*b;
        return prod;
    }

    public static int div(int a, int b) {
        int quo = a/b;
        return quo;
    }

    //mathematical functions for doubles
    public static double add(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static double sub(double a, double b) {
        double diff = a - b;
        return diff;
    }

    public static double mul(double a, double b) {
        double prod = a*b;
        return prod;
    }

    public static double div(double a, double b) {
        double quo = a/b;
        return quo;
    }

    //Conditionals
    public static void compare(int a, int b) {
        if (a > b) {
            System.out.println("The value of a is " + a + " and it is greater than b whose value is " + b + ".");
        }
        else if (a < b) {
            System.out.println("The value of a is " + a + " and it is less than b whose value is " + b + ".");
        }
        else {
            System.out.println("The value of a is " + a + " and it is equal to b whose value is " + b + ".");
        }
    }

    public static int evenOddZero(int a) {
        if (a%2 == 0) {
            return 1;
        }
        else if (a%2 != 0) {
            return -1;
        }
        else {
            return 0;
        }
    }

    //Loops
    public static void squareTable() {
        Random rand = new Random();

        for (int a = 1; a <= 10; a++) {
            System.out.println(a + "\t" + (int) Math.pow(a, 2) + "\t" + (rand.nextInt(((int) Math.pow(a, 2) - a) + 1) + a));
        }
    }

    public static int triangle(int a) {
        int result = 0;

        for (; a > 0; a--) {
            result += a;
        }

        return result;
    }

    public static int pyramid(int a) {
        int result = 0;

        for (; a > 0; a--) {
            result += a*a;
        }

        return result;
    }

    //The Hard One
    /*    
     *    public static String checkerboard(int h, int w) {
     *        String lid = "";
     *
     *        while (w > 0) {
     *            lid += "-";
     *            w--;
     *        }
     *
     *        lid = "+" + lid + "+";
     *
     *        int hCopy = h;
     *        int wCopy = 4;
     *        String body = "";
     *        for (;hCopy > 0; hCopy--) {
     *            wCopy = w;
     *            int wCopy2 = w;
     *
     *            String row = "";
     *            for (; wCopy2 > 0; wCopy2--) {
     *                if ((h - hCopy)%2 == 0) {
     *                    for (;wCopy > 0; wCopy--) {
     *                        if ((w - wCopy)%2 == 0) {
     *                            row += "#";
     *                        }
     *                        else {
     *                            row += " ";
     *                        }
     *                    }
     *                }
     *                else {
     *                    for (;wCopy > 0; wCopy--) {
     *                        if ((w - wCopy)%2 == 0) {
     *                            row += " ";
     *                        }
     *                        else {
     *                            row += "#";
     *                        }
     *                    }
     *                }
     *            }
     *            row = "|" + row + "|";
     *            body += row;
     *        }
     *        String grid = lid + "\n" + body + "\n" + lid;
     *        return body;
     *         }
     */

    public static String checkerboard(int h, int w){
        String body = ""; 
        double totalHashes = ((h*w)+1)/2;
        double hashadded = 0;
        double intLocation = Math.random();
        boolean isIntInserted = false;
         
        String lid = "+";
        for(int x = 0; x < w; x++) {
            lid += "-";
        }
        lid += "+";
        
        body += lid + "\n";
        for(int y = 0; y < h; y++) {
            body += "|";
            for(int x = 0; x < w; x++) {
                boolean g = ((y % 2) + (x % 2)) != 1;
                if(g) {
                    hashadded++;
                    double prob = hashadded / totalHashes;
                    if(intLocation <  prob && isIntInserted == false) {
                        body += (int)(Math.random() * 10);
                        isIntInserted = true;
                    }
                    else{
                        body += "#";
                    }
                }
                else {
                    body += " ";
                }

            }
            body += "|\n";
        }
        body += lid;
        
        return body;
    }

    public static void test() {

    }
}