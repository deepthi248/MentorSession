package ProblemSolving;

public class MovingAverage_BruteForce {
    public static void main(String []args){
        int arr[] = {1,2,3,4,5};
        int k =2,index=0;
        double result [] = new double[arr.length-1];

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
        }
        for( double value:result)
                System.out.print(value+"  ");
    }
}
