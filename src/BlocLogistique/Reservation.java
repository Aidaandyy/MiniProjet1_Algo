package BlocLogistique;
import BlocHumain.Passager;
import java.util.Date;

public class Reservation {
    private String numeroReservation;
    private Date dateReservation;
    private String statut;
    private Passager passager;
    private Vol vol;

    public Reservation(String numeroReservation, Passager passager, Vol vol) {
        this.numeroReservation = numeroReservation;
        this.passager = passager;
        this.vol = vol;
        this.dateReservation = new Date();
        this.statut = "En attente";
    }

    public void confirmerReservation() {
        this.statut = "Confirmée";
        System.out.println("La réservation " + numeroReservation + " est confirmée.");
    }

    public void annulerReservation() {
        this.statut = "Annulée";
        System.out.println("La réservation " + numeroReservation + " est annulée.");
    }

    public void modifierReservation(Vol nouveauVol) {
        this.vol = nouveauVol;
        System.out.println("La réservation " + numeroReservation + " a été modifiée pour le vol " + nouveauVol.getNumeroVol());
    }

    public String getNumeroReservation() { return numeroReservation; }
    public void setNumeroReservation(String numeroReservation) { this.numeroReservation = numeroReservation; }

    public Date getDateReservation() { return dateReservation; }
    public void setDateReservation(Date dateReservation) { this.dateReservation = dateReservation; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public Passager getPassager() { return passager; }
    public void setPassager(Passager passager) { this.passager = passager; }

    public Vol getVol() { return vol; }
    public void setVol(Vol vol) { this.vol = vol; }
}
