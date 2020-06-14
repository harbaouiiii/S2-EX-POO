package projet;

import exceptions.InvalidStringException;
import exceptions.InvalidTimeException;
import exceptions.NegativeNumberException;

public class Athlete extends Participant implements EmployeEquipe {
    private Integer nombreEvenement;
    //private Integer[] tempsRealise;
    //private Integer index = 0;

    public Athlete(String nom, Integer age, Integer numero, Integer classement, Temps temps,Integer nombreEvenement) throws NegativeNumberException, InvalidStringException, InvalidTimeException {
        super(nom,age,numero,classement,temps);
        if(nombreEvenement>0){
            this.nombreEvenement=nombreEvenement;
        } else {
            throw new NegativeNumberException("Veuillez insérez un nombre positive!");
        }
        //this.tempsRealise = new Integer[nombreEvenement];
    }

    public Integer getNombreEvenement() {
        return nombreEvenement;
    }

    public void setNombreEvenement(Integer nombreEvenement) {
        this.nombreEvenement = nombreEvenement;
    }
/*
    public void getTempsRealise() {
        for(Integer i : tempsRealise){
            System.out.println(super.convertTime(i));
        }
    }

    public void setTempsRealise(Integer tempsRealise) {
        this.tempsRealise[this.index] = tempsRealise;
        this.index++;
    }
 */

    public static void ajouterAthlete(Athlete athlete) {
        Participant.participant[Participant.index]=athlete;
        Participant.index++;
    }

    public static void afficherAthlete(){
        for (Participant p : Participant.participant){
            if(p instanceof Athlete){
                p.afficher();
            }
        }
    }

    public void afficher(){
        super.afficher();
        System.out.println(", Nombre des evenements: "+nombreEvenement);
        System.out.println("Liste des temps déjà réalisés: {4,3,2}");
        //getTempsRealise();
    }
}
