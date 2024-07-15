import java.util.stream.Stream;


class Util {

    public static int fib(int n) {
        // computes the nth Fibonacci number
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        return Stream.iterate(new int[]{0, 1},
                                        fibPair -> new int[]{fibPair[1], fibPair[0] + fibPair[1]})
                .limit(n+1)
                .mapToInt(fibPair -> fibPair[0])
                .skip(n )
                .findFirst()
                .orElse(0);
    }
}


