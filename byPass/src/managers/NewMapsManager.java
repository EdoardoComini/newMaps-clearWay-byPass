package managers;

import module.Utente;

import java.util.ArrayList;

public class NewMapsManager {
    private ArrayList<Utente> utenti;
    public NewMapsManager(){
        this.utenti = new ArrayList<>();
    }
    public void loginUtente(String user, String pass){
        for(Utente utente : this.utenti){
            if(utente.getNome().equals(user)){
                if(utente.verificaPassword(pass)==true){
                    System.out.println("accesso consentito");
                }
            }
        }
    }
    public void addUtente(Utente utente){
        if(this.utenti.contains(utente)){
            System.out.println("cannot add utente");
        }
        utenti.add(utente);
    }
    public void cutUtente(Utente utente){
        utenti.remove(utente);
    }

}
