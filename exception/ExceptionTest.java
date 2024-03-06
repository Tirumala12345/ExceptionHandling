package exception;

public class ExceptionTest {
    public static void main(String[] args) {
//        LoginProcess loginProcess=new LoginProcess();
//        loginProcess.login("1234 1234","1234");
        BookTickets bookTickets=new BookTickets(2);
        System.out.println("Remaining Seats: " +bookTickets.bookingTicket("1234 1234","1234"));
        TicketPayment pay=new TicketPayment(2,500);
        pay.payment();
        pay.phonePayService();
    }
}
