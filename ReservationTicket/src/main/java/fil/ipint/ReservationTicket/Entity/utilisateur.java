package fil.ipint.ReservationTicket.Entity;




import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;



@Entity
public class utilisateur {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idUser;

    private String name;
    private String prenom;
    private String adresse;
    private String email;
    private String password;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private Collection<Billet> billet;

    private String role = "USER";

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public utilisateur(long id , String name, String prenom, String adresse, String email, String password, Collection<Billet> billets) {
        this.idUser=id;
        this.name = name;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email=email;
        this.password=password;
        this.billet = billets;
    }

    public utilisateur(){
        super();
    }


    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    public Collection<Billet> getBillet() {
        return billet;
    }
    public void setBillet(Collection<Billet> billet) {
        this.billet = billet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    public void addBillet(Billet b){
        this.billet.add(b);
    }
}
