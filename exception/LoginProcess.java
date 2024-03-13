package exception;

public class LoginProcess {
    private String validUserName="1234";
    private String validPassword="1234";

    public LoginProcess(String validUserName, String validPassword) {
        this.validUserName = validUserName;
        this.validPassword = validPassword;
    }

    public boolean login(String userName,String password) throws InvalidCredentialsException {
        if(userName.equals(validUserName) && password.equals(validPassword)){
            System.out.println("Login is Successful");
        }else{
            throw new InvalidCredentialsException(ErrorCodes.Login_Failed.getCode(), ErrorCodes.Login_Failed.getMessage());
        }
        return false;
    }
}
