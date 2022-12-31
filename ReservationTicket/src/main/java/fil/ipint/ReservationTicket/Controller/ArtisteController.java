package fil.ipint.ReservationTicket.Controller;
import fil.ipint.ReservationTicket.Service.ServiceInter.ArtisteService;
import fil.ipint.ReservationTicket.Entity.Artiste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "/*")
@RequestMapping("artistes")
public class ArtisteController {

    private final ArtisteService artisteService;

    public ArtisteController(@Qualifier("/artisteService") ArtisteService artisteService) {
        this.artisteService = artisteService;
    }


    @PostMapping("/createArtiste")
    public Artiste creatertiste(@RequestBody Artiste artiste){
        return artisteService.createArtiste(artiste);
    }

    @GetMapping("/getSalle")
    public Iterable<Artiste> getall(){return artisteService.getAllArtiste();}

    @DeleteMapping("/deleteartiste/{id}")
    public Iterable<Artiste> deletetriste(@PathVariable("id") Long id){
        artisteService.deleteArtiste(id);
        return artisteService.getAllArtiste();
    }

    @PutMapping("/updateartiste")
    public void updatertiste(@RequestBody  Artiste artiste){
    artisteService.updateArtiste(artiste);
    }

    @PostMapping
    public void addrtiste(@RequestBody Artiste artiste){
        artisteService.addArtiste(artiste);
    }


    
}
