package Trabalho2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AulaDigrafo {
    public static void main(String args[]) throws IOException{

        String arquivo = "Trabalho2/casoleonardo10.txt";
        BufferedReader BR = new BufferedReader(new FileReader(arquivo));

        ArrayList<Sabor> sabor = new ArrayList<>();

        String linha = "";
        
        

        while((linha = BR.readLine()) != null){
            String[] leitura = linha.split(" -> ");



            BR.readLine();
        }

        for(int i = 0; i < sabor.size(); i++){
            System.out.print(sabor.get(i));

        }
    }
}
