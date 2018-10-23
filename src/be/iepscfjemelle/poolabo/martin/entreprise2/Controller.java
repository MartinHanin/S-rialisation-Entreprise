package be.iepscfjemelle.poolabo.martin.entreprise2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Contrôleur contenant les méthodes de gestion du programme
 *
 * @author romu
 */
public class Controller implements Serializable{

    /**
     * Liste des fonctions dans l'entreprise
     */
    private final String TAB[] = {
        "Directeur",
        "Comptable",
        "Secrétaire",
        "Ouvrier 1",
        "Ouvrier 2",
        "Ouvrier 3",
        "Ouvrier 4"
    };

    /**
     * Liste des objets Personne
     */
    public Personne liste[] = new Personne[7];
    private String nomfich;
    

    /**
     * Insertion des données via la console et création des objets
     */
    public void start() throws IOException, FileNotFoundException, ClassNotFoundException {

        // Parcours de la liste des fonctions dans l'entreprise
        for (int i = 0; i < TAB.length; i++) {
            // Lecture des données dans la console
            System.out.println("Entrez le nom de : " + TAB[i]);
            String nom = Clavier.lireString();
            System.out.println("Entrez le prénom de : " + TAB[i]);
            String prenom = Clavier.lireString();
            System.out.println("Entrez le numéro national de : " + TAB[i]);
            String id = Clavier.lireString();

            // Création d'un objet Personne
            Personne obj = null;
            switch (TAB[i]) {
                case "Directeur":
                    obj = new Directeur(TAB[i], id, prenom, nom);
                    break;
                case "Secrétaire":
                    obj = new Secretaire(TAB[i], id, prenom, nom);
                    break;
                case "Comptable":
                    obj = new Comptable(TAB[i], id, prenom, nom);
                    break;
                case "Ouvrier 1":
                    obj = new Ouvrier(TAB[i], id, prenom, nom);
                    break;
                case "Ouvrier 2":
                    obj = new Ouvrier(TAB[i], id, prenom, nom);
                    break;
                case "Ouvrier 3":
                    obj = new Ouvrier(TAB[i], id, prenom, nom);
                    break;
                case "Ouvrier 4":
                    obj = new Ouvrier(TAB[i], id, prenom, nom);
                    break;
            }

            // Ajout de l'objet Personne dans la liste
            this.liste[i] = obj;
             
            
        }

        // Appel de l'affichage des personnes de l'entreprise
        affiche();

    }

    /**
     * Affichage des personnes de l'entreprise dans la console
     */
    private void affiche() throws IOException, FileNotFoundException, ClassNotFoundException {
        System.out.println("================================================================");
        System.out.println("Liste des personnes de l'entreprise:");
        System.out.println("================================================================");
System.out.println(liste[1]);
        // Parcours de la liste
        for (Personne liste1 : liste) {
            // Affichage dans la console
            System.out.println(liste1.toString());
            System.out.println("Description de mon travail: ");
            liste1.travaille();
            // Si c'est un directeur
            if (liste1.getRole().equals("Directeur")) {
                //liste1.comporte();
                /* On caste l'objet Personne en Directeur
                pour pouvoir utiliser la méthode comporte()
                qui est spécifique à un objet de type Directeur*/
                Directeur obj = (Directeur) liste1;
                obj.comporte();
            }
            System.out.println("************************************************************************\n");
            
        }
        Controller obj = new Controller();
            obj.execute();
            obj.Controller();
        //Affichage Menu
        Menu obj1 = new Menu();
        obj1.ShowMenu();
        System.out.println(liste[1]);
    }

    //////////////////////////////////////////////////////////////////////////////////////
    //METHODES
    /////////////////////////////////////////////////////////////////////////////////////
    // Création du flux d'objet de sortie
    ObjectOutputStream sortie;
    
    //Ecriture fichier texte
    public void execute() throws FileNotFoundException, IOException, ClassNotFoundException {

        // Initialisation des variables
        this.nomfich = "Liste Personnes.txt";
        
        // Ecriture en fichier txt
        try ( // Création du flux de sortie vers un fichier texte
        // Print Writer permet l'écriture de texte dans le fichier
                PrintWriter sortie = new PrintWriter(new FileWriter(nomfich))) {
            // Ecriture en fichier txt
            sortie.print(liste);
            // Fermeture du flux
        }

        // Affichage
        System.out.println("Création terminée. ");
        System.out.println(liste[1]);

    }

    //Ecriture en fichier bianire
    public void Controller() throws IOException, FileNotFoundException, ClassNotFoundException {
        this.sortie = new ObjectOutputStream(new FileOutputStream("personnes.dat"));

        // envoi des objets  
        sortie.writeObject(liste);

        // Fermeture du flux
        sortie.close();

    }

}
