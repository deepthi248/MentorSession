package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepitition_slidingWindow {
    public static void main(String[] args) {
    String [] str = {"abcabcbb","abbbb","abccde","pwwkew","","abba"};
    for(String string: str)
             System.out.println(longestSubstring(string));
    }
    public static int longestSubstring(String str){
        int startIndex = 0, length = Integer.MIN_VALUE;
        Map<Character, Integer> myMap = new HashMap<>();
        if( str.length() == 0 || str.equals("") || str.equals(" ")){
            length=0;
        }
        else {

            for (int endIndex = 0; endIndex < str.length(); endIndex++) {
                Character left = str.charAt(endIndex);

                if (myMap.containsKey(left)) {
                    startIndex++;
                    for (int i = 0; i <= endIndex; i++)
                        myMap.remove(str.charAt(i));
                } else {
                    myMap.put(left, 1);
                }
                length = Math.max(myMap.size(), length);
            }
        }
        return length;
    }
}
/* Op:
3
2
3
3
0
2
 */
