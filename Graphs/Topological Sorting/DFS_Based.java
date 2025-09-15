import java.util.*;
public class DFS_Based {
    private static void dfs(int node, List<List<Integer>> adj, boolean[] visited, Stack<Integer> st){
        visited[node] = true;
        for(int neigh : adj.get(node)){
            if(!visited[neigh]){
                dfs(neigh, adj, visited, st);
            }
        }

        st.push(node);
    }
    public static List<Integer> toposort(int V, List<List<Integer>> adj){
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<V;i++){
            if(!visited[i]){
                dfs(i, adj, visited,st);
            }
        }

        List<Integer> topo = new ArrayList<>();
        while(!st.isEmpty()){
            topo.add(st.pop());
        }

        return topo;
    }
    public static void main(String[] args) {
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0;i < V;i++){
            adj.add(new ArrayList<>());
        }

        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        System.out.print("Topological Sorting (DFS_Based) : ");
        List<Integer> result = toposort(V, adj);
        System.out.print(result);
    }
}
