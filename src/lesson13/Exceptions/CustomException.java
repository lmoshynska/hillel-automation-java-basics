package lesson13.Exceptions;

public class CustomException extends RuntimeException{

    private int code;

    CustomException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
