package exception;

public class BookTickets {
    public String validUsername="1234 1234";
    public String validPassword="123" ;
    public String userName="1234 1234";
    public String password="1234";
    public int noOfSeats;
    public int remainingSeats;
     public int availableSeats=5;

    public BookTickets(int noOfSeats) {
        this.noOfSeats = noOfSeats;
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
             if (userName.equals(validUsername) && password.equals(validPassword))  {
                 System.out.println("Login Successful");

                 if (noOfSeats <= availableSeats) {
                     remainingSeats = availableSeats - noOfSeats;
                     System.out.println("Booked seats: " + noOfSeats);
                     System.out.println("Available Seats: " + remainingSeats);
                 } else {
                     System.out.println("Requested seats: " + noOfSeats);
                     System.out.println("Available seats: " + availableSeats);
                     throw new InValidInputException(ErrorCodes.Invalid_Input.getCode(),
                             ErrorCodes.Invalid_Input.getMessage());
                 }
             } else {
                 throw new InvalidCredentialsException(ErrorCodes.Login_Failed.getCode(),
                         ErrorCodes.Login_Failed.getMessage());
             }
         }catch (InvalidCredentialsException ic){
             System.out.println(ic.getCode() +"  "+ic.getMessage());
         }
        return remainingSeats;
    }

}
