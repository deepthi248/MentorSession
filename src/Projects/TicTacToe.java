package Projects;

import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        int [] [] tic_tac = {{-1,-1,-1},
                            {-1,-1,-1},
                             {-1,-1,-1}};

        Map<Integer,String> choosing_names = new LinkedHashMap<>();
        Scanner scan = new Scanner(System.in);


        //Player 1
        System.out.println("choose your Name and Number");
        String player_1 = scan.next();
        Integer number_player1 = scan.nextInt();
        choosing_names.put( number_player1,player_1);

        //player 2
        System.out.println("choose your Name and Number other than " + number_player1);
        String player_2 = scan.next();
        Integer number_player2 = scan.nextInt();
        choosing_names.put( number_player2,player_2);

        if( number_player1!=number_player2)
         tic_tac = fillValue(tic_tac,number_player1,number_player2);
        else{
            System.out.println("Please choose different number & start again");
        }
//
//
    }

    public static int[][] fillValue(int [][] tic_tac,int playerNumber1,int playerNumber2){
        Scanner scan = new Scanner(System.in);
        int row_number=-9, column_number=-9;
        int first_player = 0; int second_player=0;
        int entered=0;
        while( first_player <=2 && second_player<=2){

            System.out.println("Player 1 turn");
            tic_tac = assignValue(tic_tac,playerNumber1);
            entered++;

            System.out.println("Player 2 turn");
            tic_tac = assignValue(tic_tac,playerNumber2);
            entered++;

            if(entered >3) {
                if(check(playerNumber1,tic_tac)  ) {
                    System.out.println("Player 1 won");
                    break;
                }
                else if (check(playerNumber2,tic_tac)) {
                    System.out.println("player 2 won");
                    break;
                }

            }


        }

        return tic_tac;
    }
    public static int[][] assignValue(int[][] tic_tac,int playerNumber){
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter your desired position to fill");
        System.out.println ("Row Number"+ "Column Number");
        int row_number = scan.nextInt();

       int column_number =scan.nextInt();

        if( tic_tac[row_number][column_number] == -1){
            tic_tac[row_number][column_number] = playerNumber;
            return tic_tac;
        }
        else {
            while (tic_tac[row_number][column_number] != -1) {
                System.out.println("Position entered is already filled");
                System.out.println("Enter Again");
                System.out.println("Row Number");
                row_number = scan.nextInt();
                System.out.println("Column Number");
                column_number = scan.nextInt();
            }
        }

        return  tic_tac;
    }

    public  static boolean check(int number, int[][] tic_tac){
        int counter = 0;
      if( tic_tac[0][0]==number && tic_tac[0][1]==number&& tic_tac[0][2]==number) //first row
          counter=3;
      else if(tic_tac[1][0]==number && tic_tac[1][1]==number&& tic_tac[1][2]==number)//2nd roe
          counter=3;
      else if(tic_tac[2][0]==number && tic_tac[2][1]==number&& tic_tac[2][2]==number) //3rd row
          counter=3;
      else if(tic_tac[0][0]==number && tic_tac[1][1]==number&& tic_tac[2][2]==number)//diag -1
          counter=3;
      else if(tic_tac[0][2]==number && tic_tac[1][1]==number&& tic_tac[2][0]==number)//diag -2
          counter=3;

      else if(tic_tac[0][0]==number && tic_tac[1][0]==number&& tic_tac[2][0]==number)//first column
          counter=3;
      else if(tic_tac[0][1]==number && tic_tac[1][1]==number&& tic_tac[2][1]==number)//2nd column
          counter=3;
      else if(tic_tac[0][2]==number && tic_tac[1][2]==number&& tic_tac[2][2]==number)//3rd column
            counter=3;
      else
          counter=0;
      return counter==3 ? true: false;
    }
}
/*
System.out.println("please enter assigned Number");
        int number = scan.nextInt();
        if(! choosing_names.containsKey(number) ) {
            System.out.println("you didn't chose your assigned number");
        }

        else{



            else if(row_number <=2 && column_number<=2){

            }

        }
 */

