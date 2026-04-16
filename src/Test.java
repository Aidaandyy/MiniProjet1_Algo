import BlocHumain.*;
import BlocLogistique.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Avion monAvion = new Avion("Airbus A350", "F-HTYA", 325);


        Aeroport orly = new Aeroport("Orly", "Paris", "Terminal Ouest");
        Aeroport montreal = new Aeroport("Trudeau", "Montréal", "Zone Internationale");


        Vol monVol = new Vol("AF344", orly, montreal, "13h10", "15h20", "Planifié", monAvion);

        Pilote commandant = new Pilote("P01", "Thomas", "12 rue de Paris", "0601020304", "EMP-101", "01/01/2020", "LIC-789", 5000);
        PersonnelCabine hotesse = new PersonnelCabine("H02", "Sophie", "5 avenue Orly", "0699887766", "EMP-202", "12/03/2022", "Chef de Cabine");
        Passager client = new Passager("C45", "Aïda", "20 rue ISEP", "aida@email.com", "FR12345678");
        System.out.println("--- Test : Gestion des Personnes ---");
        client.obtenirInfos();

        System.out.print("Rôle du pilote : ");
        commandant.obtenirRole();
        System.out.println();

        System.out.println("--- Test : Gestion des Vols ---");
        ArrayList<PersonnelCabine> equipe = new ArrayList<>();
        equipe.add(hotesse);
        monVol.affecterVol(commandant, equipe);
        monVol.obtenirVol();
        System.out.println();

        System.out.println("--- Test : Gestion des Avions ---");
        monAvion.verifierDisponibilite();
        monAvion.affecterVol();
        System.out.println();

        System.out.println("--- Test : Gestion des Réservations ---");
        client.reserverVol(monVol);

        Reservation maResa = new Reservation("RES-100", client, monVol);
        maResa.confirmerReservation();
        maResa.annulerReservation();
        System.out.println();

        System.out.println("--- Test : Planning ---");

        monVol.planifierVol();
        monVol.annulerVol();

        System.out.println("\n=== TOUS LES TESTS SONT PASSÉS ===");}

        }
