package ESERCIZIO1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la base del primo rettangolo");
        int base1 = Integer.parseInt(input.nextLine());
        System.out.println("Inserisci l'altezza del primo rettangolo");
        int altezza1 = Integer.parseInt(input.nextLine());

        Rettangolo primoRettangolo = new Rettangolo(base1, altezza1);
        System.out.println("Inserisci la base del secondo rettangolo");
        int base2 = Integer.parseInt(input.nextLine());
        System.out.println("Inserisci l'altezza del secondo rettangolo");
        int altezza2 = Integer.parseInt(input.nextLine());

        Rettangolo secondoRettangolo = new Rettangolo(base2, altezza2);


        stampaRettangolo(primoRettangolo);

        stampaRettangolo(secondoRettangolo);

        stampaDueRettangoli(primoRettangolo, secondoRettangolo);


    }

    public static void stampaRettangolo(Rettangolo rett) {
        System.out.println("Il perimetro del rettangolo è: " + rett.perimetro() + " L'area del rettangolo è: " + rett.area());
    }

    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
        System.out.println("Il perimetro del rettangolo è: " + rett1.perimetro() + " L'area del rettangolo è: " + rett1.area());
        System.out.println("Il perimetro del rettangolo è: " + rett2.perimetro() + " L'area del rettangolo è: " + rett2.area());
        System.out.println("La somma dei perimetri dei due rettangoli è: " + (rett1.perimetro() + rett2.perimetro()));
        System.out.println("La somma delle aree dei due rettangoli è: " + (rett1.area() + rett2.area()));
    }
}
