public class DepthFirstsPaths {

    private boolean[] marked;
    private int[] edgeTo;
    private int start;

    public DepthFirstsPaths(Graph g, int start) {
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];
        this.start = start;
        //preencher com -1
        for (int i = 0; i < edgeTo.length; i++) {
            edgeTo[i] = -1;
        }
        dfs(g, start);
    }

    private void dfs(Graph g, int vertice) {
        this.marked[vertice] = true;
        for (int adjacente : g.adj(vertice)) {
            if (!this.marked[adjacente]) {
                this.edgeTo[adjacente] = vertice;
                dfs(g, adjacente);
            }

        }
    }

}
