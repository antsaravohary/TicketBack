package fil.ipint.ReservationTicket.Controller;


import fil.ipint.ReservationTicket.Exception.UserAlreadyExist;
import fil.ipint.ReservationTicket.Entity.utilisateur;
import fil.ipint.ReservationTicket.Service.ServiceInter.UtilisateurService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "/*")
@RequestMapping("/utilisateur")
public class UtilisateurController {


    private UtilisateurService utilisateurService;

    public UtilisateurController(@Qualifier("/userService") UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @PostMapping("/adduser")
    public utilisateur addUser(@RequestBody utilisateur user) throws UserAlreadyExist {
        return utilisateurService.addUser(user);
    }

    @DeleteMapping("/deleteuser/{id}")
    public List<utilisateur> deleteuser(@PathVariable(value="id") Long id) {
        utilisateurService.deleteUser(id);
        return (List<utilisateur>) utilisateurService.getAllUser();

    }

    @GetMapping("/getutilisateurBymail/{email}")
    public utilisateur getUserByEmail(@PathVariable(value="email") String email){
        return utilisateurService.getUserByEmail(email);
    }

    @GetMapping("/getAll")
    public List<utilisateur> getAllUser(){
        return utilisateurService.getAllUser();
    }




}
