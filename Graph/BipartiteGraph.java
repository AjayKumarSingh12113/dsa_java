package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 4, 1));
        graph[1].add(new Edge(1, 0, 1));

        graph[2].add(new Edge(2, 4, 1));
        graph[2].add(new Edge(2, 0, 1));

        graph[4].add(new Edge(4, 1, 1));
        graph[4].add(new Edge(4, 2, 1));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int col[] = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                col[i] = 0;// yellow
                q.add(i);
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (col[e.dest] == -1) {
                            int nextcol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextcol;
                            q.add(e.dest);
                        } else if (col[e.dest] == col[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean bipartite(ArrayList<Edge> graph[]) {
        int col[] = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                col[i] = 0;
                q.add(i);
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (col[e.dest] == -1) {
                            int nextcol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextcol;
                            q.add(e.dest);
                        } else if (col[e.dest] == col[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
        System.out.println(bipartite(graph));
    }
}
