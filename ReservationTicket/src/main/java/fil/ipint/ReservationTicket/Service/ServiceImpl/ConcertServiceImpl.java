package fil.ipint.ReservationTicket.Service.ServiceImpl;


import fil.ipint.ReservationTicket.Entity.Concert;
import fil.ipint.ReservationTicket.Respository.ConcertRepository;
import fil.ipint.ReservationTicket.Service.ServiceInter.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://127.0.0.1:5173")
@RestController
@Service(value="concertService")
public class ConcertServiceImpl implements ConcertService {

    @Autowired
    //private Concert concert ;
    private ConcertRepository concertRepository;


   @Override
    public Concert createConcert(Concert concert) {
       return concertRepository.save(concert);
    }

    @Override
    public Optional<Concert> getConcertById(Long id) {
        return this.concertRepository.findById( id );
    }

    @Override
    public List<Concert> getAllConcert() {
        return (List<Concert>) concertRepository.findAll();
    }

    @Override
    public void addConcert(Concert concert) {

    }

    @Override
    public void updateConcert(Concert concert) {
          concertRepository.save(concert);
    }

    @Override
    public void deleteConcert(Long id) {
         concertRepository.deleteById(id);

    }
    public ConcertRepository getConcertRepository() {
        return concertRepository;
    }
}
