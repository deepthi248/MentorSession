package ProblemSolving;

public class MovingAverage_BruteForce {
    public static void main(String []args){
        int arr[] = {1,2,3,4,5};
        int k =2,index=0;
        // the resultant array should always be of length ---- " n-k+1 "
        double result [] = new double[arr.length-k+1];

        /*
        My approach -- using for and while by iterating over the given array
        for( int i =0;i<= arr.length-k ;i++){
            int temp = 0,count=i;
               double     average= 0;
            while(temp < k){
              //  System.out.println(  arr[count]);
                average += arr[count++];
                temp++;
            }
          //  System.out.println("average"+ average);
            result[index] = average/k;
            index++;

        }*/

        for ( int i =0; i< result.length;i++){
            double sum=0;

            for( int j=i; j < i+k;j++){
                sum+=arr[j];
            }

            result[i]=sum/k;
        }
        for( double value:result)
                System.out.print(value+"  ");
    }
}
