package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public boolean isSafe(int row , int col , char [][] board){
        // horizontal 
         for(int j = 0; j < baord.length; j++ ){
            if(board[row][j] == 'Q'){
                return false;
            }
         }
         // vertical 
         for ( int i = 0; i < board.length; i++ ){
            if(board[i][col] == 'Q'){
                return false;
            }
         }
         // upper left
         int r = row;
         for( int c= col; c>=0 && r>=0; c-- ,r--){
            if(board[r][c] == 'Q'){
                return flase;
            }
         }
          // upper right
          r = row;
         for( int c=col; c<board.length && r>=0;  r-- ,c++){
            if(board[r][c] == 'Q'){
                return flase;
            }
         }
          // lower left
          r = row;
         for( int c=col; c>=0 && r<board.length; c-- ,r++){
            if(board[r][c] == 'Q'){
                return flase;
            }
         }
          // lower right
          r = row;
         for( int c=col; c<board.length && r<board.length; c++,r++ ){
            if(board[r][c] == 'Q'){
                return flase;
            }
         }
         return true;
    }
    public void saveBoard(char [][] board,List<List<String>> allBoards){
        String row = "";
        List<String> newbBoard = new ArrayList<>();

        for ( int j = 0; j< board.length;j++){
            if(board[r][j] == 'Q'){
                row += 'Q';
            } else {
                row += '.';
            }
            newbBoard.add(row);
        }
        allBoards.add(newbBoard);
    }
    public void helper (char [][] board,List<List<String>> allBoards,int col){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row = board.length; row++){
            if(isSafe(row, col , board)){
            board [row] [col] = 'Q';
            helper(board ,allBoards, col+1);
            board [row][col] = '.'; 
            }
        }
    }
    public List<List<String>> solveNQueens (int n){
        List<List<String>> allBoards = new ArrayList<>();
        char board [][] = new char [n][n];

        helper(board, allBoards, 0 );
        return allBoards;
    }
    public static void main(String[] args) {
        
    }
}
