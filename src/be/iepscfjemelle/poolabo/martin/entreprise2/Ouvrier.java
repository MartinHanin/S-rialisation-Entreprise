package be.iepscfjemelle.poolabo.martin.entreprise2;

/**
 * Personne ayant une fonction d'ouvrier
 *
 * @author romu
 */
public class Ouvrier extends Personne {

    /**
     * Constructeur hérité
     *
     * @param role
     * @param numéroNational
     * @param prenom
     * @param nom
     */
    public Ouvrier(String role, String numéroNational, String prenom, String nom) {
        super(role, numéroNational, prenom, nom);
    }

    /**
     * Description du travail de la personne
     */
    @Override
    public void travaille() {
        System.out.println("J'effectue les tâches technique de l'entreprise.");
    }

}
