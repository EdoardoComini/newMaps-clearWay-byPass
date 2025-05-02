package exception;

public class NameAlreadyUsedException extends Exception{
    public NameAlreadyUsedException(){
        super("questo nome è già in uso");
    }
}