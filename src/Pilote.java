public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;

    public Pilote(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche, String licence, int heuresDeVol) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    public void affecterVol() {
        System.out.println("Le pilote " + getNom() + " est affecté à un vol.");
    }

    public void obtenirVol() {
        System.out.println("Affichage du planning de vol pour la licence " + licence);
    }

    public String getLicence() { return licence; }
    public void setLicence(String licence) { this.licence = licence; }

    public int getHeuresDeVol() { return heuresDeVol; }
    public void setHeuresDeVol(int heuresDeVol) { this.heuresDeVol = heuresDeVol; }

    @Override
    public void obtenirRole() {
        System.out.println("Le rôle de cet employé est : Pilote");
    }
}
