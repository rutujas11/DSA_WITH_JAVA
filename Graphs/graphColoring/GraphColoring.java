package graphColoring;
import java.util.*;

public class GraphColoring {
    private static boolean isSafe(int node, List<List<Integer>> adj, int[] color, int col){
        for(int neigh : adj.get(node)){
            if(color[neigh] == col){
                return false;
            }
        }
        return true;
    }

    public static boolean solve(int node, List<List<Integer>> adj, int[] color, int V, int m){
        if (node == V) {
            return true;
        }
         
        for(int col = 1; col <= m;col++){
            if(isSafe(node, adj, color, col)){
                color[node] = col;

                if(solve(node+1, adj, color, V, m)){
                    return true;
                }

                color[node] = 0;
            }
        }
        return false;
    } 

    public static boolean mGraphColoring(List<List<Integer>> adj, int m, int V){
        int[] color = new int[V];
        Arrays.fill(color, 0);

        if(!solve(0, adj, color, V, m)){
            System.out.println("no solution exists with "+m+" colors");
            return false;
        }

        System.out.println("Solution Exists");
        for(int i = 0;i<V;i++){
            System.out.println("Node "+i+"-> color "+color[i]);
        }
        return true;
    }

    public static void main(String[] args){
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(3);

        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(1).add(3);


        adj.get(2).add(0);
        adj.get(2).add(1);
        adj.get(2).add(3);

        adj.get(3).add(0);
        adj.get(3).add(1);
        adj.get(3).add(2);
 
        int m = 4;
        mGraphColoring(adj, m, V);
    }
}
