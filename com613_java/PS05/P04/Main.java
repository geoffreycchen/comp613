
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;


class Util{

    public static String longestPal(List<String> input) {
        //returns the longest palindromic string in the list.
        return input.stream()
        .filter(Util::isPalindrome)
        .max(java.util.Comparator.comparingInt(String::length))
        .orElse("");                   
    }

    public static boolean isPalindrome(String text){
        int l = text.length();
        return IntStream.range(0, l / 2)
                .allMatch(i -> text.charAt(i) == text.charAt(l - i - 1));

    }

}