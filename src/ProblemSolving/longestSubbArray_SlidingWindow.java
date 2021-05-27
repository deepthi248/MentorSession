package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class longestSubbArray_SlidingWindow {
    public static void main(String[] args) {
        String str = "araacia";

        System.out.print(longestSub(str,2));
    }
    public static int longestSub(String str, int k ){
        // first corner cases
        if( k > str.length() || str == null || str.length()==0){
            return -100;
        }

            //1. traverse the array
        int startIndex=0, endIndex= 0,  maxLength = Integer.MIN_VALUE;
        Map<Character, Integer > myMap = new HashMap<>();

        for( endIndex =0; endIndex< str.length(); endIndex++) {
                /* getting the char and adding into map */

                //getting the characters of the window
            Character left_char = str.charAt(endIndex);
                //if its already present then add the freq else with 1

            myMap.put(left_char, myMap.getOrDefault(left_char, 0) + 1);

            //while window size is greater --- remove the last element from left side

            while (myMap.size() > k) {
                    //removing the left most element -- startIndex
                Character leftmost = str.charAt(startIndex);

                myMap.put(leftmost, myMap.get(leftmost) - 1);

                if (myMap.get(leftmost) == 0)
                    myMap.remove(leftmost);

                startIndex++;
            }


            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }

        return maxLength;

    }
}
