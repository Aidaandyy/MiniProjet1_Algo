package BlocLogistique;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public void affecterVol() {
        System.out.println("L'avion " + immatriculation + " est affecté à un vol.");
    }
    public boolean verifierDisponibilite() {
        System.out.println("Vérification de la disponibilité de l'avion " + immatriculation);
        return true;
    }
    public String getImmatriculation() { return immatriculation; }
    public String getModele() { return modele; }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getCapacite() { return capacite; }
}
