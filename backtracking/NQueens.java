package backtracking;

public class NQueens {
    static int count =0;
    public static void nQueens(char[][]chess,int row){
        if(row==chess.length){
            // printChess(chess);
            count++;
            // return true;
        }
        for(int j=0;j<chess.length;j++){
            if(isSafe(chess, row, j)){
                chess[row][j]='Q';
                nQueens(chess, row+1);
                chess[row][j]='.';
            }
            // if(isSafe(chess,row,j)){
            //     chess[row][j]='Q';
            //     if(nQueens(chess, row+1)){
            //         return true;
            //     }
            //     chess[row][j]='X';
            // }
        }
        // return false;
    }
    public static boolean isSafe(char[][] chess, int row,int col){
        //vertical up
        for(int i=row;i>=0;i--){
            if(chess[i][col]=='Q'){
                return false;
            }
        }
        //diag left
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        //diag right
        for(int i=row,j=col;j<chess.length && i>=0;i--,j++){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printChess(char[][] chess){
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N=2;
        char [][]chess=new char[N][N];
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                chess[i][j]='X';
            }
        }
        nQueens(chess,0);
        System.out.println("total ways to solve "+N+" Queens is: "+ count);
        // if(nQueens(chess, 0)){
        //     System.out.println("solution is possible");
        //     printChess(chess);
        // }else{
        //     System.out.println("solution not possible");
        // }
    }
}
