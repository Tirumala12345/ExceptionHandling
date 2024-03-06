package exception;

public class BookTickets {
    public String validUsername="1234 1234";
    public String validPassword="1234" ;
    public String userName="1234 1234";
    public String password="1234";
    public int noOfSeats;
    public int remainingSeats;
     public int availableSeats=5;
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

    public int getRemainingSeats() {
        return remainingSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void setRemainingSeats(int remainingSeats) {
        this.remainingSeats = remainingSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int  bookingTicket(String userName,String password) {
         try {
             if (userName.equals(validUsername) && password.equals(validPassword)) {
                 System.out.println("Login Successful");
                 try {
                     if (noOfSeats <= availableSeats) {
                         remainingSeats = availableSeats - noOfSeats;
                         System.out.println("Booked seats: " + noOfSeats);

                         //public boolean phonePayService( ){
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
                                 //return false;
                             }
                        // }
                         //System.out.println("Available Seats: " + remainingSeats);
                     } else {
                         System.out.println("Requested seats: " + noOfSeats);
                         System.out.println("Available seats: " + availableSeats);
                         //throw new InValidInputException(ErrorCodes.Invalid_Input.getCode(),
                         //ErrorCodes.Invalid_Input.getMessage());
                         System.out.println(ErrorCodes.Invalid_Input.getMessage());
                     }
                 } catch (InValidInputException ie) {
                     //throw new InValidInputException(ErrorCodes.Invalid_Input.getCode(),
                     //      ErrorCodes.Invalid_Input.getMessage());
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
         //int seat=noOfSeats-availableSeats;
        return remainingSeats ;
    }
}