package Graph;

import java.util.ArrayList;

public class CreateGraph {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int wt){
            this.src=s;
            this.dest = d;
            this.wt=wt;
        }
    }
    public static void main(String[] args) {
        int v =5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i]= new ArrayList<>();
        }
        // 0-vetice
        graph[0].add(new Edge(0, 1, 5));

        // 1-vetice
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2-vetice
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 4 , 2));
        graph[2].add(new Edge(2, 3, 1));

        // 3-vetice
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4-vetice
        graph[4].add(new Edge(4, 2, 2));
       
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }

    }
}
