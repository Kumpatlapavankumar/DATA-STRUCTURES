import java.util.*;
class DFS{
    public static class Edge{
        int source;
        int destination;
        public Edge(int source,int destination){
            this.source=source;
            this.destination=destination;
        }
    }
    //graphs
    public static void creategraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 5));
    }
    public static void dfs(ArrayList<Edge>[] graph,int current,boolean[] visit){
        System.out.print(current+" ");
        visit[current]=true;
        for(Edge e:graph[current]){
            if(visit[e.destination]==false){
                dfs(graph,e.destination,visit);
            }
        }
    }
    public static void main(String[] args){
        int v=7;
        ArrayList<Edge>[] graph=new ArrayList[v];
        creategraph(graph);
        boolean[] visit=new boolean[v];
        dfs(graph,0,visit);
        System.out.println();
    }
}
