package ProblemSolving;

public class MaximumSumSubArray_SlidingWindow {

    public static void main(String[] args){
        int arr [] ={2,3};
        int k =2;
       System.out.print( getMaxSum(arr,k) );

    }
    public static int getMaxSum(int arr[],int k ){
        int startIndex=0; int sum=0;int temp = 0;
        for( int endIndex=0;endIndex <arr.length;endIndex++){
            sum+=arr[endIndex];

            if(endIndex >= k-1){

                if(temp <= sum)
                        temp=sum;

                sum-=arr[startIndex];
                startIndex++;
            }

        }
        return temp;
    }
}
