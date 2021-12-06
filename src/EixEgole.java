import java.util.*;



public class EixEgole {
  public static int row, colom;
  public static Scanner scan = new Scanner(System.in);
  public static char[][] board = new char[3][3];
  public static char turn = 'X';

    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                board[i][j] = '_';
            }
        }
        play();

    }

    public static void play(){

        boolean playing = true;
        while(playing){
            System.out.println("Pls eneter a row and colom:");
            row = scan.nextInt() - 1;
            colom  = scan.nextInt() - 1;
            board[row][colom] = turn;
            printBoard();
            if (endGame(row,colom)){
                playing = false;
                System.out.println("player "+ turn + " wins!");
            }
            else
            {
                System.out.println("Ther is no winner...");
            }

            if (turn == 'X'){
                turn = 'O';
            }else{
                turn = 'X';
            }

        }
    }



    public static void printBoard() {
        for (int i=0;i<3;i++){
            System.out.println("");
            for (int j=0;j<3;j++){
                if (j==0)
                    System.out.print("| ");
                System.out.print(board[i][j]+" | ");
            }
            System.out.println("");
        }
    }

    public static boolean endGame(int rMove,int cMove){
        if (board[0][cMove]==board[1][cMove] && board[0][cMove]==board[2][cMove]){
            return true;
        }
        if (board[rMove][0]==board[rMove][1] && board[rMove][0]==board[rMove][2]){
            return true;
        }
        if (board[0][0]==board[1][1] && board[0][0]==board[2][2] && board[1][1]!='_'){
            return true;
        }
        if (board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[1][1]!='_'){
            return true;
        }
            return false;
    }
}
