package fil.ipint.ReservationTicket.Service.ServiceInter;



import fil.ipint.ReservationTicket.Entity.Salle;

import java.util.Optional;

public interface SalleService {
    Salle createSalle(Salle salle);
    Optional<Salle> getSalleById(Long id);
    Iterable<Salle> getAllSalle();
    Salle updateSalle(Salle salle);
    void addSalle(Salle salle);
    void deleteSalle(Long id);




}
