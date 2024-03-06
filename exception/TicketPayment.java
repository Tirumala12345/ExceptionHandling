package exception;

public class TicketPayment extends BookTickets{
    private int ticketPrice=200;
    private int totalTicketPrice;
    private int balance;
    private int remainingBalance;

    public TicketPayment(int noOfSeats,int balance) {
        super(noOfSeats);
        this.balance=balance;
    }

    public int payment(){
        totalTicketPrice=noOfSeats*200;
        System.out.println("Total Ticket Price Is : " +totalTicketPrice );
        return totalTicketPrice;
    }

    public boolean phonePayService() throws RuntimeException{

        try {
            if (totalTicketPrice < balance) {
                System.out.println("Payment Is Successful");
                return true;
            } else {
                throw new InsufficientBalanceException(ErrorCodes.Insufficient_Balance.getCode(),
                        ErrorCodes.Insufficient_Balance.getMessage());
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getCode()+"  " + e.getMessage());
            return false;
        }
    }
    }
//        if(totalTicketPrice<balance){
//            System.out.println("Payment Is Successful");
//            remainingBalance=balance-totalTicketPrice;
//            System.out.println("Remaining Balance after Payment :" +remainingBalance);
//            return true;
//        }else{
//            throw new InsufficientBalanceException(ErrorCodes.Insufficient_Balance.getCode(),
//                    ErrorCodes.Insufficient_Balance.getMessage());
//        }
//    }

