package entities;

import exceptions.InvalidStringException;
import exceptions.NegativeNumberException;

public class Amateur extends Participant{
    public Amateur(String nom, Integer age, Integer numero, Integer classement, Temps temps) throws NegativeNumberException, InvalidStringException{
        super(nom,age,numero,classement,temps);
    }

    @Override
    public void afficher(){
        System.out.print("Nom: "+super.getNom()+", Age: "+super.getAge()+"ans, Numéro: "+super.getNumero()+", Classement: "+afficherClassement()+", Temps: "+super.getTemps().toString());
        System.out.println();
    }
}
