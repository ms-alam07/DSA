// In a square matrix of order N * N, imagine a rat placed at position (0, 0). The final location must be reached at (N - 1, N - 1). Find every route the rat might possibly take to go from point A to point B. The rat can move in the following directions: "U" (up), "D" (down), "L" (left), and "R" (right). Rats cannot move to a cell with a value of 0 in the matrix because it is blocked, while rats can pass through cells with a value of 1 in the matrix.No cell can be visited more than once in a journey. The rat cannot go to any other cell if the originating cell is 0.Complete the function findPath() which takes N and 2D array m[ ][ ] as input parameters and returns the list of paths in lexicographically increasing order. 

import java.util.*;
public class RatInMaze {
    public static void main(String[] args) {
        int arr[][]= {
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1}
        };
    ArrayList <String> ans =new ArrayList <String>();
    int n=arr.length;
    int m=arr[0].length;
    if(arr[0][0]==0){
    System.out.println(ans);
    }
      boolean vis[][]=new boolean[n][m];
      vis[0][0]=true;
      
      ratInMaze(arr,vis,0,0,n,"",ans);
      System.out.println(ans);
    }
  
  public static boolean isValid(int arr[][], int i, int j, boolean vis[][], int n){
      if(i < n && i>=0 && j < n && j>=0 && arr[i][j]==1 && !vis[i][j]){
          return true;
          }
          return false;    
}  
 
  public static void ratInMaze(int arr[][], boolean vis[][], int i, int j, int n, String path, ArrayList <String> ans){
    if(i==n-1 && j==n-1){
    ans.add(path);
      return;
    }

    //down
    if(isValid(arr,i+1,j,vis,n)){
      vis[i+1][j]=true;
      ratInMaze(arr,vis,i+1,j,n,path+'D',ans);
      vis[i+1][j]=false;      
    }  

    //left
    if(isValid(arr,i,j-1,vis,n)){
      vis[i][j-1]=true;
      ratInMaze(arr,vis,i,j-1,n,path+'L',ans);
      vis[i][j-1]=false;      
    } 

    //right
     if(isValid(arr,i,j+1,vis,n)){
      vis[i][j+1]=true;
      ratInMaze(arr,vis,i,j+1,n,path+'R',ans);
      vis[i][j+1]=false;      
    } 

    //up
     if(isValid(arr,i-1,j,vis,n)){
      vis[i-1][j]=true;
      ratInMaze(arr,vis,i-1,j,n,path+'U',ans);
      vis[i-1][j]=false;      
    }      
}
}
