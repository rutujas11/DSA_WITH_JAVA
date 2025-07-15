public class NQueen {
    public static void printBoard(char[][] board){
        for(char[] row : board){
            for(char c : row){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        
        //check vertical upward
        for(int i = 0;i<row;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //check upper left diagonal
        for (int i = row, j = col; i>=0 && j>= 0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        

        //check upper right
        for(int i = row, j = col; i>=0 && j<n; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;

    }
    public static void solveNQueen(char[][] board, int row){
        int n = board.length;
        if(row == n){
            printBoard(board);
            return;
        }

        for(int col = 0; col<n;col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';  //place queen
                solveNQueen(board, row+1);  //recurse for next row
                board[row][col] = '.'; // if we stuck anywhere in between i.e we get wrong answer then backtrack and make it (Q) again '.'
            }
        }
    }
    public static void main(String args[]){
        int n = 4;
        char[][] board = new char[n][n];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.'; //
                // Initialize the board with '.'
            }
        }
        solveNQueen(board, 0);
    }
}

