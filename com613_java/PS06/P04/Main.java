

public class Main {

    public static void main(String[] args) {
        
        // attempts to convert 1 string from the command line into a valid double precision floating point number.
        String inputString = args[0];

        try {
            // Attempt to convert to double
            double result = Double.parseDouble(inputString);
            System.out.println(result);
        } catch (NumberFormatException e1) {
            try {
                // Attempt to convert to integer and then to double
                int intValue = Integer.parseInt(inputString);
                double result = (double) intValue;
                System.out.println(result);
            } catch (NumberFormatException e2) {
                System.out.println("Invalid Double Precision Number");
            }
        }
       
    }
}