package main;

import managers.NewMapsManager;
import module.Utente;

public class Main {
    public static void main(String[]args){
        NewMapsManager manager = new NewMapsManager();
        Utente u1 = new Utente("gianni", "gianni@gmail.com","EDDDD");
        manager.addUtente(u1);
        manager.addUtente(u1);
    }
}
