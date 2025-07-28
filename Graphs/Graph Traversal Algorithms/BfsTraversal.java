import java.util.*;
public class BfsTraversal {
    static class graph{
        int V;
        LinkedList<Integer>[] adjList;

        graph(int vertices){
            this.V = vertices;
            adjList = new LinkedList[vertices];
            for(int i = 0;i<vertices;i++){
                adjList[i] = new LinkedList<>();
            }
        }

        void addEdge(int u, int v){
            adjList[u].add(v);
            adjList[v].add(u);
        }

//-----------------------------------------------------------------------
// Iterative
        void bfsIterative(int start){
            boolean[] visited = new boolean[V];
            Queue<Integer> q = new LinkedList<>();
            
            System.out.println("Iterative BFS");
            System.out.print("start of bfs is "+start+": ");
            visited[start] = true;
            q.add(start);

            while(!q.isEmpty()){
                int curr = q.poll();
                System.out.print(curr+" ");

                for(int neigh : adjList[curr]){
                    if(visited[neigh] != true){
                        visited[neigh] = true;
                        q.add(neigh);
                    }
                }
            }
            System.out.println();
        }

//------------------------------------------------------------------------------------
// Recursive
        void bfsutil(Queue<Integer> q, boolean[] visited){
            if(q.isEmpty()) return;

            int curr = q.poll();
            System.out.print(curr+" ");

            for(int neigh : adjList[curr]){
                if(visited[neigh] != true){
                    visited[neigh] = true;
                    q.add(neigh);
                }
            }

            bfsutil(q, visited);
        }

        void bfsRecursive(int start){
            boolean[] visited = new boolean[V];
            Queue<Integer> q = new LinkedList<>();

            System.out.println("Recursive BFS");
            System.out.print("Start of bfs is "+start+": ");
            visited[start] = true;
            q.add(start);

            bfsutil(q, visited);
        }
    }

    public static void main(String[] args){
        graph gobj = new graph(5);
        gobj.addEdge(0, 1);
        gobj.addEdge(0, 2);
        gobj.addEdge(1, 3);
        gobj.addEdge(1, 4);

        gobj.bfsIterative(0);  // here you can take any vertex as a start vertex
        gobj.bfsRecursive(0);

    }
}