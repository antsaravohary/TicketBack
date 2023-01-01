package fil.ipint.ReservationTicket.Controller;



import fil.ipint.ReservationTicket.Entity.Concert;
import fil.ipint.ReservationTicket.Service.ServiceInter.ConcertService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/concerts")
public class ConcertController {

    @Resource
    private ConcertService concertService;


    @PostMapping("createConcert")
    public Concert createconcert(@RequestBody Concert concert ){
        return concertService.createConcert(concert);

    }

    @GetMapping("/getConcert")
    public Optional<Concert> getconcertById(@PathVariable(value="id") Long id) {
        return concertService.getConcertById(id);

    }

    @GetMapping("/getAll")
    public Iterable<Concert> getallConcert(){
        return concertService.getAllConcert();
    }

    @DeleteMapping("/deleteConcert/{id}")
    public Iterable<Concert> deleteconcert(@PathVariable(value="id") Long id) {
         concertService.deleteConcert(id);
         return concertService.getAllConcert();

    }

    @PutMapping("/updateConcert/{id}")
    public void updateconcert(@PathVariable(value="id" )Long id,@RequestBody Concert concert){
        concert.setId(id);
        concertService.updateConcert(concert);

    }







}
