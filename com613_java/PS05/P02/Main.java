import java.util.*;

class Util{

    public static double avgNonNeg(int[] args) {
        /*
         takes array of integers as the input argument, 
         and computes the double precision value of the average of the non-negative integers.  
         */

        return Arrays.stream(args)
                                .filter(i -> i>=0 )
                                .average()
                                .orElse(0.0);                
                            
    }


    public static Double avgNonNeg(double[] arr) {
        
        // take either an array of int, or an array of double, 
        // Signature: double avgNonNeg(int[]) OR double avgNonNeg(double[])
         
    
        return Arrays.stream(arr)
                                .filter(i -> i>=0 )
                                .average()
                                .orElse(0.0);   
    }
    
}
/* 
public class Main {
    public static void main(String[] args) {
        // Test with int array
        int[] intArray = { 1, 2, 3, 4, -5, 6, 7, -8, 9, 10 };
        double resultInt = Util.avgNonNeg(intArray);
        System.out.println("Average of non-negative integers: " + resultInt);

        // Test with double array
        double[] doubleArray = { 1.5, -2.0, 3.0, 4.5, -5.5, 6.0, 7.5, -8.0, 9.0, 10.5 };
        double resultDouble = Util.avgNonNeg(doubleArray);
        System.out.println("Average of non-negative doubles: " + resultDouble);
    }

}
*/