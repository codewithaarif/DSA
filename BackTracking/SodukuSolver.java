package BackTracking;

public class SodukuSolver {
    public boolean isSafe(char [][] board, int row , int col , int number){
        // row and column
        for ( int i = 0; i < board.length; i++){
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
            if(board[row][i] == (char)(number + '0')){
                return false; 
            }
        }
        // grid
        int sr = (r/3) * 3;
        int sc = (c/3) * 3;

        for ( int i = sr; i< sr+3; i++){
            for ( int j = sc; j < sc +3; j++){
                if( board [i][j] == (char)(number + '0')){
                    return false;
                }
            }
        }
        return true; 
    }
    public boolean helper(char [][] board, int row , int col){
        if(row == board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1){
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }
        if(board[row][col] != '.'){
            if(helper(board, nrow, ncol)){
                return true;
            }
        } else {
            for(int i =0; i <=9; i++){
                if(isSafe(board, row , col ,i)){
                    board[row][col] = (char)(i+ '0');
                    if(helper(board, nrow, ncol)){
                        return true;
                    } else {
                        board[row][col] = '.'; 
                    }
                }
            } 
        } return false;

    }
    public void solveSudoku(char [][] board){
        helper(board, 0, 0);
    }

}






public class PrintPermutation {
    public static void printPermutation(String str , String perm , int idx) {
    if(str.length() == 0){
        System.out.println(perm);
        return;
    }  
    for (int i = 0; i < str.length(); i++ ){
        char currChar = str.charAt(i);
        String newStr = str.substring(0, i) + str.substring(i+1);
        printPermutation(newStr, perm + currChar, idx+1);
    }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "",0);
    }
}
