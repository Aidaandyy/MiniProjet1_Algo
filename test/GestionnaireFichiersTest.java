import static org.junit.jupiter.api.Assertions.*;

import BlocLogistique.GestionnaireFichiers;
import BlocLogistique.Vol;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.io.File;

class GestionnaireFichiersTest {

    @Test
     void testLectureFichier() {
        GestionnaireFichiers gf = new GestionnaireFichiers();

        File f = new File("vols.txt");
        assertTrue(f.exists(), "Le fichier vols.txt devrait exister à la racine");

        List<Vol> liste = gf.chargerVols();

        assertNotNull(liste, "La liste de vols ne doit pas être nulle");
        System.out.println("Test JUnit : Lecture réussie !");
    }
}
