package ESERCIZIO2;

public class Sim {
    private int numero;
    private float credito;
    private Chiamata[] listaChiamate;
    private int numeroChiamate;

    public Sim(int numero) {
        this.numero = numero;
        this.credito = 0;
        this.listaChiamate = new Chiamata[5];
        this.numeroChiamate = 0;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito += credito;
    }

    public void effettuaChiamate(int durata, int numeroChiamato) {
        Chiamata nuovaChiamata = new Chiamata(durata, numeroChiamato);
        if (this.numeroChiamate < 5) {
            for (int i = this.numeroChiamate - 1; i >= 0; i--) {
                this.listaChiamate[i + 1] = this.listaChiamate[i];
            }
            this.listaChiamate[0] = nuovaChiamata;
            this.numeroChiamate++;
        } else {
            this.listaChiamate[4] = nuovaChiamata;
        }
        System.out.println("Chiamata effettuata!");
    }

    public void stampaDataSim() {
        System.out.println("Numero Sim: " + this.numero);
        System.out.println("Credito: " + this.credito);
        System.out.println("Chiamate effettuate:");
        for (int i = 0; i < this.numeroChiamate; i++) {
            System.out.println("Durata: " + this.listaChiamate[i].durata + " | Numero chiamato: " + this.listaChiamate[i].numeroChiamato);
        }
    }
}
