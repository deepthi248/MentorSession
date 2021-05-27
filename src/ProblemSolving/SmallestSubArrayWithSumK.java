package ProblemSolving;

import java.awt.desktop.SystemEventListener;

public class SmallestSubArrayWithSumK {
    public static void main(String[] args){
        int arr [] ={3,1,5,2,3,3};

        System.out.print(smallestSum(arr,7));
    }
    public static int smallestSum(int [] arr, int small_sum){

        int startIndex = 0, result = 0,temp=0, sum = Integer.MIN_VALUE;

        for( int endIndex=0; endIndex < arr.length; endIndex++){
            sum+=arr[endIndex];

            while( sum > small_sum){
                result = endIndex-startIndex+1;

                if( temp > result)
                       temp = result;

                sum-=arr[startIndex];
                startIndex++;
            }


        }



        return temp;
    }
}
 /* int stratIndex=0; int sum=0;int endIndex=0;int result=0,temp=Integer.MAX_VALUE;
        for(  endIndex=0;endIndex<arr.length;endIndex++){
            sum+=arr[endIndex];
            //System.out.println(small_sum+" "+sum);
            while(sum >= small_sum){
               // System.out.println(small_sum+" "+sum);
                result = endIndex - stratIndex+1;
                System.out.println(endIndex+" "+stratIndex);
                if(temp > result )
                        temp = result;

                sum-=arr[stratIndex];
                stratIndex++;

            }*/
