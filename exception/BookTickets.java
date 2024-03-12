// BookTickets.java
package exception;

public class BookTickets {
    private static final String VALID_USERNAME = "1234 1234";
    private static final String VALID_PASSWORD = "1234";
    private static final int TICKET_PRICE = 200;
    private static int totalNoOfSeats = 100;

    private int noOfSeats;
    private int balance;
    private int totalTicketPrice;

    public BookTickets(int noOfSeats, int balance) {
        this.noOfSeats = noOfSeats;
        this.balance = balance;
    }

    public void bookingTicket(String userName, String password)  {
        if (userName.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            System.out.println("Login Successful");
            try {
                if (noOfSeats <= totalNoOfSeats) {
                    int availableSeats = totalNoOfSeats - noOfSeats;
                    System.out.println("Booked seats: " + noOfSeats);
                    totalTicketPrice = noOfSeats * TICKET_PRICE;
                    System.out.println("Total Ticket Price Is : " + totalTicketPrice);

                    if (totalTicketPrice <= balance) {
                        System.out.println("Payment Is Successful");
                        int remainingBalance = balance - totalTicketPrice;
                        System.out.println("Remaining Balance after Payment: " + remainingBalance);
                    } else {
                        throw new InsufficientBalanceException("1003", "Insufficient Balance");
                    }

                    totalNoOfSeats = availableSeats;
                    System.out.println("Remaining Seats: " + availableSeats);
                } else {
                    System.out.println("Requested seats: " + noOfSeats);
                    System.out.println("Available seats: " + totalNoOfSeats);
                    System.out.println(ErrorCodes.Invalid_Input.getMessage());
                }
            } catch (InValidInputException ie) {
                System.out.println(ie.getMessage());
            }
        } else {
            throw new InvalidCredentialsException(ErrorCodes.Login_Failed.getCode(),
                    ErrorCodes.Login_Failed.getMessage());
        }
    }
}
