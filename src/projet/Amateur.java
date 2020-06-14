package projet;

import exceptions.InvalidStringException;
import exceptions.InvalidTimeException;
import exceptions.NegativeNumberException;

public class Amateur extends Participant{
    public Amateur(String nom, Integer age, Integer numero, Integer classement, Temps temps) throws NegativeNumberException, InvalidStringException, InvalidTimeException {
        super(nom,age,numero,classement,temps);
    }

    public static void ajouterAmateur(Amateur amateur){
        Participant.participant[Participant.index]=amateur;
        Participant.index++;
    }

    public static void afficherAmateur(){
        for (Participant p : Participant.participant){
            if(p instanceof Amateur){
                p.afficher();
            }
        }
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println();
    }
}
