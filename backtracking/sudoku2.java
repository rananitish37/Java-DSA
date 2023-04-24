package backtracking;

public class sudoku2 {
        public static void main(String args[]){ 
            char[][] board={{'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}};

            if(sudokuSolver(board,0,0)){
                for(int i=0;i<9;i++){
                    for(int j=0;j<9;j++){
                       System.out.print(board[i][j]+",");
                    }
                    System.out.println();
                }
            }
        }
        public static boolean sudokuSolver(char[][] board,int row,int col){
            char[] help={'1','2','3','4','5','6','7','8','9'};
            if(row==9){
                return true;
            }
            int nextRow=row,nextCol=col+1;
            if(col+1==9){
                nextRow=row+1;
                nextCol=0;
            }
            if(board[row][col]!='.'){
                return sudokuSolver(board,nextRow,nextCol);
            }
            for(int i=0;i<help.length;i++){
                if(isSafe(board,row,col,help[i])){
                    board[row][col]=help[i];
                    if(sudokuSolver(board,nextRow,nextCol)){
                        return true;
                    }
                    board[row][col]='.';
                }
            }
            return false;
        }
        public static boolean isSafe(char[][] board,int row,int col,char help){
            for(int i=0;i<=8;i++){
                if(board[i][col]==help){
                    return false;
                }
            }
            for(int j=0;j<=8;j++){
                if(board[row][j]==help){
                    return false;
                }
            }
            int sr=(row/3)*3;
            int sc=(col/3)*3;
            for(int i=sr;i<sr+3;i++){
                for(int j=sc;j<sc+3;j++){
                    if(board[i][j]==help){
                        return false;
                    }
                }
            }
            return true;
        }
}
