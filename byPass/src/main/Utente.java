package main;

import java.util.ArrayList;
import java.util.Date;

public class Utente {
public int id;
public String nome, email, password;
public Date dataReg;

public Utente(int id, String nome, String email, String password, Date dataReg) {
	this.id=GestoreLogin.generaId();
    this.nome = nome;
	this.email=email;
	this.password=password;
	this.dataReg=new Date(System.currentTimeMillis());
}
@Override
public String toString(){
	return" Utente "+id+"[nome: "+nome+" email"+email+"]";
}
}
