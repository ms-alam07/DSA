//You are given an NxM chessboard and the starting position (0, 0) of a knight. Your goal is to find a sequence of moves for the knight such that it visits every square on the chessboard exactly once, following the rules of knight movement.

import java.util.Arrays;

public class KnightsTour{
    public static void main(String[] args) {
       int n = 5;
       int m = 5;
       int a[][] = knightTour(n,m);
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
       } 
    }

public static int[][] knightTour(int n, int m) {

        int a[][]=new int[n][m];
       for(int row[]:a){
         Arrays.fill(row,-1);
       }
      a[0][0]=0;
      int[] movesx={2,1,-1,-2,-2,-1,1,2};
      int[] movesy={1,2,2,1,-1,-2,-2,-1};
      boolean ans = helper(n,m,a,movesx,movesy,0,0,1);
      if(ans == false) a[0][0] = -1;
      return a;
    }
  static boolean isValid(int[][]a,int n,int m,int x,int y){
    if(x>=0 && y>=0 && x<n && y<m && a[x][y]==-1){
      return true;
    }
    return false;
  }
  static boolean helper(int n,int m,int[][] a,int[] movesx,int[] movesy,int curX,int curY,int count){
    if(count==n*m){
      return true;
    }
    for(int i=0;i<8;i++){
      int nextX=curX+movesx[i];
      int nextY=curY+movesy[i];
      if(isValid(a,n,m,nextX,nextY)){
        a[nextX][nextY]=count;
        boolean isComp= helper(n,m,a,movesx,movesy,nextX,nextY,count+1);
        if(isComp){
          return true;
        }
        else{
          a[nextX][nextY]=-1;
        }
      }
    }
    return false;
  }
}