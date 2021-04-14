package de.dhbw.kontakte;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;



public class Kontaktdaten implements KontaktDatenbank {

    /**
     * Hier werden die benötigten Listen für das Interface KontaktDatenbank erstellt
     */

    public ArrayList<Person> personList = new ArrayList<>();
    public ArrayList<Ort> ortList = new ArrayList<>();
    public ArrayList<Person> personArrayList = new ArrayList<>();

    /**
     * Da Begegnungen und Besuche aus zwei Variablen bestehen, ist es nicht ohne weiteres möglich, diese
     * direkt in eine ArrayList zu speichern.
     * Eine HashMap hingegen eignet sich sehr gut dafür, da man in diesen Paare abspeichern kann.
     * Diese Paare müssen nicht vom gleichen Typ sein
     */
    public HashMap<Person, Person> begegnungen = new HashMap<>();
    public HashMap<Person, Ort> besuche = new HashMap<>();

    public Mensch mensch;
    public Location location;


    /**
     * Im folgenden Abschnitt implementiere ich das Interface für KontaktDatenbanken
     * Dafür muss jede Funktion aus KontaktDatenbanken hier formuliert werden.
     */

    public void addPerson(Person person) {
            personList.add(person);
    }

    /**
     * die getPerson gleicht die eingegebene ID mit allen ID's von den Personen ab
     */

    public Person getPerson(int id) {
        for (Person mensch:personList) {
            if (mensch.getId() == id) {
                System.out.println(mensch);
                return mensch;
            } else {
                System.out.println("Keine Person ");
                return null;
            }
        }
        return null;
    }
    public Person getPerson (String name) {
        for (int i = 0; i <= personList.size(); i++) {
            if (mensch.getName() == name) {
                return mensch;
            }
        }
        return null;
    }

    public List<Person> getPersonen (String name){
        for (Person mensch: personList ){
            if (name == mensch.getName()){
                personArrayList.add(this.mensch);
                System.out.println("Mensch hinzugefügt");
            }
           return null;
        }
        return personArrayList;
    }

    public void addOrt(Ort ort) {
        ortList.add(ort);
    }

    public Ort getOrt(int ortID){
        for (Ort location: ortList){
            if (location.getOrtId() == ortID){
                return this.location;
            }
        }
      return null;
    }

    public Ort getOrt(String ortName){
        for (Ort location: ortList){
            if (location.getOrtName() == ortName){
                return this.location;
            }
        }
        return null;
    }

    public void addBegegnung(Person person1, Person person2){
        begegnungen.put(person1, person2);
    }

    public void addBegegnung(String name1, String name2) {
        begegnungen.put(getPerson(name1), getPerson(name2));
    }

    public void addBesuch(Person person, Ort ort){
        besuche.put(person, ort);
    }

    public void addBesuch(String namePerson, String nameOrt){
        besuche.put(getPerson(namePerson), getOrt(nameOrt));
    }

    public List<Ort> besuchteOrte(Person person){
        return this.besuchteOrte(person);
    }

    public List<Person> begegnetePersonen(Person person){
        return this.begegnetePersonen(person);
    }
}
