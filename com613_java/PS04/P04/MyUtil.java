class MyUtil {
    
    
    public static String reversesString(String input){
        StringBuilder reversed= new StringBuilder();
        for(int i=input.length()-1; i>=0; i-- ){
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String str){
        String strNoSpace = str.replace(" ","");
        String rev = reversesString(strNoSpace);
        return rev.equals(strNoSpace);

    }
        
}
