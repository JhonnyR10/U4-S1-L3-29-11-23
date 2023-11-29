package ESERCIZIO3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    public int cliente;
    public double totale;
    private List<Articolo> elencoArticoli;

    public Carrello(int cliente) {
        this.cliente = cliente;
        this.elencoArticoli = new ArrayList<>();
        this.totale = 0.0;
    }

    public void aggiungiArticolo(Articolo articolo) {
        elencoArticoli.add(articolo);
        totale += articolo.getPrezzo();
    }


    public void visualizzaCarrello() {
        System.out.println("Carrello dell'utente " + cliente);
        for (Articolo articolo : elencoArticoli) {
            System.out.println("Codice: " + articolo.getCodiceArticolo() + ", Descrizione: " + articolo.getDescrizioneArticolo() + ", Prezzo: " + articolo.getPrezzo());
        }
        System.out.println("Totale: " + totale);
    }
}
