package projet;

import exceptions.InvalidStringException;
import exceptions.InvalidTimeException;
import exceptions.NegativeNumberException;

import java.util.Scanner;

public abstract class Participant {
    private String nom;
    private Integer age,numero,classement;
    private Temps temps;

    public static Participant[] participant = new Participant[100];
    public static int index = 0 ;

    public Participant(String nom,Integer age,Integer numero,Integer classement,Temps temps) throws NegativeNumberException, InvalidStringException {
        if(valid(nom)){
            this.nom=nom;
        } else{
            throw new InvalidStringException("Chaine vide ou non valide!");
        }
        if(age>0 && numero>0 && classement>0){
            this.age=age;
            this.numero=numero;
            this.classement=classement;
        } else {
            throw new NegativeNumberException("Veuillez inserez un nombre positif!");
        }
        this.temps=temps;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getClassement() {
        return classement;
    }

    public void setClassement(Integer classement) {
        this.classement = classement;
    }

    public Temps getTemps() {
        return temps;
    }

    public void setTemps(Temps temps) {
        this.temps = temps;
    }

    public String afficherClassement(){
        if(classement>1)
            return classement+"ème";
        return "1er";
    }

    public static Participant[] superieur(){
        Participant[] part = new Participant[index];
        Integer j= new Integer(0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donner un age: ");
        Integer age = scanner.nextInt();
        for(Participant p : participant){
            if(p.getAge()>age){
                part[j]=p;
                j++;
            }
        }
        return part;
    }

    public static Boolean present(Integer numero){
        for(Participant p : participant){
            if(p.getNumero()==numero){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void afficher(){
        System.out.print("Nom: "+nom+", Age: "+age+"ans, Numéro: "+numero+", Classement: "+afficherClassement()+", Temps: "+temps.toString());
    }

    public Boolean valid(String s){
        if(!s.isEmpty()){
            for(Character c : s.toCharArray()){
                if(Character.isDigit(c)){
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
