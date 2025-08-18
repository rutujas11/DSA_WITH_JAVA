import java.util.*;

public class UndirectedGraphCycle {
    private final int V;
    @SuppressWarnings("FieldMayBeFinal")
    private List<List<Integer>> adj;

    public UndirectedGraphCycle(int V){
        this.V = V;
        adj = new ArrayList<>();
        for(int i = 0;i<V;i++){
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public boolean isCycle(){
        boolean[] visited = new boolean[V];

        for(int i = 0;i<V;i++){
            if(dfs(i, visited, -1)){
                return true;
            }
        }
        return false;
    }
    
    public boolean dfs(int node, boolean[] visited, int parent){
        visited[node] = true;

        for(int neigh : adj.get(node)){
            if(!visited[neigh]){
                if(dfs(neigh, visited, node)){
                    return true;
                }
            }else if(neigh != parent){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        UndirectedGraphCycle g = new UndirectedGraphCycle(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        System.out.println("Cycle Exists : "+g.isCycle());
    }
}
