package projet;

import exceptions.InvalidStringException;
import exceptions.InvalidTimeException;
import exceptions.NegativeNumberException;

public class TestMain {

    public static void main(String[] args) throws NegativeNumberException, InvalidStringException, InvalidTimeException {

        Amateur.ajouterAmateur(new Amateur("Lobna",29,125478,17,new Temps(90,5)));

        Athlete.ajouterAthlete(new Athlete("Mohamed",23,547064,1,new Temps(64),12));

        Athlete.ajouterAthlete(new Athlete("Lotfi",32,547065,10,new Temps(84),5));

        Athlete.ajouterAthlete(new Athlete("Mohamed",21,547069,12,new Temps(94),10));

        Amateur.ajouterAmateur(new Amateur("Sonia",19,125479,11,new Temps(60,0)));

        Amateur.ajouterAmateur(new Amateur("Nabiha",36,125471,19,new Temps(0,15,240)));

        EmployeEquipe employeEquipe = new Athlete("Emna",21,547074,2,new Temps(70),35);
        Athlete.ajouterAthlete( (Athlete) employeEquipe);



        System.out.println("**** Liste des amateurs ****");
        Amateur.afficherAmateur();
        System.out.println();

        System.out.println("**** Liste des athlètes qui ont fait plus de 10 compétitions ****");
        for(Participant p : Participant.participant){
            if(p instanceof Athlete){
                if(((Athlete) p).getNombreEvenement()>10){
                    p.afficher();
                }
            }
        }
        System.out.println();

        System.out.println("**** Liste des athlètes avant modification ****");
        Athlete.afficherAthlete();
        System.out.println("**** Liste des athlètes après modification de classement des 5 premiers athlètes ****");
        int i=0,j=0;
        while(j!=5 && i<Participant.index){
            if(Participant.participant[i] instanceof Athlete){
                Participant.participant[i].setClassement(5);
                j++;
            }
            i++;
        }
        Athlete.afficherAthlete();
    }
}
