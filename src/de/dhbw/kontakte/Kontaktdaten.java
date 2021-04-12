package de.dhbw.kontakte;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Kontaktdaten implements KontaktDatenbank {

    /**
     * Hier werden die benötigten Variablen für das Interface KontaktDatenbank erstellt
     */

    public ArrayList<Person> personList = new ArrayList<>();
    public ArrayList<Ort> ortList = new ArrayList<>();
    public ArrayList<Begegnung> begegnungen = new ArrayList<>();
    public ArrayList <Besuch> besuche = new ArrayList<>();

    public Mensch mensch = new Mensch();
    public Location location = new Location();
    private int eID;

    /**
     * Hier erstelle ich Elemente der Klasse Besuch, um bei addBesuch ein Element der Klasse Besuch hinzuzufügen
     */

    Besuch besuchID = new Besuch(this.mensch, this.location);
    Besuch besuchName = new Besuch(this.mensch, this.location);

    /**
     * Hier erstelle ich Elemente der Klasse Besuch, um bei addBesuch ein Element der Klasse Begegnung hinzuzufügen
     */

    Begegnung begegnung1 = new Begegnung(getPerson(mensch.getId()), getPerson(mensch.getId()));
    Begegnung begegnung2 = new Begegnung(getPerson(mensch.getName()), getPerson(mensch.getName()));

    /**
     * Im folgenden Abschnitt implementiere ich das Interface für KontaktDatenbanken
     *
     * Dafür muss jede Funktion aus KontaktDatenbanken hier formuliert werden.
     * */

    public void addPerson(Person person){
        int a = erstelleID();
        mensch.setId(a);
        personList.add(mensch);
    }
    public int erstelleID(){
        Random random = new Random();
        eID = random.nextInt();
        if(eID <= 0){
            erstelleID();
        } else {
            System.out.println(eID);
        }
        return eID;
    }

    public Person getPerson(int id) {
        if(mensch.getId()== id) {
            System.out.println(mensch);
            return mensch;
        } else {
            System.out.println("Keine Person ");
            return null;
        }

    }
    public Person getPerson (String name){
        return mensch;
    }

    public List<Person> getPersonen(String name){
        return personList;
    }

    public void addOrt(Ort ort) {
        ortList.add(ort);
    }

    public Ort getOrt(int ortID){
        return this.getOrt(location.getOrtId());
    }

    public Ort getOrt(String ortName){
        return this.getOrt(location.getOrtName());
    }

    public void addBegegnung(Person person1, Person person2){
        begegnungen.add(begegnung1);

    }
    public void addBegegnung(String name1, String name2) {
        begegnungen.add(begegnung2);
    }

    public void addBesuch(Person person, Ort ort){
        besuche.add(besuchID);
    }

    public void addBesuch(String namePerson, String nameOrt){
        besuche.add(besuchName);

    }

    public List<Ort> besuchteOrte(Person person){
        return this.besuchteOrte(person);
    }

    public List<Person> begegnetePersonen(Person person){
        return this.begegnetePersonen(person);

    }

}
