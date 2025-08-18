import java.util.*;
public class DirectedGraphCycle {
    @SuppressWarnings("FieldMayBeFinal")
    private int V;
    @SuppressWarnings("FieldMayBeFinal")
    private List<List<Integer>> adj;

    public DirectedGraphCycle(int V){
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v){
        adj.get(u).add(v);
    }

    public boolean isCyclic(){
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for(int i = 0;i<V;i++){
            if(!visited[i]){
                if(dfs(i, visited, recStack)) return true;
            }
        }
        return false;
    }

    public boolean dfs(int node, boolean[] visited, boolean[] recStack){
        visited[node] = true;
        recStack[node] = true;

        for(int neigh : adj.get(node)){
            if(!visited[neigh]){
                if(dfs(neigh, visited, recStack)){
                    return true;
                }
            }else if(recStack[neigh]){
                return true;
            }
        }
        recStack[node] = false;
        return false;
    }

    public static void main(String[] args){
        DirectedGraphCycle g = new DirectedGraphCycle(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Cycle Exists : "+g.isCyclic());
    }
}
