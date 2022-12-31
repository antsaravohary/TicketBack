package fil.ipint.ReservationTicket.Respository;


import fil.ipint.ReservationTicket.Entity.Salle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalleRepository extends CrudRepository<Salle,Long> {

    
}
