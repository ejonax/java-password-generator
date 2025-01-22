
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {
       
        try (Scanner input =new Scanner(System.in)){
        
        System.out.println("Inserisci il tuo nome!");
        String nomeUtente = input.next();
        System.out.println("Il nome inserito è " + nomeUtente);

        System.out.println("Inserisci il tuo cognome!");
        String cognomeUtente = input.next();
        System.out.println( "Il cognome inserito è " + cognomeUtente);

        System.out.println("Inserisci il tuo colore preferito!");
        String colUtente = input.next();
        System.out.println ("Il colore preferito è " + colUtente);

        System.out.println("Inserisci il tuo giorno della tua nascita!");
        int giornoUtente = input.nextInt();
        System.out.println ("Il giorno della tua nascita è " + giornoUtente);

        System.out.println("Inserisci il mese della tua nascita!");
        int meseUtente = input.nextInt();
        System.out.println ("Il mese della tua nascita è " + meseUtente);

        System.out.println("Inserisci l'anno della tua nascita!");
        int annoUtente = input.nextInt();
        System.out.println ("L'anno della tua nascita è " + annoUtente);
       
        int sum = giornoUtente + meseUtente + annoUtente;
        System.out.println("La somma del tuo compleanno è " + sum);

        System.out.println("Il tuo password è " + nomeUtente + "-" + cognomeUtente + "-" + colUtente + "-" + sum);
    
        }
    }
}
