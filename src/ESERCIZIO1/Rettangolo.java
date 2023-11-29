package ESERCIZIO1;

public class Rettangolo {
    //LISTA ATTRIBUTI
    private int base;
    private int altezza;

    //COSTRUTTORE
    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int perimetro() {
        return (this.altezza + this.base) * 2;
    }

    public int area() {
        return this.base * this.altezza;
    }


}
