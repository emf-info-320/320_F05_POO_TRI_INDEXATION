package services;

public class ServiceIndexation {

    /**
     * Construit les structures qui serviront aux recherches rapides.
     */
    public ServiceIndexation() {

    }

    /**
     * Indexe les personnes afin de préparer les recherches.
     *
     * @param personnes les personnes à indexer
     */
    public void initialisationDesOutilsDeRecherche(ArrayList<Personne> personnes) {

    }

    /**
     * @return la personne la plus grande, ou null si aucune personne n'a été
     *         indexée
     */
    public Personne cherchePersonneAvecTailleMaximale() {

    }

    /**
     * Cherche rapidement les personnes ayant exactement la taille demandée.
     *
     * @param taille la taille recherchée
     * @return les personnes concernées, triées par nom puis par prénom
     */
    public ArrayList<Personne> cherchePersonnesParTaille(double taille) {

    }

    /**
     * Cherche rapidement les apprentis possédant le contrat demandé.
     *
     * @param contrat le contrat d'apprentissage recherché
     * @return les apprentis concernés, triés par nom puis par prénom
     */
    public ArrayList<Apprenti> chercheApprentisParContrat(String contrat) {
    }

}
