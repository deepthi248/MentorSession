package InterviewQuestions;
import com.sun.jdi.IntegerType;

import java.lang.reflect.Array;
import java.util.*;
public class BoardGame {
        public static void main(String [] args){
            int [] [] board = {{0,  0,  0, -1, -1},
                                {0,  0, -1,  0,  0},
                                {0, -1,  0, -1,  0},
                                {0,  0, -1,  0,  0},
                                {0,  0,  0,  0,  0},
                                {0,  0,  0,  0,  0},
                                {0,  0,  0,  0,  0}};
            ArrayList<Integer [] > myList=   boardGame(board,5,3);
            for(Integer [] value: myList){
                for( Integer values : value){
                    System.out.print(values+" ");

                }
                System.out.println();
            }

        }
        public static ArrayList<Integer [] >  boardGame(int board [][], int i , int j ){
            ArrayList<Integer [] > myList = new ArrayList<>();
            // up , left, down, right
            if( board[i][j]==0){
                if( i+1 <= board.length) {
                    if (board[i + 1][j] == 0) {
                        Integer arr [] = {i+1, j};
                        myList.add(arr);

                    }
                }
                if(i-1>=0) {
                    if (board[i - 1][j] == 0) {
                        //   System.out.println((i-1) +" "+ j);
                        Integer arr [] = {i-1, j};
                        myList.add(arr);
                    }
                }
                if( j+1<board[i].length) {
                    if (board[i][j + 1] == 0) {
                        // System.out.println(i +" "+ (j+1));
                        Integer arr [] = {i, j+1};
                        myList.add(arr);
                    }
                }
                if(j-1>=0){
                    if(board[i][j-1]==0){
                        //  System.out.println(i +" "+ (j-1));
                        Integer arr [] = {i, j-1};
                        myList.add(arr);
                    }


                }
            }

            return myList;




        }
    }
