package fil.ipint.ReservationTicket.Controller;

import fil.ipint.ReservationTicket.Entity.Adresse;
import fil.ipint.ReservationTicket.Service.ServiceImpl.AdresseServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/adresse")
public class AdresseController {


    private final AdresseServiceImpl adresseServiceImpl;

    public AdresseController(AdresseServiceImpl adresseServiceImpl) {
        this.adresseServiceImpl = adresseServiceImpl;
    }


    @GetMapping("/getAdresse")
    public Iterable<Adresse> getall() {
        return adresseServiceImpl.getAllAdresse();
    }

    @DeleteMapping("/deleteartiste/{id}")
    public Iterable<Adresse> deleteadrese(@PathVariable("id") Long id) {
        adresseServiceImpl.deleteAdresse(id);
        return adresseServiceImpl.getAllAdresse();
    }

    @PutMapping("/updateartiste")
    public void updateradresse(@RequestBody Adresse adresse) {
        adresseServiceImpl.updateAdresse(adresse);
    }

    @PostMapping
    public void addrtiste(@RequestBody Adresse adresse) {
        adresseServiceImpl.saveAdresse(adresse);
    }
}