package Trabalho2;
import java.util.ArrayList;

public class DigrafoBuscaProfundidade {
    public ArrayList<ArrayList<Integer>> todosCaminhos = new ArrayList<>();

    public void caminhar(Digraph g, int s) {
        ArrayList<Integer> caminho = new ArrayList<>();
        boolean[] marcado = new boolean[g.V()];

        caminho.add(s);
        CaminharRecursivo(g, s, marcado, caminho);
    }

    public void CaminharRecursivo(Digraph g, int s, boolean[] marcado, ArrayList<Integer> caminho) {
        for (int v : g.adj(s)) {
            if (!marcado[v]) {
                caminho.add(v);
                ArrayList<Integer> novaLista = new ArrayList<>(caminho);
                todosCaminhos.add(novaLista);
                CaminharRecursivo(g, v, marcado, caminho);
                caminho.remove((Integer) (v));
            }
        }
    }

}
