package fil.ipint.ReservationTicket.Entity;



import net.bytebuddy.build.ToStringPlugin;

import java.util.Date;
import javax.persistence.*;


@Entity
public class Billet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(cascade = CascadeType.ALL)
	private utilisateur user;
	private Date dateAchat;
	@OneToOne(cascade = CascadeType.ALL)
	private Salle salle;
	@ManyToOne(cascade = CascadeType.ALL)
	private Concert concert ;




	public Billet(Long id, Date dateAchat, Salle salle, Concert concert) {
		this.id = id;
		this.dateAchat = dateAchat;
		this.salle = salle;
		this.concert = concert;
		
	}

	public Billet(){
		super();
	}


	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}


	/**public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
*/

	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}


	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	
	public Concert getConcert() {
		return concert;
	}
	public void setConcert(Concert concert) {
		this.concert = concert;
	}


	public utilisateur getUser() {
		return user;
	}
	public void setUser(utilisateur user) {
		this.user = user;
	}


	
	
	

}
