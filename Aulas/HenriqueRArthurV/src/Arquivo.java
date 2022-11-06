import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {

    public static FilmesAtoresVertice lerArquivo() throws IOException {
        String path = "src/movies.txt";
        BufferedReader buffRead = new BufferedReader(new FileReader(path));

        FilmesAtoresVertice filmesAtoresVertice = new FilmesAtoresVertice();
        ArrayList<FilmeAtores> filmeAtores = new ArrayList<>();

        Integer vertices = 0;

        Integer teste = 0;

        String linha = "";
        while (true) {
            linha = buffRead.readLine();
//            if (linha != null) {
            if(teste < 5){
                FilmeAtores fa = new FilmeAtores();
                ArrayList<String> atores = new ArrayList<>();

                String[] leitura = linha.split("/");
                fa.filme = leitura[0];
                vertices++;

                for (int i = 1; i < leitura.length; i++) {
                    atores.add(leitura[i]);
                    vertices++;
                }

                fa.atores = atores;
                filmeAtores.add(fa);
                teste++;
            } else {
                filmesAtoresVertice.filmeAtores = filmeAtores;
                filmesAtoresVertice.vertices = vertices;
                buffRead.close();
                return filmesAtoresVertice;
            }
        }

    }
}
