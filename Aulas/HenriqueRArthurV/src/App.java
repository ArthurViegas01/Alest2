import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App{
    public static void main(String[] args) throws IOException {
        FilmesAtoresVertice filmesAtoresVertice = Arquivo.lerArquivo();
        Graph g = new Graph(filmesAtoresVertice.vertices);
        Map<String, Integer> map = new HashMap<String, Integer>();

        Integer contador = 0;
        for (FilmeAtores filmeAtores : filmesAtoresVertice.filmeAtores) {

            for (String ator : filmeAtores.atores) {
                if (map.get(ator) == null) {
                    map.put(ator, contador);
                    g.addEdge(contador, contador);
                }
                contador++;
            }

            map.put(filmeAtores.filme, contador);
            contador++;
        }

        DepthFirstsPaths depthFirstsPaths = new DepthFirstsPaths(g, 0);

        System.out.println(g.toDot());

    }

}
