package main;

import java.util.ArrayList;
import java.util.Date;

public class Utente {
public int id;
public String nome, email, password;
public Date dataReg;
public static ArrayList<Integer> idGi‡Usati;

public Utente(int id, String nome, String email, String password, Date dataReg) {
	if(idGi‡Usati.contains(id)) {
		
	}
	this.nome = nome;
	this.email=email;
	this.password=password;
	this.dataReg=new Date(System.currentTimeMillis());
	
}

}
