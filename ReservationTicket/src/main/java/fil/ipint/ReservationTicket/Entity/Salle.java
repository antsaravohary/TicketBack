package fil.ipint.ReservationTicket.Entity;



import javax.persistence.*;

@Entity
public class Salle {

	/*une salle à un identifiant et un nom et nb de pplace et un concert  */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nameSalle;
	private int nb_place;
	@ManyToOne(cascade = CascadeType.ALL)
	private Concert concert;

	
	public Salle(Long id, String name, int nb_place, Concert concert) {
		this.id = id;
		this.nameSalle = name;
		this.nb_place = nb_place;
		this.concert = concert;
	}

	public Salle(String name,int nb_place){

		this.nameSalle=name;
		this.nb_place=nb_place;
	}

	public Salle() {
		super();
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return nameSalle;
	}
	public void setName(String name) {
		this.nameSalle = name;
	}





	public int getNb_place() {
		return nb_place;
	}
	public void setNb_place(int nb_place) {
		this.nb_place = nb_place;
	}





	public Concert getConcert() {
		return concert;
	}
	public void setConcert(Concert concert) {
		this.concert = concert;
	}





	


	




}
