    /*
     * #1 Write a method that returns the sum of the squares 
     * of 2 whole numbers given as arguments.
     * 
     * #2 Call the method from the main method. The call
     * should get its arguments from variables declared 
     * in the main method.
     */
    
    /*
     * #3 Write a method that returns the average of 3 decimals
     * given as arguments.
     * 
     * #4 Call the method from the main method. The call should get its 
     * arguments from variables declared in the main method.
     */
public class FundamentalsQuiz1
{
    public static void main(String[] args) {
        int x = 2, y = 3;
        double m = 2.1, n = 3.2, o = 4.3;
        
        System.out.println("Sum of squares:");
        System.out.println(sumofsquares(x, y));
        
        System.out.println("\nAverage of three decimals:");
        System.out.println(avgof3dec(m, n, o));
    }
    
    public static int sumofsquares(int a, int b) {
        int a_sq = a*a;
        int b_sq = b*b;
        
        return a_sq + b_sq;
    }
    
    public static double avgof3dec(double a, double b, double c) {
        return (a + b + c)/3;
    }
}