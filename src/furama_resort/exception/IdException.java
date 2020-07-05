package furama_resort.exception;

public class IdException extends Exception{
    public IdException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error: Id of customer wrong: "+super.getMessage();
    }
}
