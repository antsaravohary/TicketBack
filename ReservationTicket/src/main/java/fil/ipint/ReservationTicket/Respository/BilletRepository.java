package fil.ipint.ReservationTicket.Respository;


import fil.ipint.ReservationTicket.Entity.Billet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface BilletRepository  extends CrudRepository<Billet,Long> {


}
