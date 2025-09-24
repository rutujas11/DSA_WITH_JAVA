package FloodFilling;
import java.util.*;
public class floodFill {
    static void dfs(int[][] image, int sr, int sc, int newColor, int oldColor){
        int rows = image.length;
        int cols = image[0].length;

        if(sr<0 || sr >= rows || sc<0 || sc>=cols || image[sr][sc] != oldColor){
            return;
        }

        image[sr][sc] = newColor;

        dfs(image, sr-1, sc, newColor, oldColor);
        dfs(image, sr, sc+1, newColor, oldColor);
        dfs(image, sr+1, sc, newColor, oldColor);
        dfs(image, sr, sc-1, newColor, oldColor);
    }

    static int[][] floodFillAlgo(int[][] image, int sr, int sc, int newColor){
        int oldColor = image[sr][sc];

        if(oldColor != newColor){
            dfs(image, sr, sc, newColor, oldColor);
        }
        return image;
    }
    
    public static void main(String[] args){
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr = 1, sc = 1, newColor = 2;

        int[][] result = floodFillAlgo(image, sr, sc, newColor);

        for(int[] row : result){
            System.out.println(Arrays.toString(row));
        }
    }
}
