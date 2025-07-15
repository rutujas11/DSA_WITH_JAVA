///Q. Count total paths to move from (0,0) to (n,m)
/// conditions :  you can only move to right and downword.
public class pathsInMaze {
    public static int countPaths(int i, int j, int m, int n){
        //if reached at boundary of rows or columns
        if(i == m || j == n){
            return 0;
        }
        // if reached at the adjacent cell of destination cell then it will be only one path to go to destination so return 1
        if(i == m-1 && j == n-1){
            return 1;
        }

        //counting paths for moving downwards
        int downpaths = countPaths(i+1, j, m, n);
        //counting paths for moving to right side
        int rightpaths = countPaths(i, j+1, m, n);

        return downpaths+rightpaths;
    }
    public static void main(String args[]){
        int m = 4,n = 4;
        int totalpaths = countPaths(0, 0, m, n);
        System.out.println(totalpaths);
    }
  

}
