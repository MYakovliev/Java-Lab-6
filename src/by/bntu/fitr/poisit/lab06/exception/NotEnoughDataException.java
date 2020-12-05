package by.bntu.fitr.poisit.lab06.exception;

public class NotEnoughDataException extends Exception{
    public NotEnoughDataException(){
    }

    public NotEnoughDataException(String message){
        super(message);
    }

    public NotEnoughDataException(Throwable cause){
        super(cause);
    }

    public NotEnoughDataException(String message, Throwable cause){
        super(message, cause);
    }
}
