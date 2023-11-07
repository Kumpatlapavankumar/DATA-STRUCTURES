import java.util.*;
public class Main{
    public static class Edge{
        int destination;
        int weight;
       public Edge(int destination,int weight){
            this.destination=destination;
            this.weight=weight;
        }
    }
    public static void dijkstra(ArrayList<ArrayList<Edge>> graph,int start){
        int[] distance=new int[graph.size()];
        boolean[] visited=new boolean[graph.size()];
        PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->Integer.compare(distance[a],distance[b]));
        for(int i=0;i<graph.size();i++){
            distance[i]=Integer.MAX_VALUE;
        }
        distance[start]=0;
        queue.add(start);
        while(!queue.isEmpty()){
            int current=queue.poll();
            if(visited[current]){
                continue;
            }
            visited[current]=true;
            for(Edge e:graph.get(current)){
                int neighbor=e.destination;
                int newDistance=distance[current]+e.weight;
                if(newDistance<distance[neighbor]){
                    distance[neighbor]=newDistance;
                    queue.add(neighbor);
                }
            }
        }
        for(int i=0;i<graph.size();i++){
            System.out.println("Shortest distance from node "+start+"to node "+i+":"+distance[i]);
        }
    }
    public static void main(String[] args){
        int numofvertices=5;
        ArrayList<ArrayList<Edge>> graph=new ArrayList<>(numofvertices);
        for(int i=0;i<numofvertices;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Edge(1,2));
        graph.get(1).add(new Edge(2, 5));
        graph.get(1).add(new Edge(3, 10));
        graph.get(2).add(new Edge(3, 3));
        graph.get(3).add(new Edge(4, 7));
        int startnode=0;
        dijkstra(graph,startnode);
    }
}
