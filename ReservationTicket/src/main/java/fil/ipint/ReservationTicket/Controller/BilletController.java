package fil.ipint.ReservationTicket.Controller;


import fil.ipint.ReservationTicket.Entity.Billet;
import fil.ipint.ReservationTicket.Entity.utilisateur;
import fil.ipint.ReservationTicket.Exception.UserNotFound;
import fil.ipint.ReservationTicket.Service.ServiceInter.BilletService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/billet")
public class BilletController {

     @Resource
     private BilletService billetService;


     /** resrver un billet*/
     @PostMapping("/email/{email}")
     public Billet reserverBilet(@PathVariable(value="email") String email) throws UserNotFound {
          return (Billet) billetService.ReserverBillet(email);

     }
     /**
      * avoir tout les billet
      */

     @GetMapping("/get")
     public Iterable<Billet> getAll(){
          return billetService.getAllBillet();
     }

     /**
      * avoir tout les illet d'un utilisateur
      */

     @DeleteMapping("/delete/{id}")
     public Iterable<Billet> deletebillet(@PathVariable(value="id") Long id){

          billetService.deleteBillet(id);
          return billetService.getAllBillet();
     }
      /** modifier l'utilisateur d'un billet*/

     @PutMapping("/updateBillet")
     public void updatertiste(@RequestBody Billet billet, @RequestBody utilisateur user){
          billetService.updateBillet(billet,user);
     }


     @PostMapping("/addBillet")
     public void AddBillet(@RequestBody Billet billet){
          billetService.saveBillet(billet);
     }





}
