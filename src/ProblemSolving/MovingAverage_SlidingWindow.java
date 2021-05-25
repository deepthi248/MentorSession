package ProblemSolving;

public class MovingAverage_SlidingWindow {
    public static void main(String[] args){
        int arr[] = {1,2,3,4};
        int k =3;
        int startIndex=0; double sum=0; double result[] = new double[arr.length- k+1];
        for( int endIndex =0; endIndex < arr.length; endIndex++){
                sum+=arr[endIndex];

                if( endIndex >= k-1 ) {
                    result[startIndex] = sum / k;
                    sum = sum - arr[startIndex];
                    startIndex++;
                }
        }
        for(double d : result)
                System.out.print(d+" ");
    }
}
