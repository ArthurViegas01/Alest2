package Trabalho2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        SaboresLinhas saboresLinhas = ArquivoUtil.carregar("casosteste/casoleonardo60.txt");
        DigrafoBuscaProfundidade digrafoBuscaProfundidade = new DigrafoBuscaProfundidade();
        DoisSaboresUtil doisSaboresUtil = new DoisSaboresUtil();
        TresSaboresUtil tresSaboresUtil = new TresSaboresUtil();



        // Cria com digraph com o tamanho dos sabores distintas
        long comecoPrograma = System.currentTimeMillis(); 
        Digraph digraph = new Digraph(saboresLinhas.saboresDistintos.size());

        // Cria as conexoes dos vertices
        long inicioCriarGrafoVertice = System.currentTimeMillis();
        for (String linha : saboresLinhas.linhas) {
            String linhaSplit[] = linha.split(" -> ");
            digraph.addEdge(saboresLinhas.saboresDistintos.indexOf(linhaSplit[0]), saboresLinhas.saboresDistintos.indexOf(linhaSplit[1]));
        }
        long fimCriarGrafoVertice = System.currentTimeMillis();


        
        // Caminha em todos vertices do digraph para adicionar nos caminhos
        long inicioCaminhar = System.currentTimeMillis();
        for (int i = 0; i < digraph.V(); i++) {
            digrafoBuscaProfundidade.caminhar(digraph, i);
        }
        long fimCaminhar = System.currentTimeMillis();




        // Contabiliza dois sabores
        long inicioContar2Sabores = System.currentTimeMillis();
        for (int i = 0; i < digrafoBuscaProfundidade.todosCaminhos.size(); i++) {
            ArrayList<Integer> caminho = digrafoBuscaProfundidade.todosCaminhos.get(i);
            int a = caminho.get(0);

            for (int j = 1; j < caminho.size(); j++) {
                int b = caminho.get(j);
                doisSaboresUtil.adicionar(a, b);
            }
        }
        long fimContar2Sabores = System.currentTimeMillis();




        // Contabiliza tres sabores
        long inicioContar3Sabores = System.currentTimeMillis();
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
        long fimContar3Sabores = System.currentTimeMillis();
        long tempoGeral = System.currentTimeMillis();

        float segundosCriarGrafoVertice = (fimCriarGrafoVertice - inicioCriarGrafoVertice) / 1000F;
        float segundosCaminhar = (fimCaminhar - inicioCaminhar) / 1000F;
        float segundosContar2 = (fimContar2Sabores - inicioContar2Sabores) / 1000F;
        float segundosContar3 = (fimContar3Sabores - inicioContar3Sabores) / 1000F;
        float segundosGeral = (tempoGeral - comecoPrograma) / 1000F;

        System.out.println("=====================================================");
        System.out.println(digraph.toDot() + "\n");
        System.out.println("=====================================================");
        System.out.println("Caso de teste com 60 sabores:");
        System.out.println("    Tempo para criar Grafo e conectar Vértices:     " + segundosCriarGrafoVertice);
        System.out.println("    Tempo para criar Caminhar pelo grafo:           " + segundosCaminhar);
        System.out.println("    Tempo para contar 2 sabores:                    " + segundosContar2);
        System.out.println("    Tempo para contar 3 sabores:                    " + segundosContar3);
        System.out.println("    Tempo Geral:                                    " + segundosGeral);
        System.out.println("=====================================================");
        System.out.println("Sabores: \n    " + saboresLinhas.saboresDistintos);
        System.out.println("=====================================================");        
        System.out.println("Número de caminhos possíveis: " + digrafoBuscaProfundidade.todosCaminhos.size());
        System.out.println("    Copinhos com Dois sabores: " + doisSaboresUtil.itens.size());
        System.out.println("    Copinhos com Tres sabores: " + tresSaboresUtil.itens.size());
    }
}
