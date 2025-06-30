package Graph;

import java.util.ArrayList;

public class BellmanFordAlgoo2 {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d , int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph){
        // for (int i = 0; i < graph.size(); i++) {
        //     graph[i]= new ArrayList<>();
        // }
        graph.add(new Edge(0,1,2));
        graph.add(new Edge(0, 2, 4));

        graph.add(new Edge(1, 2, -4));

        graph.add(new Edge(2,3,2));

        graph.add(new Edge(3, 4, 4));

        
        graph.add(new Edge(4, 1, -1));
       
        
    }
    public static void bellmanFordAlgorithm(ArrayList<Edge> graph ,int src, int V){
        int dist[] = new int[V];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i]=Integer.MAX_VALUE;
            }
        }
       
        for (int i = 0; i < V-1; i++) {// iteration 
            //edges all
            
                for (int k = 0; k < graph.size(); k++) {// all virtic ke all edges
                    Edge e = graph.get(k);
                    int u = e.src;
                    int v = e.dest ;
                    int wt = e.wt;

                     if (dist[u]!= Integer.MAX_VALUE && dist[u]+wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                     }
                }
            
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+" ");
        }
    }
    public static void main(String[] args) {
        int V = 5;
        //@SuppressWarnings("unchecked")
        ArrayList<Edge> graph= new ArrayList<>();
        createGraph(graph);
        bellmanFordAlgorithm(graph, 0,V);
    }
}
