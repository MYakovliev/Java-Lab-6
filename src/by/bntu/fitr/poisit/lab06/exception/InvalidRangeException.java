package by.bntu.fitr.poisit.lab06.exception;

public class InvalidRangeException extends Exception{
    public InvalidRangeException(){
    }

    public InvalidRangeException(String message){
        super(message);
    }

    public InvalidRangeException(Throwable cause){
        super(cause);
    }

    public InvalidRangeException(String message, Throwable cause){
        super(message, cause);
    }
}
