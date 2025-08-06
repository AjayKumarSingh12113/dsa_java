package Graph;

import java.util.ArrayList;

public class DirectCycleDect {
    static class Edge{
        int src;
        int dest;
        
        public Edge(int s,int d){
            this.src=s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        //graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        //graph[1].add(new Edge(1, 0));

        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 0));
    }
    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph,i,vis , stack)) {
                    return true;
                }
            }
        }
        return false;
    }
    // public static boolean cycle(ArrayList<Edge>[] graph){
    //     boolean vis[] = new boolean[graph.length];
    //     boolean stack[] = new boolean[graph.length];

    //     for (int i = 0; i < graph.length; i++) {
    //         if (!vis[i]) {
    //             if (cycleUtil(graph,i,vis , stack)) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr , boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]= true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) {
                return true;
            }
            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }
        stack[curr]= false;
        return false;
    }
    // public static boolean cycleUtil(ArrayList<Edge>[] graph,int curr , boolean vis[],boolean stack[]){
    //     vis[curr]= true;
    //     stack[curr]=true;
    //     for (int i = 0; i < graph[curr].size(); i++) {
    //         Edge e = graph[curr].get(i);
    //         if (stack[e.dest]) {
    //             return true;
    //         }
    //         else if (!vis[e.dest] && cycleUtil(graph, e.dest, vis, stack)) {
    //             return true;
    //         }
    //     }
    //     stack[curr]=false;
    //     return false;
    // }
    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph));
        //System.out.println(cycle(graph));
    }

}
