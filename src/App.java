import java.util.ArrayList;

import models.Personne;
import models.Apprenti;
import services.ServiceData;
import services.ServiceIndexation;
import services.ServiceTri;

public class App {
    public static void main(String[] args) throws Exception {

        ServiceData serviceData = new ServiceData();
        ServiceTri serviceTri = new ServiceTri();
        ServiceIndexation serviceIndexation = new ServiceIndexation();
        ArrayList<Personne> personnes = new ArrayList<>();

        personnes.addAll(serviceData.genererApprentis("F21"));
        personnes.addAll((serviceData.genererEnseignants()));

        serviceData.melangerPersonnes(personnes);

        // tri par taille
        System.out.println("----------Liste triée par taille.---------");
        serviceTri.trierPersonneParTaille(personnes);
        for (Personne personne : personnes) {
            System.out.println(personne);
        }
        System.out.println();

        serviceData.melangerPersonnes(personnes);

        // indexation
        serviceIndexation.initialisationDesOutilsDeRecherche(personnes);

        // personne avec la taille maximale
        Personne personneTailleMax = serviceIndexation.cherchePersonneAvecTailleMaximale();
        System.out.println("--------------------------------------------------");
        System.out.println("La personne la plus grande est " + personneTailleMax);
        System.out.println("--------------------------------------------------\n");

        // la liste des personnes de taille 1.78
        ArrayList<Personne> personnesDe1m78 = serviceIndexation.cherchePersonnesParTaille(1.78);
        System.out.println("----------Liste des personnes de 1.78------------");
        for (Personne personne : personnesDe1m78) {
            System.out.println(personne);
        }
        System.out.println();

        /*
        // La liste des apprentis de taille 1.78
        ArrayList<Apprenti> apprentisContratDev = serviceIndexation.chercheApprentisParContrat("DEV");
        System.out.println("----------Liste des Apprentis avec un contrat DEV------------");
        for (Apprenti apprenti : apprentisContratDev) {
            System.out.println(apprenti);
        }
        System.out.println();
        */
    }
}
