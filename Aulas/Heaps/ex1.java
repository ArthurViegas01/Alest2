package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ex1{

    public static void main (String args[]){

        ArrayList Inteiros = new ArrayList();

        Random random = new Random();
    
        for (int i = 0; i < 20; i++)
        {
            Inteiros.add(random.nextInt(100));
        }

        System.out.println("Before Sorting: "+ Inteiros);
        Collections.sort(Inteiros);   
        // printing the sorted ArrayList   n
        System.out.println("After Sorting : "+ Inteiros);   
        //System.out.println(Inteiros);

        
    }
}