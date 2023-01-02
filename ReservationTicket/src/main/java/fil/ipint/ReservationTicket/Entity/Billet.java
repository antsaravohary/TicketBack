package fil.ipint.ReservationTicket.Entity;



import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bytebuddy.build.ToStringPlugin;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import javax.persistence.*;


@Entity
public class Billet {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(cascade = CascadeType.ALL)
	private utilisateur user;
	@CreationTimestamp
	private Date dateAchat;

	@ManyToOne(cascade = CascadeType.ALL)
	private Concert concert ;


	public Billet(Long id, Date dateAchat, Concert concert) {
		this.id = id;
		this.dateAchat = dateAchat;

		this.concert = concert;

	}

	public Billet(){
		super();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
