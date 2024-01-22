/*Write a program that fills in the empty cells in a given Sudoku puzzle.
The empty cells are indicated by the '.' character.
The following guidelines must all be followed:
- The numbers 1-9 must appear exactly once in each row.
- The numbers 1-9 must appear exactly once in each column.
- In each of the grid's nine 3x3 sub-boxes, the numbers 1-9 must appear exactly once.*/

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        if (sudoku(board)) {
            printSudoku(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static void printSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static boolean sudoku(char[][] board){
         return helper(board, 0, 0);
    }


    public static boolean isSafe(char[][] board,int row,int col,int n){
        
        // rows and cols(2 cases)
        for(int i=0;i<board.length;i++){
            if(board[i][col] == (char)(n+'0')){ // typecasting int to char type
                return false;
            }
            if(board[row][i] == (char)(n+'0')){
                return false;
            }
        }

        // grid(1 case)
        int startrow = (row/3)*3;
        int startcol = (col/3)*3;

        for(int i=startrow;i<startrow+3;i++){
            for(int j= startcol;j<startcol+3;j++){
                if(board[i][j]== (char)(n+'0')){
                    return false;
                }
            }
        }
        return true;
    }
    
    
    public static boolean helper(char[][] board,int row,int col){
        if(row == board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1){
            nrow = row;
            ncol = col+1;
        }else{
            nrow =row+1;
            ncol =0;
        }

        if(board[row][col] != '.'){
            if(helper(board, nrow, ncol)){
                return true;
            }
        }else{
            for(int i=1;i<=9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=(char)(i+'0');
                    if(helper(board, nrow, ncol)){
                        return true;
                    }else{
                        board[row][col]= '.';
                    }
                }
            }

        }
        return false;
    }
}
