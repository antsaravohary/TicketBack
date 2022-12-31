package fil.ipint.ReservationTicket.Controller;


import fil.ipint.ReservationTicket.Service.ServiceInter.SalleService;
import fil.ipint.ReservationTicket.Entity.Salle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "/*")
@RequestMapping("/salles")
public class SalleController {


    private SalleService salleService;

    public SalleController(@Qualifier("/salleService") SalleService salleService) {
        this.salleService = salleService;
    }

    @PostMapping("createsalle")
    public Salle createSalle(@RequestBody Salle salle){
        return salleService.createSalle(salle);
    }
    @GetMapping("/getsalle/{id}")
    public Optional<Salle> getSalleById(@PathVariable(value="id") Long id) {
        return salleService.getSalleById(id);

    }

    @GetMapping("/getsalle/")
    public List<Salle> getAllSalle(){
        return (List<Salle>) salleService.getAllSalle();
    }

    @DeleteMapping("/deletesalle/{id}")
    public Iterable<Salle> deleteSalle(@PathVariable(value="id") Long id) {
        salleService.deleteSalle(id);
        return  salleService.getAllSalle();

    }

    @PutMapping("/updateSalle/{id}")
    public void updateSalle(@PathVariable(value="id" )Long id,@RequestBody Salle salle){
        salle.setId(id);
         salleService.updateSalle(salle);

    }




}
