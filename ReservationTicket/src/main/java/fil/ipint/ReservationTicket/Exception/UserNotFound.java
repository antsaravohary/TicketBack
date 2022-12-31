package fil.ipint.ReservationTicket.Exception;

public class UserNotFound  extends Exception{
    public UserNotFound( ){
        super("User details not found");
    }
}
