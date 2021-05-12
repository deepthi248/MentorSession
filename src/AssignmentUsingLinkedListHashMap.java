import java.util.*;

public class AssignmentUsingLinkedListHashMap {
    public static void main(String[] args){
        List<Integer> marks = new ArrayList<>();
        String [][] students = {//{"Bob","100"},
                {"Mike", "35"},
                {"Bob", "100"},
                {"Jason","35"},
                {"Mike", "55"},
                {"Jessica", "99"} };
        Map<String, List<Integer>> hashmap = insertIntoMap(students);
        System.out.print(getMaxMarks(hashmap)); //getting max marks

        }


    public static Map<String, List<Integer>> insertIntoMap(String[] [] students){
        Map<String, List<Integer>> hashmap = new HashMap<>();
        for( int i =0;i< students.length;i++) {
            String key = students[i][0];
            if (hashmap.containsKey(key)) {
                List<Integer> temp = hashmap.get(key);
                temp.add(Integer.parseInt(students[i][1]));
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(Integer.parseInt(students[i][1]));
                hashmap.put(students[i][0], temp);
            }
        }
        return hashmap;
    }
    public static String getMaxMarks(Map<String, List<Integer>> hashmap){
        //iterate over the map
        int curr_average=0; String student ="";
        for(Map.Entry<String, List<Integer>> entrySet: hashmap.entrySet()){ //iterates over the array
            //getting the value in the list - if size more than 1 avergae
            List<Integer> temp = entrySet.getValue();
            if(temp.size()>=1){
                int sum=0;
                for(int i=0;i< temp.size();i++){
                    sum+=temp.get(i);//adding all
                }
                int temp_average = sum/temp.size();
                if(curr_average< temp_average){
                    curr_average=temp_average;
                    student = entrySet.getKey();

                }



            }
            else{
                int temp_average = temp.get(0);
                if( curr_average  < temp_average){
                    curr_average = temp_average;
                    student= entrySet.getKey();
                }

            }

        }
        return student;
    }
}
