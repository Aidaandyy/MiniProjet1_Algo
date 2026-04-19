package BlocLogistique;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import BlocLogistique.Vol;

public class GestionnaireFichiers {
    private String cheminFile = "vols.txt";


    public List<Vol> chargerVols() {
        List<Vol> listeVols = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(cheminFile))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {

                String[] infos = ligne.split(";");


                Vol v = new Vol(infos[0], null, null, infos[3], "", "Planifié", null);


                listeVols.add(v);
            }
            System.out.println("Chargement réussi : " + listeVols.size() + " vols trouvés.");
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }

        return listeVols;
    }
    public void sauvegarderVols(List<Vol> vols) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(cheminFile, false))) {
            for (Vol v : vols) {
                // On vérifie si l'origine et la destination existent
                String nomOrigine = (v.getOrigine() != null) ? v.getOrigine().getNom() : "Inconnu";
                String nomDestination = (v.getDestination() != null) ? v.getDestination().getNom() : "Inconnu";

                // On prépare la ligne
                String ligne = v.getNumeroVol() + ";" +
                        nomOrigine + ";" +
                        nomDestination + ";" +
                        v.getDateHeureDepart();

                bw.write(ligne);
                bw.newLine();
            }
            System.out.println("Sauvegarde terminée avec succès !");
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture : " + e.getMessage());
        }
    }
}
