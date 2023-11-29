package ESERCIZIO3;

import java.time.LocalDate;

public class Utente {
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataIscrizione;

    public Utente(int codiceCliente, String nome, String cognome, String email, LocalDate dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;

    }

    public void aggiungiArticoloAlCarrello(Articolo articolo, Carrello carrello) {
        carrello.aggiungiArticolo(articolo);
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }
}
