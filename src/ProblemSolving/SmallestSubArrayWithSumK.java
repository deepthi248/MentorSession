package ProblemSolving;

import java.awt.desktop.SystemEventListener;

public class SmallestSubArrayWithSumK {
    public static void main(String[] args){
        int arr [] ={2,4,6,10,2,1,12};

        System.out.print(smallestSum(arr,12));
    }
    public static int smallestSum(int [] arr, int small_sum){
        int stratIndex=0; int sum=0;int endIndex=0;int result=0,temp=arr.length;
        for(  endIndex=0;endIndex<arr.length;endIndex++){
            sum+=arr[endIndex];
            //System.out.println(small_sum+" "+sum);
            while(sum >= small_sum){
               // System.out.println(small_sum+" "+sum);
                result = endIndex - stratIndex+1;
                if(temp > result )
                        temp = result;
                //System.out.print(temp);
                sum-=arr[stratIndex];
                stratIndex++;

            }

        }
        return temp;
    }
}
