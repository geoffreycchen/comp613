
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    // using a HashMap that takes list of strings from the command line and groups them into strings that are anagrams of each other.

    public static String sortString(String input){
        char[] chaArray = input.toCharArray();
        Arrays.sort(chaArray);
        return new String(chaArray);
    }

    public static void main(String[] args){
   
        HashMap<String, List<String>> anagrams  = new HashMap<>();
        for (String s : args){
            String sortedword = sortString(s);
            anagrams.computeIfAbsent(sortedword, key -> new ArrayList<>()).add(s);
        }
        for (String key : anagrams.keySet()){
            Integer count = 0;
            for (String word: anagrams.get(key)){
                if(count >0) {
                    System.out.print(" | ");

                }
                System.out.print(word);
                count++;
            }
            System.out.print("\n");
        }   
    }
}