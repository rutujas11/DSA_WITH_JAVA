import java.util.*;
public class Weighted_Dijkstra {
    @SuppressWarnings("FieldMayBeFinal")
    private int V;
    @SuppressWarnings("FieldMayBeFinal")
    private List<List<int[]>> adj;

    Weighted_Dijkstra(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for(int i = 0;i<V;i++){
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v, int w){
        adj.get(u).add(new int[]{v, w});
    }

    void dijkstra(int src){
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{src, 0});

        while(!pq.isEmpty()){
            int[] node = pq.poll();
            int u = node[0];
            int d = node[1];

            if(d > dist[u]) continue;

            for(int[] edge : adj.get(u)){
                int v = edge[0];
                int w = edge[1];

                if(dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                    pq.add(new int[]{v, dist[v]});
                }
            }
        }
        // System.out.println("shortest dist from src "+ src +": "+Arrays.toString(dist));
        for(int i = 0;i<dist.length;i++){
            System.out.println("Shortest dist to reach "+i+" from source is : "+dist[i]);
        }
    }

    
    public static void main(String[] args) {
        Weighted_Dijkstra g = new Weighted_Dijkstra(5);
        g.addEdge(0, 1, 4);
        g.addEdge(0, 2, 1);
        g.addEdge(2, 1, 2);
        g.addEdge(1, 3, 1);
        g.addEdge(2, 3, 5);
        g.addEdge(3, 4, 3);
        g.dijkstra(0);
    }
}
