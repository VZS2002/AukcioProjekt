package hu.petrik.aukcio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Festmeny> lista= new ArrayList<Festmeny>();
        Festmeny festmeny1 = new Festmeny("asd1","asd2","asd3");
        Festmeny festmeny2 = new Festmeny("Elfolyó idő","Salvador Dalí","asd3");

        lista.add(festmeny1);
        lista.add(festmeny2);

        System.out.println("Adj meg egy darabszámot");
        int db= sc.nextInt();

        for (int i = 0; i < db; i++) {
            
        }
    }


}
