import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // finds the most common string in a text file using a HashMap
        
        String fileName = args[0];

        try ( Stream<String> allLines  = Files.lines(Paths.get(fileName)) ) {

            HashMap<String, Integer> stringCount = new HashMap<>();
            allLines.forEach(line -> stringCount.put(line, stringCount.getOrDefault(line, 0) + 1));

            Integer mx = stringCount.values()
                                        .stream()
                                        .max(Integer::compare) // need to ask 
                                        .orElse(null);
            stringCount.entrySet()
                                .stream()
                                .filter(x->x.getValue().equals(mx))
                                .map(Map.Entry:: getKey)
                                .forEach(System.out:: println);             
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
