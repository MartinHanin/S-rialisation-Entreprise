package be.iepscfjemelle.poolabo.martin.entreprise2;

/**
 * Personne ayant une fonction de directeur
 *
 * @author romu
 */
public class Directeur extends Personne {

    /**
     * Constructeur hérité
     *
     * @param role
     * @param numéroNational
     * @param prenom
     * @param nom
     */
    public Directeur(String role, String numéroNational, String prenom, String nom) {
        super(role, numéroNational, prenom, nom);
    }

    /**
     * Description du travail de la personne
     */
    @Override
    public void travaille() {
        System.out.println("Je dirige l'entreprise.");
    }

    /**
     * Méthode spécifique à un directeur
     */
    public void comporte() {
        System.out.println("Je suis attentif à mon personnel.");
    }

}
