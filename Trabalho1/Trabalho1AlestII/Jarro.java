public class Jarro {
    
    private Integer Capacidade;
    private Integer AguaAtual;
    private Integer QuantidadeFinal;
    private Integer ID;
    private int Sobra = 0;

    public Jarro(Integer capacidade, Integer aguaAtual, Integer quantidadeFinal, Integer id) {
        Capacidade = capacidade;
        AguaAtual = aguaAtual;
        QuantidadeFinal = quantidadeFinal;
        ID = id;
    }

    public Integer getCapacidade() {
        return Capacidade;
    }

    public Integer getAguaAtual() {
        return AguaAtual;
    }

    public Integer getQuantidadeFinal() {
        return QuantidadeFinal;
    }

    public Integer getID() {
        return ID;
    }
   
    public void setCapacidade(Integer capacidade) {
        Capacidade = capacidade;
    }

    public void despejaAgua(Jarro jarrox) {
        AguaAtual = jarrox.setAguaAtual(AguaAtual);
    }

    public Integer setAguaAtual(Integer Quantidade) {
        if(Quantidade > 0){
            if((Quantidade+AguaAtual)>Capacidade){//Se tiver Overflow
                Sobra = (AguaAtual+Quantidade)-Capacidade;
                AguaAtual = Capacidade;
                return Sobra;
            }
            AguaAtual=AguaAtual+Quantidade;//Se não ultrapassar Capacidade
            return Sobra;
        }
        return Sobra;
    }

    public void setQuantidadeFinal(Integer quantidadeFinal) {
        QuantidadeFinal = quantidadeFinal;
    }

    public void setID(Integer id) {
        ID = id;
    }

    @Override
    public String toString() {
        return "Jarro"+ID+"\nCapacidade = " + Capacidade + "\nAguaAtual = " + AguaAtual + "\nQuantidadeFinal = " + QuantidadeFinal;
    }
}
