package MinimumSpanningTree;
import java.util.*;
public class primsAlgo {
    static class edge{
        int src;
        int dest;
        int wt;

        public edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    @SuppressWarnings("Convert2Diamond")
    static void createGraph(ArrayList<edge> graph[]){
        for(int i= 0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
        }

        graph[0].add(new edge(0,1,10));
        graph[0].add(new edge(0,2,15));
        graph[0].add(new edge(0,3,30));

        graph[0].add(new edge(1,0,10));
        graph[0].add(new edge(1,3,40));

        graph[0].add(new edge(2,0,15));
        graph[0].add(new edge(2,3,50));

        graph[0].add(new edge(3,1,40));
        graph[0].add(new edge(3,2,50));
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;

        public Pair(int n, int c){
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    static void primsAlgorithm(ArrayList<edge> graph[], int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean visit[] = new boolean[V];
        pq.add(new Pair(0,0));

        int mstCost = 0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visit[curr.node]){
                visit[curr.node] = true;
                mstCost += curr.cost;

                for(int i = 0;i<graph[curr.node].size();i++){
                    edge e = graph[curr.node].get(i);
                    if(!visit[e.dest]){
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }
        System.out.println("Minimum Cost for Spanning tree is : "+mstCost);
    }
    public static void main(String[] args) {
        int V = 4;

        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);
        primsAlgorithm(graph, V);
    }
}
