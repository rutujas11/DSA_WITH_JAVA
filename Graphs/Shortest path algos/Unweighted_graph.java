//using BFS 
import java.util.*;
public class Unweighted_graph {
    @SuppressWarnings("FieldMayBeFinal")
    private int V;
    @SuppressWarnings("FieldMayBeFinal")
    private List<List<Integer>> adj;

    public Unweighted_graph(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for(int i = 0;i<V;i++){
            adj.add(new ArrayList<>());
        }
    }

    void addedge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void shortestPath(int src){
        int[] dist = new int[V];
        Arrays.fill(dist, -1);
        dist[src] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while(!q.isEmpty()){
            int u = q.poll();
            for(int v : adj.get(u)){
                if(dist[v] == -1){
                    dist[v] = dist[u] + 1;
                    q.add(v);
                }
                
            }
        }
        System.out.println("Shortest distance from source "+ src +": "+Arrays.toString(dist));
    }

    
    public static void main(String[] args){
        Unweighted_graph g = new Unweighted_graph(6);
        g.addedge(0, 1);
        g.addedge(0, 2);
        g.addedge(1, 3);
        g.addedge(2, 4);
        g.addedge(3, 5);
        g.addedge(4, 5);

        g.shortestPath(0);
    }
}
