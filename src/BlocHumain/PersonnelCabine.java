package BlocHumain;
public class PersonnelCabine extends Employe {
    private String qualification;

    public PersonnelCabine(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }
    public void affecterVol() {
        System.out.println("Membre de cabine " + getNom() + " affecté au vol.");
    }

    public void obtenirVol() {
        System.out.println("Liste des vols pour qualification : " + qualification);
    }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }

    @Override
    public void obtenirRole() {
        System.out.println("Le rôle de cet employé est : Personnel de Cabine");
    }

}