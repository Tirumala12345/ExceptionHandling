package exception;

public class InsufficientBalanceException extends RuntimeException {
    private String code;
    public InsufficientBalanceException(String code,String message) {
        super(message);
        this.code=code;
    }

    public String getCode() {
        return code;
    }
}
