package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

/*
//Given an array of characters where each character represents a fruit tree,
// you are given two baskets, and your goal is to put maximum number of fruits in each basket.
 // The only restriction is that each basket can have only one type of fruit. //
 //You can start with any tree, but you can’t skip a tree once you have started.
 // You will pick one fruit from each tree until you cannot,
 // i.e., you will stop when you have to pick from a third fruit type.
  // //Write a function to return the maximum number of fruits in both baskets.
  //Input: Fruit=['A', 'B', 'C', 'A', 'C'] //Output: 3

  //Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C', 'A', 'C']
  //Input: Fruit=['A', 'B', 'C', 'B', 'B', 'C']//Output: 5
  //Explanation: We can put 3 'B' in one basket and two 'C' in the other basket.
  //This can be done if we start with the second letter: ['B', 'C', 'B', 'B', 'C']



 */
public class basket_SlidingWindow {
    public static void main(String[] args) {
        Character [] fruits = {'A', 'B', 'C', 'B', 'B', 'C'};
        System.out.print(basketFunction(fruits,2));

    }
    public static int basketFunction(Character [] fruits, int baskets) {

        //corner cases
        if (baskets == 0 || fruits == null || fruits.length == 0)
            return -100;

        int startIndex = 0, total = Integer.MIN_VALUE;
        Map<Character, Integer> fruitsMap = new HashMap<>();

        for (int endIndex = 0; endIndex < fruits.length; endIndex++) {
            char leftChar = fruits[endIndex];


            fruitsMap.put(leftChar, fruitsMap.getOrDefault(leftChar, 0) + 1);

            while (fruitsMap.size() > baskets) {
                Character left_most = fruits[startIndex];
                fruitsMap.put(left_most, fruitsMap.get(left_most) - 1);

                if (fruitsMap.get(left_most) == 0)
                    fruitsMap.remove(left_most);

                startIndex++;
            }
            total = Math.max(total, endIndex - startIndex + 1);
        }
        return total;
    }
}
