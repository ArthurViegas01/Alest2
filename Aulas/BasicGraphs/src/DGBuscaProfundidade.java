package src;

public class DGBuscaProfundidade{
    
    private boolean marked[];
    private int edgeTo[];

    public DGBuscaProfundidade(Digraph DG, int s){
        marked = new boolean[DG.V()];
        edgeTo = new int[DG.V()];
        for(int i = 0; i < DG.V(); i++){
            edgeTo[i] = -1;
        }
        dfs(DG, s);
    }

    //VAI CAIR NA PROVA COMO IMPLEMENTAR
    public void dfs(Digraph DG, int v){
        marked[] = true;

    }
}