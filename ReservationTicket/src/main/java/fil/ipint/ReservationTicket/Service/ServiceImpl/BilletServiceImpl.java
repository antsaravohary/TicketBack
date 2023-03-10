package fil.ipint.ReservationTicket.Service.ServiceImpl;


import java.util.Optional;

import fil.ipint.ReservationTicket.Entity.Billet;
import fil.ipint.ReservationTicket.Entity.Concert;
import fil.ipint.ReservationTicket.Entity.utilisateur;
import fil.ipint.ReservationTicket.Exception.UserNotFound;
import fil.ipint.ReservationTicket.Respository.BilletRepository;
import fil.ipint.ReservationTicket.Respository.ConcertRepository;
import fil.ipint.ReservationTicket.Respository.UserRepository;
import fil.ipint.ReservationTicket.Service.ServiceInter.BilletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1:5173")
@RestController
@Service("BilletService")
public class BilletServiceImpl implements BilletService {

    @Autowired
    private BilletRepository billetRepository;
    @Autowired
    private UserRepository userRepository;
    private final ConcertRepository concertRepository;

    public BilletServiceImpl(BilletRepository billetRepository,
                             ConcertRepository concertRepository) {
        this.billetRepository = billetRepository;
        this.concertRepository = concertRepository;
    }

    @Override
    public Billet ReserverBillet(String email) throws UserNotFound {
        utilisateur user = userRepository.findByEmail(email);
        if(user == null){
            throw new UserNotFound();
        }

        Billet billet = new  Billet();
        Concert concert =new Concert();
        billet.setConcert(concert);
        billet.setUser(user);
        return billetRepository.save(billet);

    }

    @Override
    public void deleteBillet(Long id) {
        billetRepository.deleteById(id);

    }

    @Override
    public Iterable<Billet> getAllBillet() {
        return billetRepository.findAll();
    }


    @Override
    public Optional<Billet> getAllBilletOfUser(String email) throws UserNotFound {
        utilisateur user = userRepository.findByEmail(email);
        if (user== null){
            throw new UserNotFound();

        }
        return billetRepository.findById(user.getIdUser());
    }



    @Override
    public void updateBillet(Billet billet, utilisateur user) {

        billet.setUser(user);
        billetRepository.save(billet);

    }

    @Override
     public void saveBillet(Billet billet){
        utilisateur user = userRepository.findByEmail(billet.getUser().getEmail());
        Concert concert = concertRepository.findConcertByTitre(billet.getConcert().getTitre());
        billet.setUser(user);
        billet.setConcert(concert);

        billetRepository.save(billet);
    }





}
