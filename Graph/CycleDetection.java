package Graph;
import java.util.ArrayList;

public class CycleDetection {
    static class Edge{
        int src;
        int dest;
        
        public Edge(int s,int d,int wt){
            this.src=s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 0, 1));

        graph[2].add(new Edge(2, 4, 1));
        graph[2].add(new Edge(2, 0, 1));

        //graph[3].add(new Edge(3, 5, 1));
        //graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 1, 1));

        graph[4].add(new Edge(4, 5, 1));
        // graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 2, 1));

        graph[5].add(new Edge(5, 6, 1));
        // -    graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));

        graph[6].add(new Edge(6, 5, 1)); 
    }
    public static boolean cylcedetect(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (cylcedetectutil(graph,vis,i,-1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean cylcedetectutil(ArrayList<Edge>[] graph,boolean[] vis,int curr, int par){
        vis[curr]=true;
        for(int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {// case-3
                if (cylcedetectutil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }else if (vis[e.dest] && e.dest != par) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        System.out.println(cylcedetect(graph));
    }
}
