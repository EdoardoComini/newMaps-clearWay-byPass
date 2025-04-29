package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class GestoreLogin {
public static ArrayList<Integer> idUsati;
    public ArrayList<Utente> listaUtenti;
public Date dataAttuale;

public GestoreLogin(Date dataAttuale){
    this.dataAttuale=dataAttuale;
    this.listaUtenti=new ArrayList<>();
}
public static int generaId(){
    Random rand =new Random();
    int nuovoId=0;
    do{nuovoId=rand.nextInt(10000);
}while(idUsati.contains(nuovoId));
    idUsati.add(nuovoId);
    return nuovoId;


} 
}
