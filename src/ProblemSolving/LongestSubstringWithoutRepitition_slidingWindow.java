package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepitition_slidingWindow {
    public static void main(String[] args) {
    String str = "poiuytttr";
    System.out.print(longestSubstring(str));
    }
    public static int longestSubstring(String str){
        int startIndex=0, length =Integer.MIN_VALUE;
        Map<Character,Integer> myMap = new HashMap<>();
        for( int endIndex=0; endIndex < str.length(); endIndex++){
            Character left = str.charAt(endIndex);

            if(myMap.containsKey(left)){
                startIndex++;
                for( int i =0; i<=endIndex;i++)
                    myMap.remove(str.charAt(i));
            }
            else{
                myMap.put(left,1);
            }
           length = Math.max(myMap.size(), length);
        }
        return length;
    }
}
