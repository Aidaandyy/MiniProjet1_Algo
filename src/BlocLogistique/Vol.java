package BlocLogistique;
import java.util.ArrayList;
import BlocHumain.Passager;
import BlocHumain.Pilote;
import BlocHumain.PersonnelCabine;

public class Vol {
    private String numeroVol;
    private Aeroport Origine;
    private Aeroport destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;
    private Pilote pilote;
    private ArrayList<PersonnelCabine> equipeCabine = new ArrayList<>();

    private Avion avion;

    private ArrayList<Passager> listePassagers;

    public Vol(String numeroVol, Aeroport origine, Aeroport destination, String dateHeureDepart, String dateHeureArrivee, String etat, Avion avion) {
        this.numeroVol = numeroVol;
        this.Origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
        this.avion = avion;
        this.listePassagers = new ArrayList<>();
    }

    public void planifierVol() {
        this.etat = "Planifié";
        System.out.println("Le vol " + numeroVol + " est maintenant : " + etat);
    }
    public void annulerVol() {
        this.etat = "Annulé";
        System.out.println("Le vol " + numeroVol + " a été annulé.");
    }
    public void listingPassager() {
        System.out.println("Passagers du vol " + numeroVol + " (Avion : " + avion.getModele() + ") :");
        if (listePassagers.isEmpty()) {
            System.out.println("Aucun passager enregistré.");
        } else {
            for (Passager p : listePassagers) {
                System.out.println("- " + p.getNom());
            }
        }
    }
    public void affecterVol(Pilote p, ArrayList<PersonnelCabine> equipe) {
        this.pilote = p;
        this.equipeCabine = equipe;
        System.out.println("Équipage affecté au vol " + numeroVol);
    }
    public void obtenirVol() {
        System.out.println("Infos Vol " + numeroVol + " | De " + Origine.getNom() + " vers " + destination.getNom());
        System.out.println("État : " + etat);
    }
    public String getNumeroVol() { return numeroVol; }
    public void setNumeroVol(String numeroVol) { this.numeroVol = numeroVol; }

    public Aeroport getOrigine() { return Origine; }
    public void setOrigine(Aeroport origine) { this.Origine = origine; }

    public Aeroport getDestination() { return destination; }
    public void setDestination(Aeroport destination) { this.destination = destination; }

    public String getDateHeureDepart() { return dateHeureDepart; }
    public void setDateHeureDepart(String dateHeureDepart) { this.dateHeureDepart = dateHeureDepart; }

    public String getDateHeureArrivee() { return dateHeureArrivee; }
    public void setDateHeureArrivee(String dateHeureArrivee) { this.dateHeureArrivee = dateHeureArrivee; }

    public String getEtat() { return etat; }
    public void setEtat(String etat) { this.etat = etat; }
}

