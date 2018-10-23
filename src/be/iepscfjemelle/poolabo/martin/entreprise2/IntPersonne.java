package be.iepscfjemelle.poolabo.martin.entreprise2;

/**
 * Interface définissant le comportement des classes héritiaires
 *
 * @author martin
 */
public interface IntPersonne {

    /**
     * Description du travail de la personne
     */
    public void travaille();

    /**
     * Description de la personne
     *
     * @return String
     */
    @Override
    public String toString();

}
