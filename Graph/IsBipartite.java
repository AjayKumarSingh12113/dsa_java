package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class IsBipartite {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n]; 
        for (int i = 0; i < n; i++) {
            color[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) { 
                if (!bfsCheck(graph, color, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean bfsCheck(int[][] graph, int[] color, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        color[start] = 0;

        while (!queue.isEmpty()) {
            int node = queue.remove();

            for (int neighbor : graph[node]) { 
                if (color[neighbor] == -1) { 
                    color[neighbor] = 1 - color[node];
                    queue.add(neighbor);
                } else if (color[neighbor] == color[node]) { 
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
