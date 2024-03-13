// ErrorCodes.java
package exception;

public enum ErrorCodes {
    Login_Failed("Login_Failed_1001", "Invalid Credentials"),
    Invalid_Input("Invalid_Input_1002", "Input is not given Properly"),
    Insufficient_Balance("Insufficient_Balance_1003", "Insufficient Balance");

    private String code;
    private String message;

    ErrorCodes(String errorCode, String message) {
        this.code = errorCode;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
