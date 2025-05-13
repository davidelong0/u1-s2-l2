package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListeEsercizio {


    public static List<Integer> generaLista(int n) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(rand.nextInt(101));
        }

        Collections.sort(lista);
        return lista;
    }


    public static List<Integer> doppiaListaInversa(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>(lista);

        List<Integer> invertita = new ArrayList<>(lista);
        Collections.reverse(invertita);

        nuovaLista.addAll(invertita);

        return nuovaLista;
    }


    public static void stampaPariODispari(List<Integer> lista, boolean stampaPari) {
        System.out.println(stampaPari ? "Valori in posizioni pari:" : "Valori in posizioni dispari:");

        for (int i = 0; i < lista.size(); i++) {
            if (stampaPari && i % 2 == 0) {
                System.out.println("Indice " + i + ": " + lista.get(i));
            } else if (!stampaPari && i % 2 != 0) {
                System.out.println("Indice " + i + ": " + lista.get(i));
            }
        }
    }


    public static void main(String[] args) {
        int n = 5;


        List<Integer> listaOrdinata = generaLista(n);
        System.out.println("Lista ordinata casuale:");
        System.out.println(listaOrdinata);


        List<Integer> listaDoppia = doppiaListaInversa(listaOrdinata);
        System.out.println("\nLista + inversa:");
        System.out.println(listaDoppia);


        System.out.println();
        stampaPariODispari(listaDoppia, true);


        System.out.println();
        stampaPariODispari(listaDoppia, false);
    }
}
