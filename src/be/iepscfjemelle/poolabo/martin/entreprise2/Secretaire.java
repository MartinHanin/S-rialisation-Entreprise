package be.iepscfjemelle.poolabo.martin.entreprise2;

/**
 * Personne ayant une fonction de sécrétaire
 *
 * @author romu
 */
public class Secretaire extends Personne {

    /**
     * Constructeur hérité
     *
     * @param role
     * @param numéroNational
     * @param prenom
     * @param nom
     */
    public Secretaire(String role, String numéroNational, String prenom, String nom) {
        super(role, numéroNational, prenom, nom);
    }

    /**
     * Description du travail de la personne
     */
    @Override
    public void travaille() {
        System.out.println("J'assure l'administration de l'entreprise.");
    }

}
