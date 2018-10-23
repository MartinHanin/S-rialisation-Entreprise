package be.iepscfjemelle.poolabo.martin.entreprise2;

/**
 * Classe Personne permettant la création d'objet Personne
 *
 * @author romu
 */
public abstract class Personne implements IntPersonne {

    /**
     * Role de la personne dans l'entreprise
     */
    public String role;
    /**
     * Numéro national de la personne
     */
    public String numeroNational;
    /**
     * Prénom de la personne
     */
    public String prenom;
    /**
     * Nom de la personne
     */
    public String nom;

    /**
     * Constructeur avec paramètres
     *
     * @param role
     * @param numéroNational
     * @param prenom
     * @param nom
     */
    public Personne(String role, String numéroNational, String prenom, String nom) {
        this.role = role;
        this.numeroNational = numéroNational;
        this.prenom = prenom;
        this.nom = nom;
    }

    /**
     * Getter role
     *
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * Getter numéro national
     *
     * @return numeroNational
     */
    public String getNuméroNational() {
        return numeroNational;
    }

    /**
     * Getter prénom
     *
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Getter nom
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Description de la personne
     *
     * @return String
     */
    @Override
    public String toString() {
        return this.prenom + " "
                + this.nom + " ayant le numéro national: "
                + this.numeroNational + " est "
                + this.role + " dans l'entreprise";
    }

    /**
     * Description du travail de la personne
     */
    @Override
    public void travaille() {

    }
;

}
