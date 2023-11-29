package ESERCIZIO3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Utente utente = new Utente(1, "Giovanni", "Longo", "Giovanni@email.com", LocalDate.now());
        Utente utente2 = new Utente(2, "Marco", "Polo", "Marco@email.com", LocalDate.now());
        Utente utente3 = new Utente(3, "Giulio", "Cesare", "Giulio@email.com", LocalDate.now());

        Articolo articolo1 = new Articolo(92199, "Prodotto 1", 20, 10);
        Articolo articolo2 = new Articolo(23222, "Prodotto 2", 30, 5);


        Carrello carrelloUtente = new Carrello(utente.getCodiceCliente());
        Carrello carrelloUtente2 = new Carrello(utente2.getCodiceCliente());
        Carrello carrelloUtente3 = new Carrello(utente3.getCodiceCliente());

        utente.aggiungiArticoloAlCarrello(articolo1, carrelloUtente);
        utente.aggiungiArticoloAlCarrello(articolo2, carrelloUtente);
        utente2.aggiungiArticoloAlCarrello(articolo2, carrelloUtente2);
        utente3.aggiungiArticoloAlCarrello(articolo1, carrelloUtente3);

        carrelloUtente.visualizzaCarrello();
        carrelloUtente2.visualizzaCarrello();
        carrelloUtente3.visualizzaCarrello();
    }
}
