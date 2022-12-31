package fil.ipint.ReservationTicket.Service.ServiceInter;


import fil.ipint.ReservationTicket.Entity.Artiste;

public interface ArtisteService {
    Artiste createArtiste(Artiste artiste );
    Iterable<Artiste> getAllArtiste();
    void addArtiste(Artiste artiste);
    void updateArtiste(Artiste artiste);
    void deleteArtiste(Long id);
}
