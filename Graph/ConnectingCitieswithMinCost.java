package Graph;

import java.util.PriorityQueue;

public class ConnectingCitieswithMinCost {
    static class Edge implements Comparable<Edge> {
        int dest;
        int cost;

        public Edge(int d, int ca){
            this.dest = d;
            this.cost = ca;
        }
        @Override
        public int compareTo(Edge e2){
            return this.cost-e2.cost;
        }
        
    }
    public static int connectCities(int cities[][]){
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean vis[]= new boolean[cities.length];
        pq.add(new Edge(0, 0));

        int finalCost =0;
        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            if (!vis[curr.dest]) {
                //System.out.print(curr.dest);
                vis[curr.dest]=true;
                finalCost += curr.cost;

                for (int i = 0; i < cities[curr.dest].length; i++) {
                    //System.out.print(i + " ");
                    //System.out.println();
                    if (cities[curr.dest][i] != 0) {
                        //System.out.print(cities[curr.dest][i]+" ");
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalCost;
    }
    public static void main(String[] args) {
        int cities[][] = {{0,1,2,3,4},
                         {1,0,5,0,7},
                         {2,5,0,6,0},
                         {3,0,6,0,0},
                         {4,7,0,0,0}};
        System.out.println(connectCities(cities));
    }
}
