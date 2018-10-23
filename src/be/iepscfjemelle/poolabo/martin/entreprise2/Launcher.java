package be.iepscfjemelle.poolabo.martin.entreprise2;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Lanceur
 *
 * @author romu
 */
public class Launcher {

    /**
     * Lancement du programme
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
       
        // Création de l'objet Controller
        Menu obj = new Menu();
        // Exécution de la méthode start du controleur
        obj.ShowMenu();

    }

}
