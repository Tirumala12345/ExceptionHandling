package exception;

public enum ErrorCodes {
    Login_Failed("1001","Invalid Credentials"),
    Invalid_Input("1002","Input is not given Properly"),
    Insufficient_Balance("1003","Insufficient Balance");

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
