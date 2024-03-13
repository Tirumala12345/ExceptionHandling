// BookTickets.java
package exception;

public class BookTickets extends LoginProcess {
    public int noOfSeats;
    public int totalNoOfSeats = 10;

    public BookTickets(String validUserName, String validPassword, int noOfSeats) {
        super(validUserName, validPassword);
        this.noOfSeats = noOfSeats;
    }

    public void bookingTicket() throws RuntimeException  {

        if (noOfSeats <= totalNoOfSeats) {
            int availableSeats = totalNoOfSeats - noOfSeats;
            System.out.println("Booked seats: " + noOfSeats);
            System.out.println("Remaining Seats: " + availableSeats);
        } else {
            System.out.println("Requested seats: " + noOfSeats);
            System.out.println("Available seats: " + totalNoOfSeats);
            throw new InValidInputException(ErrorCodes.Invalid_Input.getCode(), ErrorCodes.Invalid_Input.getMessage());
        }
    }
}
