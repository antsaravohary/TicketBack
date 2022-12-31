package fil.ipint.ReservationTicket.Respository;

import fil.ipint.ReservationTicket.Entity.Concert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ConcertRepository extends CrudRepository<Concert,Long> {


	
}
