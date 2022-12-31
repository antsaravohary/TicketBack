package fil.ipint.ReservationTicket.Entity;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import javax.persistence.*;



@Entity
public class Concert {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long idConcert;
	private String titre;
	private LocalDate date ;
	private double prix ;
	@ManyToOne(cascade = CascadeType.ALL)
	private Adresse adresse;
	@OneToMany(mappedBy = "concert")
	private Collection<Artiste> artistes= new ArrayList<Artiste>();
	@OneToMany(mappedBy = "concert")
	private Collection<Salle> salle= new ArrayList<Salle>() ;
	@OneToMany(mappedBy = "concert")
	private Collection<Billet> billet= new ArrayList<Billet>();


	public Concert() {

	}


	public Concert(Long id , String titre, LocalDate date, double prix,ArrayList<Artiste> artistes,ArrayList<Salle> salle,ArrayList<Billet> billet) {
		this.idConcert=id;
		this.titre = titre;
		this.date = date;
		this.prix = prix;
		this.artistes=artistes;
		this.salle=salle;
		this.billet=billet;


	}





	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}



	public Long getId() {
		return idConcert;
	}
	public void setId(Long id) {
		this.idConcert = id;
	}

	public String getTitre(String name) {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public LocalDate getDate() {
		return LocalDate.now();
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Collection<Artiste> getArtistes() {
		return artistes;
	}
	public void setArtistes(List<Artiste> artistes) {
		this.artistes = artistes;
	}

	public Collection<Salle> getSalle() {
		return salle;
	}
	public void setSalle(List<Salle> salle) {
		this.salle = salle;
	}

	public Collection<Billet> getBillet() {
		return billet;
	}
	public void setBillet(List<Billet> billet) {
		this.billet = billet;
	}
	

}
