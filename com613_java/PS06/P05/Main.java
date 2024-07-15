import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // reads input from the 1st file on the command line (args[0]), transforms the input, and 
        // writes the transformed input to file name in the 2nd command line argument (args[1]).

        if (args.length != 2) {
            System.out.println("Usage: java TransformAndWrite <inputFileName> <outputFileName>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try (Stream<String> lines = Files.lines(Paths.get(inputFile))) {
            List<String> transformedLines = lines.map(Main::transformLine)
                                                .collect(Collectors.toList());

            Files.write(Paths.get(outputFile), transformedLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String transformLine(String line) {

        // produce the max value of the valid doubles from that line. 
        List<Double> validDoubles = Arrays.stream(line.split("\\s+"))
                .map(Main::parseDouble)
                .filter(Double::isFinite)
                .collect(Collectors.toList());

        if (validDoubles.isEmpty()) {
            return "(No Valid Numbers on Line)";
        } else {
            double max = validDoubles.stream().mapToDouble(Double::doubleValue).max().orElse(Double.NaN);
            return String.valueOf(max);
        }
    }

    private static double parseDouble(String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return Double.NaN;
        }
    }
}