package Trabalho2;
import java.util.ArrayList;

public class DoisSaboresUtil {
    public ArrayList<Tupla> itens = new ArrayList<>();

    // Se nao existe adiciona na lista
    public void adicionar(int a, int b) {
        if (!existe(a, b)) {
            Tupla p = new Tupla(a, b);
            itens.add(p);
        }
    }

    // Verifica se existe
    private boolean existe(int a, int b) {
        for (int i = 0; i < itens.size(); i++) {
            Tupla p = itens.get(i);
            if (p.a == a && p.b == b) {
                return true;
            }
        }
        return false;
    }
}