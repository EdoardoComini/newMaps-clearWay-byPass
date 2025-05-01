package exception;

public class NameAlreadyUsedException extends Exception{
    public NameAlreadyUsedException(){
        super("qusto nome è già in uso");
    }
}
