package fil.ipint.ReservationTicket.Respository;

import fil.ipint.ReservationTicket.Entity.Concert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface ConcertRepository extends CrudRepository<Concert,Long> {


	Concert findConcertByTitre(String titre);
}
