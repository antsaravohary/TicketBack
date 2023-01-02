package fil.ipint.ReservationTicket.Service.ServiceInter;


import fil.ipint.ReservationTicket.Entity.Concert;

import java.util.List;
import java.util.Optional;

public interface ConcertService {

    Concert createConcert(Concert concert);
    Optional<Concert> getConcertById(Long id);
    List<Concert> getAllConcert();
    void updateConcert(Concert concert);

    void deleteConcert(Long id);
}
