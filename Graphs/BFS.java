import java.util.*;
public class BFS {
    static class Graph{
        int V;
        ArrayList<Integer>[] adjlist;

        public Graph(int vertices){
            this.V = vertices;
            adjlist = new ArrayList[vertices];
            for(int i = 0;i<V;i++){
                adjlist[i] = new ArrayList<>();
            }
        }

        void addEdge(int u, int v){
            adjlist[u].add(v);
            adjlist[v].add(u);
        }

        void dfsIterative(int start){
            boolean[] visited = new boolean[V];
            Queue<Integer> q = new LinkedList<>();

            visited[start] = true;
            q.add(start);

            while(!q.isEmpty()){
                int curr = q.poll();
                System.out.print(curr+" ");

                for(int neigh : adjlist[curr]){
                    if(!visited[neigh]){
                        visited[neigh] = true;
                        q.add(neigh);
                    }
                }
            }
        }


    }
    public static void main(String[] args){
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        g.dfsIterative(0);
    }
}
