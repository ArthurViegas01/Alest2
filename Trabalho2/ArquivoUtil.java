package Trabalho2;
import java.util.ArrayList;
import java.util.List;

public class ArquivoUtil {

    public static FrutasLinhas carregar(String path) {
        In in = new In(path);
        String[] linhasArquivo = in.readAllLines();

        List<String> frutasDistintas = new ArrayList<>();

        for (String linha : linhasArquivo) {
            String aLinha[] = linha.split(" -> ");
            String fruta1 = aLinha[0].trim();
            String fruta2 = aLinha[1].trim();

            if (!frutasDistintas.contains(fruta1)) {
                frutasDistintas.add(fruta1);
            }

            if (!frutasDistintas.contains(fruta2)) {
                frutasDistintas.add(fruta2);
            }
        }

        return new FrutasLinhas(frutasDistintas, linhasArquivo);
    }
}
