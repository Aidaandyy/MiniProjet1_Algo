package BlocHumain;
public class Employe extends Personne {
    private String numeroEmploye;
    private String dateEmbauche;

    public Employe(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }
    public void obtenirRole() {
        System.out.println("Rôle de l'employé " + getNom() + " à définir.");
    }

    public String getNumeroEmploye() { return numeroEmploye; }
    public void setNumeroEmploye(String numeroEmploye) { this.numeroEmploye = numeroEmploye; }

    public String getDateEmbauche() { return dateEmbauche; }
    public void setDateEmbauche(String dateEmbauche) { this.dateEmbauche = dateEmbauche; }
}