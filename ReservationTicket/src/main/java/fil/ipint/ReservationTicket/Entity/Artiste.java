package fil.ipint.ReservationTicket.Entity;






import javax.persistence.*;


@Entity
public class Artiste {
	/*un artiste à un nom et une petite discription et ses concerts */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nameArtiste;
	private String description;
	@ManyToOne(cascade = CascadeType.ALL)
	private Concert concert ;


	public Artiste() {
	}

	public Artiste(Long id, String name, String description,Concert concert) {
		this.id = id;
		this.nameArtiste=name;
		this.description=description;
		this.concert=concert;

	}


	public String getName() {
		return nameArtiste;
	}
	public void setName(String name) {
		this.nameArtiste = name;
	}


	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public Concert getConcert() {
		return concert;
	}
	public void setConcert(Concert concert) {
		this.concert = concert;
	}


	
	
	

}
