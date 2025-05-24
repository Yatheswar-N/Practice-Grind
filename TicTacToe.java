package Others;

import java.util.Scanner;

public class TicTacToe {
//    private static final char[][] ref={{"00","01","02"},{"10","11",'12'},{'20','21','22'}};
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char[][] board={{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        boolean gameOver=false;
        char player='X';
        int counter=0;
//        for(int row=0;row< board.length;row++){
//            for(int col=0;col<board[0].length;col++){
//                System.out.print(board[row][col]+" ");;
//            }
//            System.out.println();
//        }
        displayBoard(board);
        while(!gameOver && counter<9){
            counter++;
//            displayBoard(board);
            System.out.println("Player "+player+ " enter row and col");
            int row=s.nextInt();
            int col=s.nextInt();
            while(row>2 || col>2 || board[row][col]!='-'){
                System.out.println("Player "+player+" Enter valid rows and col");
                displayBoard(board);
                row=s.nextInt();
                col=s.nextInt();
            }
            board[row][col]=player;
            gameOver=anyOneWon(board,player);

            if(gameOver){
                System.out.println("Player "+player+" WON");
            }
            else if(counter==9){
                System.out.println("Match Draw ... ");
            }
            displayBoard(board);
            player=(player=='X')?'O':'X';
        }
    }

    private static void displayBoard(char[][] board) {
        for(int row=0;row< board.length;row++){
            for(int col=0;col<board[0].length;col++){
                System.out.print(board[row][col]+" ");;
            }
            System.out.println();
        }
//        for(int row=0;row< ref.length;row++){
//            for(int col=0;col<ref[0].length;col++){
//                System.out.print(ref[row][col]+" ");;
//            }
//            System.out.println();
//        }
    }

    private static boolean anyOneWon(char[][] board, char player) {
        for(int row=0;row<board.length;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }
        for(int col = 0; col<board[0].length; col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        if((board[0][0]==player && board[1][1]==player && board[2][2]==player) || (board[0][2]==player && board[1][1]==player && board[2][0]==player) ){
            return true;
        }
        return false;
    }
}
