package n_debug_xu_ly_ngoai_le.excercise;

public class IllegalTriangleSideException extends Exception{
    private String message;

    public IllegalTriangleSideException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
