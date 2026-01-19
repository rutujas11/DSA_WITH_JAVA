import java.util.*;
public class DFS {
    static class Graph{
        @SuppressWarnings("unused")
        int V;
        ArrayList<Integer>[] adjlist;

        public Graph(int vertices){
            this.V = vertices;
            adjlist = new ArrayList[vertices];
            for(int i = 0;i<vertices;i++){
                adjlist[i] = new ArrayList<>();
            }
        }

        void addEdge(int u, int v){
            adjlist[u].add(v);
            adjlist[v].add(u);
        }

        void dfsRec(int curr, boolean[] vis){
            System.out.print(curr+" ");
            vis[curr] = true;

            for(int neigh : adjlist[curr]){
                if(vis[neigh] != true){
                    dfsRec(neigh, vis);
                }
            }
        }
    }

    
    // static class Edge{
    //     int src;
    //     int des;

    //     public Edge(int s, int d){
    //         this.src = s;
    //         this.des = d;
    //     }
    // }

    // static void createGraph(ArrayList<Edge> graph[]){
    //     for(int i = 0;i<graph.length;i++){
    //         graph[i] = new ArrayList<>();
    //     }

    //     graph[0].add(new Edge(0,1));
    //     graph[0].add(new Edge(0,2));
    //     graph[0].add(new Edge(1,2));
    //     graph[0].add(new Edge(2,3));
    // }

    // static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis){
    //     System.out.print(curr+" ");
    //     vis[curr] = true;
        
    //     for(int i = 0;i<graph[curr].size();i++){
    //         Edge e = graph[curr].get(i);
    //         if(vis[e.des] != true){
    //             dfs(graph, e.des,vis);
    //         }
    //     }
    // }
    public static void main(String args[]){
        int vertices = 6;
        Graph g = new Graph(vertices);
        boolean[] vis = new boolean[vertices];

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        
        g.dfsRec(0,vis);
    }
}
