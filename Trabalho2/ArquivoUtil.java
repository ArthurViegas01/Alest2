package Trabalho2;
import java.util.ArrayList;
import java.util.List;

public class ArquivoUtil {

    public static SaboresLinhas carregar(String path) {
        In in = new In(path);
        String[] linhasArquivo = in.readAllLines();

        List<String> saboresDistintos = new ArrayList<>();

        for (String linha : linhasArquivo) {
            String aLinha[] = linha.split(" -> ");
            String sabor1 = aLinha[0].trim();
            String sabor2 = aLinha[1].trim();

            if (!saboresDistintos.contains(sabor1)) {
                saboresDistintos.add(sabor1);
            }

            if (!saboresDistintos.contains(sabor2)) {
                saboresDistintos.add(sabor2);
            }
        }
        return new SaboresLinhas(saboresDistintos, linhasArquivo);
    }
}
