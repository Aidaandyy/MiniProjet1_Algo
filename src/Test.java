import BlocHumain.*;
import BlocLogistique.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Avion monAvion = new Avion("Airbus A350", "F-HTYA", 325);
        Aeroport orly = new Aeroport("Orly", "Paris", "Terminal Ouest");
        Aeroport montreal = new Aeroport("Trudeau", "Montréal", "Zone Internationale");

        GestionnaireFichiers gf = new GestionnaireFichiers();
        System.out.println("--- Étape 1 : Chargement des données ---");
        List<Vol> mesVols = gf.chargerVols();

        System.out.println("\n--- Étape 2 : Gestion des Personnes et Réservations ---");

        Pilote commandant = new Pilote("P01", "Thomas", "12 rue de Paris", "0601020304", "EMP-101", "01/01/2020", "LIC-789", 5000);
        Passager client = new Passager("C45", "Aïda", "20 rue ISEP", "aida@email.com", "FR12345678");

        if (!mesVols.isEmpty()) {
            Vol volAtester = mesVols.get(0);
            System.out.println("Test de réservation sur le vol chargé : " + volAtester.getNumeroVol());

            client.reserverVol(volAtester);
            Reservation maResa = new Reservation("RES-100", client, volAtester);
            maResa.confirmerReservation();
        }

        System.out.println("\n--- Étape 3 : Ajout d'un vol et sauvegarde ---");
        Vol nouveauVol = new Vol("AF999", orly, montreal, "20h00", "22h00", "Planifié", monAvion);
        mesVols.add(nouveauVol);

        gf.sauvegarderVols(mesVols);

        System.out.println("\n=== TOUS LES TESTS (Fichiers + Métier) SONT PASSÉS ===");
    }
}