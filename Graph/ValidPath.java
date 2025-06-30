package Graph;

import java.util.ArrayList;

public class ValidPath {
    public  boolean validPath(int n, int[][] edges, int source, int destination) {//edges = [[0,1], [1,2], [2,3], [3,4], [4,0]]
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());//[[],[]]graph = [ [], [], [], [], [] ]
        }
        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);//[0,2] 0 indext pe edges me jo 1 index pe oh rakh do 0->2
            graph.get(edge[1]).add(edge[0]);// similarly index 1 pe 0 index wala rakh ho like 1->0
            //graph = [ [2], [0], [], [], [] ]
        }//graph = [ [1], [0,2], [1,3], [2,4], [3] ]
        //graph = [ [1,4], [0,2], [1,3], [2,4], [3,0] ]
        boolean[] vis = new boolean[n];
        return hasPath(graph,source,destination,vis);
    }
    public boolean hasPath(ArrayList<ArrayList<Integer>> graph,int src,int dest,boolean[] vis){
        if(src == dest){
            return true;
        }
        vis[src]=true;
        for (int neighbor : graph.get(src)) {
            if (!vis[neighbor] && hasPath(graph, neighbor, dest, vis)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
