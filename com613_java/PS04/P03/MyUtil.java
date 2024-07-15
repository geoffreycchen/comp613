class MyUtil {


    public static String my2Upper(String input){
        char[]  lowercase =  "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[]  upppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        // Convert the input string to an array of characters


        char[] inputChar = input.toCharArray();

        for (int i =0; i<inputChar.length; i++){
            int index = indexOfChar(lowercase, inputChar[i]);

            if (index>=0) {
                inputChar[i]= upppercase[index];
            }
        }
        return new String(inputChar);
    }
        
    

    private static int indexOfChar(char[] array, char target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
            return -1;   
    }


    public static void main(String[] args){
        String aa = args[0];
    
        System.out.println(my2Upper(aa));
    
    }
}



