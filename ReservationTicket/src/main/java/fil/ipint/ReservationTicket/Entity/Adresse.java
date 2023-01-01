package fil.ipint.ReservationTicket.Entity;

import javax.persistence.*;
import java.util.Collection;


@Entity

public class Adresse {
	/*une adrees à une ville une rue  */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Long id;
	private String ville;
	private String rue;
	@OneToMany(mappedBy="adresse")
	private Collection<Concert> concertCollection ;



	
	public Adresse(Long id,String ville,String rue) {
		this.id=id;
		this.ville= ville;
		this.rue=rue;
	}

	public Adresse() {

	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}
	
	public String getRue() {
		return rue;
	}

}
