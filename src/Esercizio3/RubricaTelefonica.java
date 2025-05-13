package Esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {

    private Map<String, String> rubrica;


    public RubricaTelefonica() {
        rubrica = new HashMap<>();
    }


    public void aggiungiContatto(String nome, String numero) {
        rubrica.put(nome, numero);
        System.out.println("Contatto aggiunto: " + nome + " → " + numero);
    }


    public void rimuoviContatto(String nome) {
        if (rubrica.containsKey(nome)) {
            rubrica.remove(nome);
            System.out.println("Contatto rimosso: " + nome);
        } else {
            System.out.println("Contatto non trovato: " + nome);
        }
    }


    public void trovaNomeDaNumero(String numero) {
        boolean trovato = false;
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numero)) {
                System.out.println("Numero " + numero + " appartiene a: " + entry.getKey());
                trovato = true;
                break;
            }
        }
        if (!trovato) {
            System.out.println("Nessun contatto ha questo numero.");
        }
    }


    public void trovaNumeroDaNome(String nome) {
        if (rubrica.containsKey(nome)) {
            System.out.println("Numero di " + nome + " è: " + rubrica.get(nome));
        } else {
            System.out.println("Contatto non trovato: " + nome);
        }
    }


    public void stampaRubrica() {
        if (rubrica.isEmpty()) {
            System.out.println("La rubrica è vuota.");
        } else {
            System.out.println("Rubrica:");
            for (Map.Entry<String, String> entry : rubrica.entrySet()) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }
}

