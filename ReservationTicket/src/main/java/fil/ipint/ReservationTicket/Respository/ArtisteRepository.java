package fil.ipint.ReservationTicket.Respository;


import fil.ipint.ReservationTicket.Entity.Artiste;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ArtisteRepository extends CrudRepository<Artiste,Long> {
    
}
