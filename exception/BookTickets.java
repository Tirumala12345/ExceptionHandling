package exception;

public class BookTickets {
    public String validUsername="1234 1234";
    public String validPassword="1234" ;
    public int noOfSeats;
    public int availableSeats;
     public static int totalNoOfSeats =100   ;
    private int ticketPrice=200;
    private int totalTicketPrice;
    private int balance;
    private int remainingBalance;

    public BookTickets(int noOfSeats,int balance) {
        this.noOfSeats = noOfSeats;
        this.balance=balance;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void setTotalNoOfSeats(int totalNoOfSeats) {
        this.totalNoOfSeats = totalNoOfSeats;
    }

    public final void bookingTicket(String userName,String password){
         try {
             if (userName.equals(validUsername) && password.equals(validPassword)) {
                 System.out.println("Login Successful");
                 try {
                     if (noOfSeats <= totalNoOfSeats) {
                         availableSeats = totalNoOfSeats - noOfSeats;
                         this.totalNoOfSeats=availableSeats;
                         System.out.println("Booked seats: " + noOfSeats);
                             totalTicketPrice=noOfSeats*200;
                             System.out.println("Total Ticket Price Is : " +totalTicketPrice );

                             try {
                                 if (totalTicketPrice < balance) {
                                     System.out.println("Payment Is Successful");
                                     remainingBalance=balance-totalTicketPrice;
                                     System.out.println("Remaining Balance after Payment :" +remainingBalance);
                                 } else {
                                     System.out.println(ErrorCodes.Insufficient_Balance.getMessage());
                                 }
                             } catch (InsufficientBalanceException e) {
                                 System.out.println(e.getCode() + "  " + e.getMessage());
                             }
                         System.out.println("Remaining Seats: "+ availableSeats);

                     } else {
                         System.out.println("Requested seats: " + noOfSeats);
                         System.out.println("Available seats: " + totalNoOfSeats);
                         System.out.println(ErrorCodes.Invalid_Input.getMessage());
                         availableSeats = totalNoOfSeats;
                         System.out.println(availableSeats);
                     }
                 } catch (InValidInputException ie) {

                     System.out.println(ie.getMessage());
                 }
             }
             else {
                 throw new InvalidCredentialsException(ErrorCodes.Login_Failed.getCode(),
                         ErrorCodes.Login_Failed.getMessage());
             }
         }catch (InvalidCredentialsException ic){
             System.out.println(ic.getCode() +"  "+ic.getMessage());
         }
    }
}