import java.util.*;
public class DfsTraversal {
    static class Graph{
        int V;
        List<Integer>[] adj;

        Graph(int vertices){
            this.V = vertices;
            adj = new ArrayList[vertices];

            for(int i = 0;i<vertices;i++){
                adj[i] = new ArrayList<>();
            }
        }

        void addEdge(int u, int v){
            adj[u].add(v);
            adj[v].add(u);
        }

        void sortadj(){
            for(List<Integer> neighbors : adj){
                Collections.sort(neighbors);
            }
        }

// ----> Iterative
        void dfsIterative(int start){
            boolean[] visited = new boolean[V];
            Stack<Integer> st = new Stack<>();
            st.push(start);
            
            System.out.print("Iterative DFS Traversal : ");

            while(!st.isEmpty()){
                int node = st.pop();

                if(!visited[node]){
                    visited[node] = true;
                    System.out.print(node+" ");
 
                    List<Integer> neighbors = new ArrayList<>(adj[node]);
                    Collections.reverse(neighbors);
                    for(int neigh : neighbors){
                        if(!visited[neigh]){
                            st.push(neigh);
                        }
                    }
                }
            }
            System.out.println();
        }

// ---> Recursive
        void dfsRecursive(int start){
            boolean[] visited = new boolean[V];
            System.out.print("Recursive DFS Traversal : ");
            dfsutil(start, visited);
            System.out.println();
        }
        void dfsutil(int node, boolean[] visited){
            visited[node] = true;
            System.out.print(node+" ");

            for(int neigh : adj[node]){
                if(!visited[neigh]){
                    dfsutil(neigh, visited);
                }
            }
        }
    }
    public static void main(String[] args){
        Graph dfsobj = new Graph(5);
        dfsobj.addEdge(0, 1);
        dfsobj.addEdge(0, 2);
        dfsobj.addEdge(0, 3);
        dfsobj.addEdge(2, 4);


        dfsobj.sortadj();

        dfsobj.dfsIterative(0);
        dfsobj.dfsRecursive(0);
    }
}
