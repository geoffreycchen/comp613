import java.util.stream.IntStream;



class Util{

    public static boolean isPrime(int number ){
        // returns a boolean true if the integer is prime, and false otherwise.
        IntStream intStream = IntStream.range(2, (int) Math.sqrt(number) + 1);
        return intStream.noneMatch(i -> number%i == 0);       
    }

}