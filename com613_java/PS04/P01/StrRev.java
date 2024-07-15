

class StrRev{

    public static String reversesString(String input){
        StringBuilder reversed= new StringBuilder();
        for(int i=input.length()-1; i>=0; i-- ){
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] args){

        String input = args[0];
        System.out.println(reversesString(input));
    }

}