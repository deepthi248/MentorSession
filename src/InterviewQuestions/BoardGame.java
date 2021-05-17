package InterviewQuestions;

public class BoardGame {
    public static void main(String [] args){
        int[][] board = { {0,0,0,-1,-1},
                 {0,0,-1,0,0},
                {0,-1,0-1,0},
                {0,0-1,0,-1},
                {0,0,0,0,0} };
        System.out.println((board[0][3] ) );
        System.out.print("answer"+boardGame(board,4,4));
        }
        public static int boardGame(int[][] board, int i, int j){
            int count=0;

            if (board[i][j] == 0 ) {

                if(i < board.length-1 ){
                    if (board[i + 1][j] == 0)
                        count++;
                }
                if(j >= 1){
                    if (board[i][j - 1] == 0 )
                        count++;
                }

                 if(j < board.length-1)  {
                     if ( board[i][j + 1] == 0 )
                         count++;
                 }
                if( i >= 1  ) {
                    int number =i-1;
                    if (board[i-1][j] == 0)
                        count++;

                }

            }
            return count;
    }

}
