package model;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class GestoreLogin {
public static ArrayList<Integer> idUtentiUsati;
public static ArrayList<Integer> idPassaggioGiàUsati;
public ArrayList<Utente> listaUtenti;
public Date dataAttuale;

public GestoreLogin(Date dataAttuale){
    this.dataAttuale=dataAttuale;
    this.listaUtenti=new ArrayList<>();
}
public static int generaIdUtente(){
    Random rand =new Random();
    int nuovoId=0;
    do{nuovoId=rand.nextInt(10000);
}while(idUtentiUsati.contains(nuovoId));
    idUtentiUsati.add(nuovoId);
    return nuovoId;
}

public static int generaIdPassaggio(){
    Random rand=new Random();
    int nuovoId=0;
    do{
        nuovoId=rand.nextInt(10000);
    }while(idPassaggioGiàUsati.contains(nuovoId));
    idPassaggioGiàUsati.add(nuovoId);
    return nuovoId;
}
public void login(String email, String Password){}

}

