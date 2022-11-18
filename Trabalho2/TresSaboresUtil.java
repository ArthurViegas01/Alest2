package Trabalho2;
import java.util.ArrayList;

public class TresSaboresUtil {
    public ArrayList<Tupla> itens = new ArrayList<>();

    // Se nao existe adiciona na lista
    public void adicionar(int a, int b, int c) {
        if (!existe(a, b, c)) {
            Tupla p = new Tupla(a, b, c);
            itens.add(p);
        }
    }

    // Verifica se existe
    private boolean existe(int a, int b, int c) {
        for (int i = 0; i < itens.size(); i++) {
            Tupla p = itens.get(i);
            if (p.a == a && p.b == b && p.c == c) {
                return true;
            }
        }
        return false;
    }
}