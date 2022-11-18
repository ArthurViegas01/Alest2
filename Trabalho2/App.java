package Trabalho2;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        DigrafoBuscaProfundidade digrafoBuscaProfundidade = new DigrafoBuscaProfundidade();
        FrutasLinhas frutasLinhas = ArquivoUtil.carregar("casosteste/exemplotrabalho.txt");

        // Cria com digraph com o tamanho das frutas distintas
        Digraph digraph = new Digraph(frutasLinhas.frutasDistintas.size());

        // Cria as conexoes dos vertices
        for (String linha : frutasLinhas.linhas) {
            String linhaSplit[] = linha.split(" -> ");
            digraph.addEdge(frutasLinhas.frutasDistintas.indexOf(linhaSplit[0]), frutasLinhas.frutasDistintas.indexOf(linhaSplit[1]));
        }

        
        // Caminha em todos vertices do digraph para adicionar nos caminhos
        for (int i = 0; i < digraph.V(); i++) {
            digrafoBuscaProfundidade.caminhar(digraph, i);
        }

        // Contabiliza dois sabores
        DoisSaboresUtil doisSaboresUtil = new DoisSaboresUtil();
        for (int i = 0; i < digrafoBuscaProfundidade.todosCaminhos.size(); i++) {
            ArrayList<Integer> caminho = digrafoBuscaProfundidade.todosCaminhos.get(i);
            int a = caminho.get(0);

            for (int j = 1; j < caminho.size(); j++) {
                int b = caminho.get(j);
                doisSaboresUtil.adicionar(a, b);
            }
        }

        // Contabiliza tres sabores
        TresSaboresUtil tresSaboresUtil = new TresSaboresUtil();
        for (int i = 0; i < digrafoBuscaProfundidade.todosCaminhos.size(); i++) {
            ArrayList<Integer> caminho = digrafoBuscaProfundidade.todosCaminhos.get(i);

            for (int j = 0; j < caminho.size(); j++) {
                for (int k = j; k < caminho.size(); k++) {
                    for (int z = k; z < caminho.size(); z++) {
                        int a = caminho.get(j);
                        int b = caminho.get(k);
                        int c = caminho.get(z);
                        if (a != b && a != c && b != c) {
                            tresSaboresUtil.adicionar(a, b, c);
                        }
                    }
                }
            }
        }

        System.out.println("Frutas: " + frutasLinhas.frutasDistintas);
        System.out.println(digraph.toDot());
        System.out.println("Todos caminhos: " + digrafoBuscaProfundidade.todosCaminhos.size());
        System.out.println("Dois sabores: " + doisSaboresUtil.itens.size());
        System.out.println("Tres sabores: " + tresSaboresUtil.itens.size());
    }
}
