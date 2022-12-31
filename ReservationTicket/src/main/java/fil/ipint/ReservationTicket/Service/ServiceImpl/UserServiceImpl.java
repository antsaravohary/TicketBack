package fil.ipint.ReservationTicket.Service.ServiceImpl;


import fil.ipint.ReservationTicket.Service.ServiceInter.UtilisateurService;
import fil.ipint.ReservationTicket.Entity.utilisateur;
import fil.ipint.ReservationTicket.Exception.UserAlreadyExist;
import fil.ipint.ReservationTicket.Respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5173")
@RestController
@Service("/userService")
public class UserServiceImpl implements UtilisateurService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public utilisateur addUser(utilisateur user) throws UserAlreadyExist {
        utilisateur us = userRepository.findByEmail(user.getEmail());
        if(us !=null){
            throw new UserAlreadyExist();
        }

        return userRepository.save(user);

    }


    @Override
    public void deleteUser(Long id ) {
        userRepository.deleteById(id);

    }

    @Override
    public utilisateur getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<utilisateur> getAllUser(){
        return (List<utilisateur>) userRepository.findAll();
    }

    @Override
    public utilisateur login(utilisateur user) throws UserAlreadyExist {
        utilisateur us = userRepository.findByEmail(user.getEmail());
        System.out.println(us);
        if ( us != null){
            return us;
        }
        return null;

    }
}
