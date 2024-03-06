package exception;

public class InValidInputException extends RuntimeException{
    private String code;
    public InValidInputException(String code,String message){
        super(message);
        this.code=code;
    }

    public String getCode() {
        return code;
    }
}
