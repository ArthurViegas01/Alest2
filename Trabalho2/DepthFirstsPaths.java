package src;

public class DepthFirstsPaths {
    public boolean[] marked;
    public int[] edgeTo;
    public int start;

    public DepthFirstsPaths(Graph g, int start){
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];
        this.start = start;

        for(int i = 0; i < edgeTo.length; i++){
            edgeTo[i] = -1;
        }
        dfs(g,start);
    }

    public void dfs(Graph g, int vertice){
        this.marked[vertice] = true;

        for(int adjacent : g.adj(vertice)){

            if(!this.marked[adjacent]){

                this.edgeTo[adjacent] = vertice;
                dfs(g, adjacent);
            }
            
        }
        
    }
}
