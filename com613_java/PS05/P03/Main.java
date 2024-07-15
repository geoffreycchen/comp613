
import java.util.*;
import java.util.stream.*;

class Util{

    public static Double avgNonNegS(Stream<Number> stream) {
        //takes a Stream<Number> as input argument, , 
        return stream
           .filter(i -> i.doubleValue() >=0 )
           .mapToDouble(Number::doubleValue) //retrieve the numeric value of the Number object as a double on Integer, Double, Float,
           .average()
           .orElse(0.0);                           
   }



    public static double avgNonNeg(int[] arr) {
        Stream<Number> stream = Arrays.stream(arr)
                                            .boxed()
                                            .map(Number.class :: cast);
        return avgNonNegS(stream);
    }

    public static Double avgNonNeg(double[] arr) {
        Stream<Number> stream = Arrays.stream(arr)
                                            .boxed()
                                            .map(Number.class :: cast);
        return avgNonNegS(stream);
    }
    
    public static Double avgNonNeg(List<Number> list) {
        Stream<Number> stream = list.stream();
        return avgNonNegS(stream);
    }
    


    /* 
    public static Double avgNonNegS(Stream<? extends Number> args) {
         //takes a Stream<Number> as input argument, , 
         return args
            .filter(i -> i.doubleValue() >=0 )
            .mapToDouble(Number::doubleValue) //retrieve the numeric value of the Number object as a double on Integer, Double, Float,
            .average()
            .orElse(0.0);                           
    }
    */
   }