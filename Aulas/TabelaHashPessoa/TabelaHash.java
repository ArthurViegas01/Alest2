public class TabelaHash {

    private Pessoa[] tabela;

    public TabelaHash() {
        this.tabela = new Pessoa[10];
    }

    private int hash(int chave) {
        return chave % this.tabela.length; //retorna sempre uma posicao dentro da tabela
    }

    public Pessoa get(int chave) {
        int hash = hash(chave);
        return this.tabela[hash]; //acesso direto ao dado
    }

    public void add(Pessoa p) {
        int hash = this.hash(p.getCodigo());
        this.tabela[hash] = p;
    }

}
