package fil.ipint.ReservationTicket.Exception;

public class TicketNotFound extends Exception{
    public TicketNotFound(Long id){
        super("No ticket found with id" +id);
    }
}
