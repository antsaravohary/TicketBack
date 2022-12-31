package fil.ipint.ReservationTicket.Respository;


import fil.ipint.ReservationTicket.Entity.utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<utilisateur,Long> {
    utilisateur findByEmail(String email);
}
