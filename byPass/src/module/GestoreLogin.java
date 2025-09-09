package module;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class GestoreLogin {
    public static ArrayList<Integer> idUtentiUsati;
    public static ArrayList<Integer> idPassaggioUsati;
    public ArrayList<Utente> listaUtenti;
    public Date dataAttuale;

    public GestoreLogin(Date dataAttuale) {
        this.dataAttuale = dataAttuale;
        this.listaUtenti = new ArrayList<>();
    }

    public static int generaIdUtente() {
        Random rand = new Random();
        int nuovoId;
        do {
            nuovoId = rand.nextInt(10000);
        } while (idUtentiUsati.contains(nuovoId));
        idUtentiUsati.add(nuovoId);
        return nuovoId;
    }

    public static int generaIdPassaggio() {
        Random rand = new Random();
        int nuovoId;
        do {
            nuovoId = rand.nextInt(10000);
        } while (idPassaggioUsati.contains(nuovoId));
        idPassaggioUsati.add(nuovoId);
        return nuovoId;
    }

    public void login(String email, String Password) {
    }


    public boolean registrazione(String nome, String email, String password) {
        for (Utente u : listaUtenti) {
            if (nome.equalsIgnoreCase(u.getNome())) {
                System.out.println("Questo nome utente è già in uso");
                return false;
            }
            if (email.equalsIgnoreCase(u.getEmail())) {
                System.out.println("Questa email è già in uso in un'altro account");
                return false;
            }
        }
        listaUtenti.add(new Utente(nome, email, password));
        System.out.println("registrazione avvenuta con successo");
        return true;
    }
}




