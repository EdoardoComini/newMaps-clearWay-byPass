package model;

import java.util.Date;


public class Utente {
public int id;
public String nome, email, passwordHash;
public Date dataReg;

public Utente( String nome, String email, String password) {
	this.id= GestoreLogin.generaIdUtente();
    this.nome = nome;
	this.email=email;
	this.passwordHash= PasswordUtils.hashPassword(password);
	this.dataReg=new Date(System.currentTimeMillis());
}
@Override
public String toString(){
	return" Utente "+id+"[nome: "+nome+" email"+email+"]";
}
public void Segnala( String message){
	Segnalazione segnalazione = new Segnalazione(message, id);
}

public String getEmail(){
	return email;
}
public String getNome(){return nome;}

public boolean verificaPassword(String passwordInserita){
	boolean verifica=false;
	int tentativi=0;
	String hashpassword=PasswordUtils.hashPassword(passwordInserita);
	while(verifica != true&&tentativi<=3){
	if(passwordInserita==null&& passwordInserita.isBlank()){
		tentativi++;
		System.out.println("hai ancora "+tentativi+" tentativi");
		return false;
	}
	if(hashpassword.equals(this.passwordHash)){
		verifica=true;
		return true;
	}else{
		tentativi++;
		System.out.println("hai ancora "+tentativi+" tentativi");
		break;
	}
	}
    return false;
}
}

