package exception;

public class ExceptionTest {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService("1234","1234",10,3000);
        try{
            paymentService.login("1234","1234");
            paymentService.bookingTicket();
            paymentService.payment();
        } catch (InvalidCredentialsException ic) {
            System.out.println("Error Code " +ic.getCode()+"   "+"Error Message " +ic.getMessage());
        } catch (InValidInputException ie){
            System.out.println("Error Code " +ie.getCode()+"   "+"Error Message " +ie.getMessage());
        }
        catch (InsufficientBalanceException ib) {
            System.out.println("Error Code" +ib.getCode()+"   "+"Error Message " +ib.getMessage());
        }
    }
}
