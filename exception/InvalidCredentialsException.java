// InvalidCredentialsException.java
package exception;

public class InvalidCredentialsException extends RuntimeException {
    private String code;

    public InvalidCredentialsException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
