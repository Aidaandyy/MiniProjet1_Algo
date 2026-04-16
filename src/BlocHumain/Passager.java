package BlocHumain;
import BlocLogistique.Vol;
import java.util.ArrayList;

public class Passager extends Personne {

    private ArrayList<Vol> volsReserves = new ArrayList<>();

    private String passeport;
    public Passager(String identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
    }
    public void reserverVol() {
        System.out.println(getNom() + " est en train de réserver un vol.");
    }
    public void annulerReservation() {
        System.out.println("Réservation annulée.");
    }
    public void obtenirReservations() {
        System.out.println("Liste des réservations pour : " + getNom());
    }
    public String getPasseport() { return passeport; }
    public void setPasseport(String passeport) { this.passeport = passeport; }
    public void reserverVol(Vol v) {
        this.volsReserves.add(v);

        System.out.println("Vol " + v.getNumeroVol() + " réservé pour " + this.getNom());
    }
}
