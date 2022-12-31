package fil.ipint.ReservationTicket.Service.ServiceImpl;

import fil.ipint.ReservationTicket.Entity.Adresse;
import fil.ipint.ReservationTicket.Respository.AdresseRepository;
import fil.ipint.ReservationTicket.Service.ServiceInter.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service(value="adresseService")
public class AdresseServiceImpl implements AdresseService {

    @Autowired
    private AdresseRepository adresseRepository;

    @Override
    public void saveAdresse(Adresse adresse){
        adresseRepository.save(adresse);
    }

    @Override
    public Iterable<Adresse> getAllAdresse() {
        return adresseRepository.findAll();
    }



    @Override
    public void updateAdresse(Adresse adresse) {
        adresseRepository.save(adresse);

    }

    @Override
    public void deleteAdresse(Long id) {
        adresseRepository.deleteById(id);

    }
}
