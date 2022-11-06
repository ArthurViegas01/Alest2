package Trabalho2;

public class DigrafoBuscaProfundidade{
    public boolean[] marked;
    public int[] edgeTo;
    public Stack<Integer> reversePostOrder;

    public DigrafoBuscaProfundidade(Digraph G, int s) {
        reversePostOrder = new Stack<>();
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];

        dfs(G, s);
    }

    //VAI CAIR COMO IMPLEMENTAR
    private void dfs(Digraph G, int v) {
        marked[v] = true;
        for (int w:G.adj(v)) {
            if(!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
        reversePostOrder.push(v);
    }


}