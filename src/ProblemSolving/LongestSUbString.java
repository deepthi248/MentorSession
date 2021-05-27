package ProblemSolving;
import java.util.*;
/*
//Given a string you need to print longest possible substring that has

exactly M unique characters. //If there are more than one substring of longest
possible length, then print any one of them. //"aabbcc", k = 1
//Max substring can be any one from {"aa" , "bb" , "cc"}. //

 //"aabbcc", k = 2 //Max substring can be any one from {"aabb" , "bbcc"}. //
  //"aabbcc", k = 3 //There are substrings with exactly 3 unique characters
  //{"aabbcc" , "abbcc" , "aabbc" , "abbc" } //Max is "aabbcc" with length
  6. // //"aaabbb", k = 3 //There are only two unique characters, thus show error message.
 */

public class LongestSUbString {
    public static void main(String[] args) {
        String str = "araacci";
        System.out.print(getlongestSubString(str, 2));

    }

    public static int getlongestSubString(String str, int k) {
        if (str == null || str.length() < k || str.length() == 0)
            return -100; // to get certain corner cases

        //for loop to slide
        int startIndex = 0, result = 0, temp = 0, maxLength = Integer.MIN_VALUE;
        Map<Character, Integer> charCounter = new HashMap<Character, Integer>();

        for (int endIndex = 0; endIndex < str.length(); endIndex++) {


            //get me if there is key already present or get the default
            Character rightHand = str.charAt(endIndex); //a, r

            charCounter.put(rightHand, charCounter.getOrDefault(rightHand, 0) + 1); // a-1 , r-1, a - 2

            while (charCounter.size() > k) { // size = 3
                //character to be decremented from the window
                Character leftChar = str.charAt(startIndex); // leftchar = a

                //charCounter.put(leftChar, charCounter.get(leftChar)-1); -- this solely cant work because if the array is
                // braaci -- i cant decrement the count but I need to remove the element from map

                charCounter.put(leftChar, charCounter.get(leftChar) - 1); // a-1
                if (charCounter.get(leftChar) == 0) {
                    charCounter.remove(leftChar);
                }
                startIndex++; // a = 2
            }

            maxLength = Math.max(maxLength, endIndex - startIndex + 1); // 0, 1 // 2-1 +1 == 2
            System.out.println(maxLength);
        }
        return maxLength;
    }
}



       /* Map<Character,Integer> characterCountMap= new HashMap<>();
        int startIndex=0; int maxLength=Integer.MIN_VALUE;

        if (str == null || str.length() == 0 || str.length() < k){
            return -100;
        }
        for(int endIndex=0; endIndex<str.length(); endIndex++)
        {
            Character rightChar = str.charAt(endIndex);

            characterCountMap.put(rightChar, characterCountMap.getOrDefault(rightChar,0)+1);

            while(characterCountMap.size()>k){
                Character leftChar = str.charAt(startIndex);
                characterCountMap.put(leftChar,characterCountMap.get(leftChar)-1);
                if(characterCountMap.get(leftChar)==0){
                    characterCountMap.remove(leftChar);
                }
                startIndex++;
            }
            maxLength= Math.max(maxLength, endIndex-startIndex+1);
        }
        return maxLength;
    }

}

/*
            Traditional way of checking and inserting
            if(charCounter.containsKey(str.charAt(endIndex))){
                int freq =  charCounter.get(str.charAt(endIndex));
                freq++;
                charCounter.put(str.charAt(endIndex), freq);
            }
            else{
                charCounter.put(str.charAt(endIndex),1);

            }*/

/*//Given a string you need to print longest possible substring that has exactly M unique characters. //If there are more than one substring of longest possible length, then print any one of them. import java.util.HashMap; import java.util.Map; //"aabbcc", k = 1 //Max substring can be any one from {"aa" , "bb" , "cc"}. // //"aabbcc", k = 2 //Max substring can be any one from {"aabb" , "bbcc"}. // //"aabbcc", k = 3 //There are substrings with exactly 3 unique characters //{"aabbcc" , "abbcc" , "aabbc" , "abbc" } //Max is "aabbcc" with length 6. // //"aaabbb", k = 3 //There are only two unique characters, thus show error message. //k=1 //bucket araa //4 //Input: String="araaci", K=2 public
 class LongestSubstring {
  public static void main(String[] args) {
  findLength("arbbci",2);
  }
  public static int findLength(String str, int k) {
   Map<Character,Integer> characterCountMap= new HashMap<>();
   int startIndex=0; int maxLength=Integer.MIN_VALUE;
   if (str == null || str.length() == 0 || str.length() < k){
   return -100;
   }
   for(int endIndex=0; endIndex<str.length(); endIndex++)
   {
   Character rightChar = str.charAt(endIndex);
   characterCountMap.put(rightChar, characterCountMap.getOrDefault(rightChar,0)+1);
    while(characterCountMap.size()>k){
     Character leftChar = str.charAt(startIndex);
     characterCountMap.put(leftChar,characterCountMap.get(leftChar)-1);
     if(characterCountMap.get(leftChar)==0){
      characterCountMap.remove(leftChar);
       }
       startIndex++;
       }
       maxLength= Math.max(maxLength, endIndex-startIndex+1);
       }
        return maxLength;
         }

          }
 */












