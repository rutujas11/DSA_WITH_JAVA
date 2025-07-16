import java.util.*;

public class BFS_traversal {
    static class Graph{
        int V;
        LinkedList<Integer>[] adjList;

        @SuppressWarnings("unchecked")
        Graph(int v){
            V = v;
            adjList = new LinkedList[v];
            for(int i = 0;i<v;i++){
                adjList[i] = new LinkedList<>();
            }
        }

        void addedge(int src, int dest){
            adjList[src].add(dest);
            adjList[dest].add(src);
        }

//--------------------------------------------------------------
//-----> 1)Iterative BFS
        void bfsiterative(int start){
            boolean[] visited = new boolean[V];
            Queue<Integer> q = new LinkedList<>();

            visited[start] = true;
            q.add(start);

            System.out.print("Iterative Bfs starting from node "+start+" : ");

            while(!q.isEmpty()){
                int curr = q.poll();
                System.out.print(curr+"   ");

                for(int neigh : adjList[curr]){
                    if(!visited[neigh]){
                        visited[neigh] = true;
                        q.add(neigh);
                    }
                }
            }
        }

//--------------------------------------------------------------
//-----> 2)Recursive BFS
        void bfsrecursive(int start){
            boolean[] visited  = new boolean[V];
            Queue<Integer> q = new LinkedList<>();

            visited[start] = true;
            q.add(start);
            
            System.out.println();
            System.out.print("Recursive Bfs starting from node "+start+" : ");
            bfsutil(q, visited);
        }

        void bfsutil(Queue<Integer> q, boolean[] visited){
            if(q.isEmpty()) return;

            int curr = q.poll();
            System.out.print(curr+"   ");

            for(int neigh : adjList[curr]){
                if(!visited[neigh]){
                    visited[neigh] = true;
                    q.add(neigh);
                }
            }
            bfsutil(q, visited);
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(7);

        g.addedge(0, 1);
        g.addedge(0, 2);
        g.addedge(1, 3);
        g.addedge(1, 4);
        g.addedge(2, 5);
        g.addedge(2, 6);

        g.bfsiterative(0);
        g.bfsrecursive(0);
    }
}
