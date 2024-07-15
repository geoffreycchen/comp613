import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



class Util{
    public static List<Integer> kseq(int num ){
        IntStream intStream = IntStream.range(1, num);
        return intStream.mapToObj(i -> (int) (Math.pow(3, i)-1)/2).filter(i -> i<=num).collect(Collectors.toList());  
    }
}