package fil.ipint.ReservationTicket.Service.ServiceImpl;


import fil.ipint.ReservationTicket.Entity.Salle;
import fil.ipint.ReservationTicket.Respository.SalleRepository;
import fil.ipint.ReservationTicket.Service.ServiceInter.SalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@Service("/salleService")
public class SalleServiceImpl implements SalleService {
    @Autowired
    private SalleRepository salleRepository;

    public SalleServiceImpl( SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }

    @Override
    public Salle createSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public Optional<Salle> getSalleById(Long id) {
        return salleRepository.findById(id);
    }

    @Override
    public Iterable<Salle> getAllSalle() {
        return salleRepository.findAll();
    }

    @Override
    public Salle updateSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public void addSalle(Salle salle) {
        salleRepository.save(salle);

    }

    @Override
    public void deleteSalle(Long id) {
        salleRepository.deleteById(id);

    }

    public SalleRepository getSalleRepository() {
        return salleRepository;
    }
}
