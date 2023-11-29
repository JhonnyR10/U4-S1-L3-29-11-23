package ESERCIZIO2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo numero di telefono");
        int numero1 = Integer.parseInt(input.nextLine());
        Sim nuovaSim = new Sim(numero1);
        System.out.println("Ricarica la tua sim");
        float creditoAggiunto = Float.parseFloat(input.nextLine());
        nuovaSim.setCredito(creditoAggiunto);
        System.out.println("Il tuo nuovo credito è: " + nuovaSim.getCredito());
        nuovaSim.effettuaChiamate(5, 333444444);
        nuovaSim.effettuaChiamate(5, 333444444);
        nuovaSim.effettuaChiamate(5, 333444444);
        nuovaSim.effettuaChiamate(5, 333444444);
        nuovaSim.effettuaChiamate(5, 333444444);
        nuovaSim.stampaDataSim();
        nuovaSim.effettuaChiamate(5, 88888888);
        nuovaSim.stampaDataSim();
    }
}
