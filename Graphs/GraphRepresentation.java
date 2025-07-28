import java.util.*;
public class GraphRepresentation {

// ----> Graph representation using Adjacency Matrix
    static class graphMatrix{
        int V;
        int adjMatrix[][];

        public graphMatrix(int vertices) {
            this.V = vertices;
            adjMatrix = new int[vertices][vertices];
        }

        void addEdge(int u, int v){
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;   //remove for directed graph
        }

        void printmatix(){
            System.out.println("Adjacency matrix graph : ");
            for(int i = 0;i<V;i++){
                System.out.print(i+" -> ");
                for(int j = 0;j<V;j++){
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

// ----> Graph representation using Adjacency List
    static class graphList{
        int V;
        LinkedList<Integer>[] adjList;

        graphList(int vertices){
            this.V = vertices;
            adjList = new LinkedList[vertices];
            for(int i = 0;i<vertices;i++){
                adjList[i] = new LinkedList<>();
            }
        }

        void addEdge(int u, int v){
            adjList[u].add(v);
            adjList[v].add(u);    //remove for directed graph
        }

        void printlist(){
            System.out.println("Adjacency List graph : ");
            for(int i = 0;i<V;i++){
                System.out.print("Node "+i+" : ");
                for(Integer node : adjList[i]){
                    System.out.print(node + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        graphMatrix gm = new graphMatrix(4);

        gm.addEdge(0, 1);
        gm.addEdge(0, 2);
        gm.addEdge(1, 2);
        gm.addEdge(2, 3);
        gm.printmatix();

        System.out.println();

        graphList gl = new graphList(4);
        gl.addEdge(0, 1);
        gl.addEdge(0, 2);
        gl.addEdge(1, 2);
        gl.addEdge(2, 3);
        gl.printlist();
    }
}
