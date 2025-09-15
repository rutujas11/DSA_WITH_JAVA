import java.util.*;
public class Kahns_BFS {
    public static List<Integer> kahnSort(int V, List<List<Integer>> adj){
        int[] indegree = new int[V];

        for(int i = 0;i<V;i++){
            for(int neigh : adj.get(i)){
                indegree[neigh]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<V;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        List<Integer> res = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            res.add(node);
            
            for(int neigh : adj.get(node)){
                indegree[neigh]--;
                if(indegree[neigh] == 0){
                    q.add(neigh);
                }
            }
        }

        if(res.size() != V){
            System.out.println("Graph is Cyclic!!! Not a valid graph");
            return new ArrayList<>();
        }

        return res;
    }
    
    public static void main(String[] args) {
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        System.out.print("Topological Sorting (Kahn's Algorithm) : ");
        List<Integer> result = kahnSort(V, adj);
        System.out.print(result);
    }
    
}
