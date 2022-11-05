package src;

public class AulaDigrafo {
    public static void main(String args[]){

        Digraph DG = new Digraph(3);

        DG.addEdge(0, 1);
        DG.addEdge(1, 0);
        DG.addEdge(1, 2);
        DG.addEdge(2, 0);

        System.out.println(DG.toDot());

        DGBuscaProfundidade dfs1 = new DGBuscaProfundidade(DG, 0);
    }
}
