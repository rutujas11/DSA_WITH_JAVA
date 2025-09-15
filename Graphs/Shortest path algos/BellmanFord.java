import java.util.*;

public class BellmanFord {
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
    public static void createGraph(ArrayList<edge> graph[]){
        for(int i = 0; i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
        }

        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));

        graph[1].add(new edge(1, 2, -4));
        graph[2].add(new edge(2, 3, 2));
        graph[3].add(new edge(3, 4, 4));
        graph[3].add(new edge(4, 1, -1));
    }

    public static void bellManFord(ArrayList<edge> graph[], int src, int V){
        int dist[] = new int[V];
        for(int i = 0;i<V;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for(int k = 0;k<V-1;k++){
            for(int i = 0;i<V;i++){
                for(int j = 0;j<graph[i].size();j++){
                    edge e = graph[i].get(j);
                    int u = e.src;
                    int v= e.dest;
                    if((dist[u] != Integer.MAX_VALUE) && (dist[u] + e.wt) < dist[v]){
                        dist[v] = dist[u]+e.wt;
                    }
                }
            }
        }

        System.out.print("Shortest distances for each vertex : ");
        for(int i = 0;i<dist.length;i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] arg){
        int V = 5;

        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bellManFord(graph, 0, V);
    }
}
