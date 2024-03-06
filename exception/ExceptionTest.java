package exception;

public class ExceptionTest {
    public static void main(String[] args) {
        BookTickets bookTickets=new BookTickets(4,1000);
        bookTickets.bookingTicket("1234 1234","1234");

    }
}
