package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

import models.Apprenti;
import models.Enseignant;
import models.Personne;

public class ServiceData {

   public ArrayList<Personne> genererApprentis(String classe) {
      ArrayList<Personne> personnes = new ArrayList<>();
      if (classe.equals("F21")) {
         personnes.add(new Apprenti("homme", "Bernet", "Maxime", 1.72, "DEV"));
         personnes.add(new Apprenti("homme", "Berrier", "Noa", 1.71, "DEV"));
         personnes.add(new Apprenti("homme", "Boon", "Lucas", 1.68, "DEV"));
         personnes.add(new Apprenti("homme", "Crausaz", "Esteban", 1.78, "DEV"));
         personnes.add(new Apprenti("homme", "Crovetto", "Tomas", 1.82, "IT"));
         personnes.add(new Apprenti("homme", "Fejzulahi", "Seid", 1.83, "IT"));
         personnes.add(new Apprenti("homme", "Gantchev", "Alexander", 1.80, "IT"));
         personnes.add(new Apprenti("homme", "Gigandet", "Yoan", 1.75, "DEV"));
         personnes.add(new Apprenti("homme", "Gremaud", "Thomas", 1.77, "DEV"));
         personnes.add(new Apprenti("homme", "Jacquet-Lagreze", "Aron", 1.74, "DEV"));
         personnes.add(new Apprenti("homme", "Lâm", "Louis", 1.70, "DEV"));
         personnes.add(new Apprenti("homme", "Meghezi", "Amayas", 1.76, "IT"));
         personnes.add(new Apprenti("homme", "Parent", "Julien", 1.74, "DEV"));
         personnes.add(new Apprenti("femme", "Perelli", "Louisa", 1.68, "DEV"));
         personnes.add(new Apprenti("homme", "Peyter", "Maxime", 1.74, "DEV"));
         personnes.add(new Apprenti("homme", "Shala", "Leon", 1.72, "IT"));
         personnes.add(new Apprenti("homme", "Szuta", "Bartosz", 1.78, "IT"));
         personnes.add(new Apprenti("homme", "Yazdanpanah", "Yohan", 1.71, "IT"));
      }
      return personnes;
   }

   public ArrayList<Personne> genererEnseignants() {
      ArrayList<Personne> personnes = new ArrayList<>();
      personnes.add(new Enseignant("homme", "Collela", "Dimitri", 1.78, "DEV"));
      personnes.add(new Enseignant("homme", "Butschi", "Daniel", 1.77, "DEV"));
      personnes.add(new Enseignant("femme", "Egger", "Nadia", 1.65, "DEV"));
      return personnes;
   }

   public void melangerPersonnes(ArrayList<Personne> personnes) {
      Collections.shuffle(personnes);
   }

   public void remplirHashMap(ArrayList<Personne> personnes, HashMap<UUID, Personne> IDVersPersonnes) {
      for (Personne personne : personnes) {

         IDVersPersonnes.put(personne.getUUID(), personne);
      }
   }
}
