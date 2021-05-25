package ProblemSolving;

public class MaximumSumSubArray_SlidingWindow {

    public static void main(String[] args){
        int arr [] ={1,4,2,10,23,3,1,0,20};
        int k =2;
        int sum=0, temp=0;
        int startIndex=0;
        for( int endIndex =0; endIndex<arr.length;endIndex++){
            sum+=arr[endIndex];
            if(endIndex>=k+1){
                if( sum>=temp)
                     temp=sum;
                sum-=arr[startIndex];
                startIndex++;
            }
        }
        System.out.print(temp);
    }
}
