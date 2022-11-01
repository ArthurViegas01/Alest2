import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        //instanciacao do scanner
        Scanner scan = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        ArrayList<FilmesAtores> filmesAtores= new ArrayList<>();
		
        System.out.println("Digite o caminho para o arquivo (com o nome do arquivo, sem aspas)"
                    + "\nEx.: C:/Users/(nome)/Documents/arquivo.txt");
        
        String path = "C:/Users/Viegas/Desktop/Faculdade/1. Algoritmos e Estruturas de dados 2/Exercicio26/movies.txt";
        

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            //Instanciação dos objetos
            // while(line != null){
            String[] filmes = line.split("/");



            for(int i = 0; i < filmes.length; i++){
                
                if(i == 0){
                    FilmesAtores.add
                }
            }

            

        }catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }


        
        
        scan.close();
        
        in.close();
	}
}