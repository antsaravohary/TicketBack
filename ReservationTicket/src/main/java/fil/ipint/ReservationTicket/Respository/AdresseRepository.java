package fil.ipint.ReservationTicket.Respository;


import fil.ipint.ReservationTicket.Entity.Adresse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdresseRepository extends CrudRepository<Adresse,Long> {
}
