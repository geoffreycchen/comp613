
import java.util.Arrays;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        // takes a list of strings from the command line, then counts the frequency of each word in the text.
        TreeMap<String, Integer> tm = new TreeMap<>();
        
        Arrays.stream(args)
                .forEach(w -> tm.put(w, tm.getOrDefault(w, 0) + 1));
        
        tm.forEach((k, v) -> System.out.printf("%s: %d%n", k, v));
    }
}