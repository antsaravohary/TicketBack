package fil.ipint.ReservationTicket.Service.ServiceImpl;


import fil.ipint.ReservationTicket.Respository.ArtisteRepository;
import fil.ipint.ReservationTicket.Entity.Artiste;
import fil.ipint.ReservationTicket.Service.ServiceInter.ArtisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Service(value="/artisteService")
public class ArtisteServiceImpl implements ArtisteService{
    @Autowired
    private ArtisteRepository artisteRepository ;

    public ArtisteServiceImpl(ArtisteRepository artisteRepository) {
        this.artisteRepository = artisteRepository;
    }

    @Override
    public Artiste createArtiste(Artiste artiste) {
        return artisteRepository.save(artiste);
    }

    @Override
    public Iterable<Artiste> getAllArtiste() {
        return  artisteRepository.findAll();
    }

    @Override
    public void addArtiste(Artiste artiste) {
        artisteRepository.save(artiste);


    }

    @Override
    public void updateArtiste(Artiste artiste) {
        artisteRepository.save(artiste);
    }

    @Override
    public void deleteArtiste(Long id) {
        artisteRepository.deleteById(id);

    }
    public ArtisteRepository getArtisteRepository() {
        return artisteRepository;
    }
}
