import java.util.*;
//Bob: {{"bob', 87} {'mike,'90'}{'bob', 100}}
//"Bob" : [87,100]



public class AssignmentString {
    public static void main(String []args){
        String [][] students = {{"Bob","100"},
                                {"Mike", "35"},
                                {"Bob", "100"},
                                {"Jason","35"},
                                {"Mike", "55"},
                                {"Jessica", "99"} };
       HashMap<String,String> hashmap = new HashMap<String,String>();
        Map.Entry<String,Integer> maxPrice = null;

        for( int i =0; i< students.length;i++) {
           String key = students[i][0];
           int total =0, count=0;
            if(hashmap.containsKey(key)){
                count++;
                total = ( Integer.parseInt(students[i][1]) + Integer.parseInt(hashmap.get(key)) ) /2;
                hashmap.put(students[i][0], String.valueOf( total ));
            }
            else{
                hashmap.put(students[i][0], students[i][1]);
            }
       }
        int temp=0; String result="";
        for (Map.Entry<String, String> entry : hashmap.entrySet()) {  // Itrate through hashmap
            int value = Integer.parseInt( entry.getValue() );

            if( temp < value){
                result = entry.getKey();
                temp = value;
            }
        }
        System.out.print(result);
    }
}
