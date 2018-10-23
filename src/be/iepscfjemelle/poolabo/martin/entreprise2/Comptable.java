package be.iepscfjemelle.poolabo.martin.entreprise2;

/**
 * Personne ayant une fonction de comptable
 *
 * @author romu
 */
public class Comptable extends Personne {

    /**
     * Constructeur hérité
     *
     * @param role
     * @param numéroNational
     * @param prenom
     * @param nom
     */
    public Comptable(String role, String numéroNational, String prenom, String nom) {
        super(role, numéroNational, prenom, nom);
    }

    /**
     * Description du travail de la personne
     */
    @Override
    public void travaille() {
        System.out.println("J'effectue la comptabilité de l'entreprise.");
    }

}
