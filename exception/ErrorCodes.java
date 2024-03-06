package exception;

public enum ErrorCodes {
    Login_Failed("Login Failed","Invalid Credentials"),
    Invalid_Input("Input Invalid","Input is not given Properly"),
    Insufficient_Balance("Payment Failed","Insufficient Balance");

    String code;
    String message;
    ErrorCodes(String errorCode,String message){
        this.code=errorCode;
        this.message=message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
