package Esercizio3;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.aggiungiContatto("Luca", "3456789012");
        rubrica.aggiungiContatto("Anna", "3331122334");
        rubrica.aggiungiContatto("Marco", "3201234567");

        rubrica.stampaRubrica();

        rubrica.trovaNumeroDaNome("Anna");
        rubrica.trovaNomeDaNumero("3201234567");

        rubrica.rimuoviContatto("Marco");
        rubrica.stampaRubrica();

        rubrica.trovaNumeroDaNome("Marco"); 
    }
}
