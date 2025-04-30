package model;

import java.util.Date;

public class Segnalazione {
    public int idUtente;
    public int idPassaggio;
    public String message;
    public Date dataSegnalazione;

    public Segnalazione(String messaggio, int idU){
        this.message=messaggio;
        this.idUtente=idU;
        this.dataSegnalazione=new Date();
        this.idPassaggio=GestoreLogin.generaIdPassaggio();

    }
}
