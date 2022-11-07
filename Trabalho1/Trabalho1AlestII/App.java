/*Autor do Programa: Arthur Pereira Viegas*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<Jarro> ListaJarros = new ArrayList<Jarro>();
    static List<Node> ListaNodos = new ArrayList<Node>();
    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //instanciacao do scanner
        Scanner scan = new Scanner(System.in);
        int ContadorMovimentos = 0;

		
        System.out.printf("Digite o nome do arquivo: ");
        
        String path = scan.nextLine();//Caminho do arquivo


        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();// Leitor de linha

            //Instanciação dos objetos
            while(line != null){
                String[] vetor1 = line.split(" ");
                Integer Capacidade1 = Integer.parseInt(vetor1[0]);
                Integer Capacidade2 = Integer.parseInt(vetor1[1]);
                Integer Capacidade3 = Integer.parseInt(vetor1[2]);
                line = br.readLine();//Le uma linha
                
                String[] vetor2 = line.split(" ");
                Integer AguaAtual1 = Integer.parseInt(vetor2[0]);
                Integer AguaAtual2 = Integer.parseInt(vetor2[1]);
                Integer AguaAtual3 = Integer.parseInt(vetor2[2]);
                line = br.readLine();

                String[] vetor3 = line.split(" ");
                Integer QuantidadeFinal1 = Integer.parseInt(vetor3[0]);
                Integer QuantidadeFinal2 = Integer.parseInt(vetor3[1]);
                Integer QuantidadeFinal3 = Integer.parseInt(vetor3[2]);

                Node NodoFinal = new Node(QuantidadeFinal1,QuantidadeFinal2,QuantidadeFinal3);
                Node NodoInicial = new Node(AguaAtual1,AguaAtual2,AguaAtual3);


                Jarro Jarro1 = new Jarro(Capacidade1, AguaAtual1, QuantidadeFinal1, 1);//Final
                Jarro Jarro2 = new Jarro(Capacidade2, AguaAtual2, QuantidadeFinal2, 2);
                Jarro Jarro3 = new Jarro(Capacidade3, AguaAtual3, QuantidadeFinal3, 3);//Final

                
                ListaJarros.add(Jarro1);
                ListaJarros.add(Jarro2);
                ListaJarros.add(Jarro3);

                ListaNodos.add(NodoFinal);
                line = br.readLine();

                System.out.println("=============================");
                System.out.println("Agua atualmente no Jarro 1: "+Jarro1.getAguaAtual());
                System.out.println("Agua atualmente no Jarro 2: "+Jarro2.getAguaAtual());
                System.out.println("Agua atualmente no Jarro 3: "+Jarro3.getAguaAtual());
                System.out.println("=============================");
                Jarro2.despejaAgua(Jarro3);
                ContadorMovimentos++;
                System.out.println("Agua atualmente no Jarro 1: "+Jarro1.getAguaAtual());
                System.out.println("Agua atualmente no Jarro 2: "+Jarro2.getAguaAtual());
                System.out.println("Agua atualmente no Jarro 3: "+Jarro3.getAguaAtual());
                System.out.println("=============================");
                Jarro1.despejaAgua(Jarro2);
                ContadorMovimentos++;

                //Jarro1.despejaAgua(Jarro2);
                //new Node(Jarro1.getAguaAtual(), Jarro2.getAguaAtual(), Jarro3.getAguaAtual());
                //Jarro1.despejaAgua(Jarro3);
                //new Node(Jarro1.getAguaAtual(), Jarro2.getAguaAtual(), Jarro3.getAguaAtual());
                //Jarro2.despejaAgua(Jarro1);
                //new Node(Jarro1.getAguaAtual(), Jarro2.getAguaAtual(), Jarro3.getAguaAtual());
                //Jarro2.despejaAgua(Jarro3);
                //new Node(Jarro1.getAguaAtual(), Jarro2.getAguaAtual(), Jarro3.getAguaAtual());
                //Jarro3.despejaAgua(Jarro1);
                //new Node(Jarro1.getAguaAtual(), Jarro2.getAguaAtual(), Jarro3.getAguaAtual());
                //Jarro3.despejaAgua(Jarro2);
                //new Node(Jarro1.getAguaAtual(), Jarro2.getAguaAtual(), Jarro3.getAguaAtual());


                PrintWriter writer = new PrintWriter("Saida.txt", "UTF-8");
                writer.println(Capacidade1+" "+Capacidade2+" "+Capacidade3);
                writer.println(NodoInicial);
                writer.println(NodoFinal);
                writer.println("Numero de Movimentos: "+ContadorMovimentos);
                writer.close();
            }
            

        }catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        
        scan.close();
	}//Fim da Main

    public static void createNodes(){
        
    }

    public void checaResultado(){
        //checa se um dos nodos é o final
    }
}

