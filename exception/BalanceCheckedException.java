// BalanceCheckedException.java
package exception;

public class BalanceCheckedException extends Exception {
    private String code;

    public BalanceCheckedException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
