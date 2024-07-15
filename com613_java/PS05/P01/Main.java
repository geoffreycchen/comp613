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
}


