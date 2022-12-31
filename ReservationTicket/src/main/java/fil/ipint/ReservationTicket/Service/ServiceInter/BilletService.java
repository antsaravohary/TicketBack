package fil.ipint.ReservationTicket.Service.ServiceInter;


import fil.ipint.ReservationTicket.Entity.Billet;
import fil.ipint.ReservationTicket.Entity.utilisateur;
import fil.ipint.ReservationTicket.Exception.UserNotFound;

import java.util.Optional;

public  interface BilletService {

    Object ReserverBillet(String email) throws UserNotFound;

    void deleteBillet(Long id );
    Iterable<Billet> getAllBillet();
    //void CancelBookBillet(Long id, String email) throws UserNotFound;

    Optional<Billet> getAllBilletOfUser(String email) throws UserNotFound;

    void saveBillet (Billet billet);
    void updateBillet(Billet billet, utilisateur user);
}
