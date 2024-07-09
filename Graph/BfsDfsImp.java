import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsDfsImp {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            src = s;
            dest = d;
            wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> []graph){
        // null -> empty ArrayList
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // vertex 0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // vertex 1
        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 0, 1));


        // vertex 2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));


        // vertex 3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // vertex 4
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // vertex 5
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 6, 1));

        // vertex 6
        graph[6].add(new Edge(6, 5, 1));
    }

    public static void bfs(ArrayList<Edge> []graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];

        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);

                    q.add(e.dest);
                }
            }
        }

    }
    public static void dfs(ArrayList<Edge> []graph,int curr, boolean[] vis){
        System.out.print(curr+" ");

        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;

        ArrayList<Edge> []graph = new ArrayList[V];

        

        // Create graph
        createGraph(graph);


        bfs(graph);
        System.out.println();
        dfs(graph, 0, new boolean[V]);
    }
}

