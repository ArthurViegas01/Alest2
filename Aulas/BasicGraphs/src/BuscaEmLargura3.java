package src;

import java.util.LinkedList;
import java.util.Queue;

public class BuscaEmLargura3{
    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;
    private int s;

    public BuscaEmLargura3(Graph g, int s){
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];
        distTo = new int[g.V()];

        for(int i = 0; i < g.V(); i++){
            edgeTo[i] = -1;
        }

        for(int i = 0; i < g.V(); i++){
            distTo[i] = Integer.MAX_VALUE;
        }
        bfs(g,s);
    }

    private void bfs(Graph g, int s){
        marked[s] = true;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);

        while(!q.isEmpty()){
            int v = q.remove();
            System.out.println("Removi o "+ v +" da fila");

            for(int f:g.adj(v)){
                if(!marked[f]){
                    System.out.println("    Adicionei o "+ f +" na fila");
                    q.add(f);
                    marked[f] = true;
                    edgeTo[f] = v;
                    distTo[f] = distTo[v] + 1;
                }
            }
        }
    }
}