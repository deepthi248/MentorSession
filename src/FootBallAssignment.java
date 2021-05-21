import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class FootBallAssignment {
    public static void main(String[] args){
        //Input reading
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of countries competing ");
        int countries = scan.nextInt();

        //creating a map to store

        Map<String, ArrayList<Integer>> pointsTable = new HashMap<>();

        // adding the countries
        System.out.print("Please enter all coutnry names");
        int t = 0;
        ArrayList<Integer> points = new ArrayList<>();
        while(t<countries){
            points.add(t,0);
            points.add(t,0); //before any match
            String country =scan.next();
            pointsTable.put(country,points);
            t++;
        }
        String [] [] onLine = new String[countries+1][4];
        int counter=0, o=0;
        while( scan.hasNext() && counter <=  countries){
               counter++;
               onLine[o][0] = scan.next();
               onLine[o][1] =scan.next();
               onLine[o][2] = scan.next();
               onLine[o][3] =scan.next();
               int max= (int) Math.max( Integer.parseInt(onLine[o][2] ),Integer.parseInt(onLine[o][3]));
               counter+=max;
               o++;
           }

        System.out.print("done");
        for( String [] str: onLine){
            for(String s: str){
                System.out.print(s);
            }
            System.out.println();
        }
        for( int i =0;i< counter;i++){
            if(onLine[i][0].equals(onLine[i][1]))
                System.out.print("Invalid Input");
            else {
                if (pointsTable.containsKey(onLine[0])) {
                    ArrayList<Integer> points_temp = pointsTable.get(onLine[0]);
                        int temp=0 ; temp+= Integer.parseInt(onLine[i][2]);
                        points.set(0,temp);
                }
            }
        }
        for( Map.Entry<String, ArrayList<Integer>> entrySet: pointsTable.entrySet()){
            System.out.print(entrySet.getKey()+" "+ entrySet.getValue());
        }








        }


}
