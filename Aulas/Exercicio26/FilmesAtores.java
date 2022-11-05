public class FilmesAtores {

    private String Filme;
    private String[] Atores;

    public FilmesAtores(String filme, String[] atores){
        Filme = filme;
        Atores = atores;
    }

    @Override
    public String toString(){
        return "Filme" + Filme + "\n    Atores: "+ Atores;
    }
}
