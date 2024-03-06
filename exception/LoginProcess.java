package exception;
public class LoginProcess {
    private String validUsername = "1234 1234";
    private String validPassword = "123";

    public boolean login(String username, String password) throws RuntimeException {
        try {
            if (username.equals(validUsername) && password.equals(validPassword)) {
                return true;
            } else {
                throw new InvalidCredentialsException(ErrorCodes.Login_Failed.getCode(),
                        ErrorCodes.Login_Failed.getMessage());
            }
        } catch (InvalidCredentialsException ic) {
            System.out.println(ic.getCode() + "  " +ic.getMessage());
            return false;
        }
    }
}
