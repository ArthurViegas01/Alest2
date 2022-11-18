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
        //Recebe o digrafo, um vértice para começar, uma lista boolean para marcar as arestas a serem visitadas, e um arraylist para armazenar o caminho
        for (int v : g.adj(s)) {                                                //Para cada aresta adjascente da aresta inicial
            if (!marcado[v]) {                                                  //Se ela não for marcada
                caminho.add(v);                                                 //Adiciona a aresta em um arrayList de caminhos(Mais ou menos uma pilha)
                ArrayList<Integer> listaTemporaria = new ArrayList<>(caminho);  //cria uma lista dos caminhos do vértice atual
                todosCaminhos.add(listaTemporaria);                             //adiciona o caminho do vértice atual em um arraylist de todos os caminhos
                CaminharRecursivo(g, v, marcado, caminho);                      //chama recursivamente o método Caminhar recursivo com os novos caminhos adicionados
                caminho.remove((Integer) (v));                                  //remove o caminho atual da lista temporária
            }
        }
    }
}
