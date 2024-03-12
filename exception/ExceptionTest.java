package exception;

public class ExceptionTest {
    public static void main(String[] args) {
        BookTickets bookTickets=new BookTickets(4,1000);
        bookTickets.bookingTicket("1234 1234","1234");

        BookTickets bookTickets1=new BookTickets(90,10000);
        bookTickets1.bookingTicket("1234 1234","1234");

        BookTickets bookTickets2=new BookTickets(6,2000);
        bookTickets2.bookingTicket("1234 1234","1234");
    }
}
