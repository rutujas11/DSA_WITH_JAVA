import java.util.*;
public class graphCrea {
    static class adjMatrix{
        int V;
        int[][] adjMat;

        public adjMatrix(int vertices){
            this.V = vertices;
            adjMat = new int[vertices][vertices];
        }

        void addEdge(int u, int v){
            adjMat[u][v] = 1;
            adjMat[v][u] = 1;
        }

        void printMat(){
            System.out.println("Adjacency MAtrix");
            for(int i=0;i<V;i++){
                System.out.print(i+" ---> ");
                for(int j = 0;j<V;j++){
                    System.out.print(adjMat[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    static class adjList{
        int V;
        ArrayList<Integer>[] adjlist;

        public adjList(int vertices){
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

        void printlist(){
            System.out.println("Adjacency List");
            for(int i = 0;i<V;i++){
                System.out.print("Node "+i+" : ");
                for(int node : adjlist[i]){
                    System.out.print(node+" ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args){
        adjMatrix gm = new adjMatrix(4);

        gm.addEdge(0, 1);
        gm.addEdge(0, 2);
        gm.addEdge(1, 2);
        gm.addEdge(2, 3);

        gm.printMat();

        adjList gl = new adjList(4);

        gl.addEdge(0, 1);
        gl.addEdge(0, 2);
        gl.addEdge(1, 2);
        gl.addEdge(2, 3);

        gl.printlist();
    }
}
