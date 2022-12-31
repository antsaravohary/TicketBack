package fil.ipint.ReservationTicket.Service.ServiceInter;


import fil.ipint.ReservationTicket.Entity.utilisateur;
import fil.ipint.ReservationTicket.Exception.UserAlreadyExist;

import java.util.List;

public interface UtilisateurService {

    utilisateur addUser(utilisateur user) throws UserAlreadyExist;


    void deleteUser(Long id);

    utilisateur getUserByEmail(String email);
    List<utilisateur> getAllUser();


    utilisateur login(utilisateur user) throws UserAlreadyExist;
}
