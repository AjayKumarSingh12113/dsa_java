package Graph;

import java.util.ArrayList;
import java.util.List;

public class AllpathfromSRCtoDEST {
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> aj = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        helper(graph,0,graph.length-1,aj,path);
        return aj;
    }
    public static void helper(int[][] graph,int src, int dest, List<List<Integer>> aj,List<Integer> path){
        if(src == dest){
            aj.add(new ArrayList<>(path));
            return;
        }
        for(int neighbour : graph[src]){
            path.add(neighbour);
            helper(graph,neighbour,dest,aj,path);
            path.remove(path.size()-1);
        }
    }
    public static void main(String[] args) {
        
    }
}
