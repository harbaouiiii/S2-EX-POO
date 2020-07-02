package entities;

import exceptions.InvalidStringException;
import exceptions.NegativeNumberException;

public class Amateur extends Participant{
    public Amateur(String nom, Integer age, Integer numero, Integer classement, Temps temps) throws NegativeNumberException, InvalidStringException{
        super(nom,age,numero,classement,temps);
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
