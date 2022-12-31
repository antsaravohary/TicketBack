package fil.ipint.ReservationTicket.Service.ServiceInter;

import fil.ipint.ReservationTicket.Entity.Adresse;


public interface AdresseService {
    void saveAdresse(Adresse adresse);

    Iterable<Adresse > getAllAdresse();
    void updateAdresse (Adresse adresse);
    void deleteAdresse (Long id);
}
