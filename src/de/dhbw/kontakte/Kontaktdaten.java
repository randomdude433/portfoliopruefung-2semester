package de.dhbw.kontakte;

import java.sql.Timestamp;
import java.util.*;
import java.time.LocalDateTime;


public class Kontaktdaten implements KontaktDatenbank {

    /**
     * Hier werden die benötigten Listen für das Interface KontaktDatenbank erstellt
     */

    public ArrayList<Person> personList = new ArrayList<>();
    public ArrayList<Ort> ortList = new ArrayList<>();

    /**
     * Da Begegnungen und Besuche aus zwei Variablen bestehen, ist es nicht ohne weiteres möglich, diese
     * direkt in eine ArrayList zu speichern.
     * Eine HashMap hingegen eignet sich sehr gut dafür, da man in diesen Paare abspeichern kann.
     * Diese Paare müssen nicht vom gleichen Typ sein
     */
    public HashMap<Person, Person> begegnungen = new HashMap<>();
    public HashMap<Person, Ort> besuche = new HashMap<>();
    public HashMap<Begegnung, Timestamp> begegnungHashMap = new HashMap<>();
    public HashMap<Besuch ,Timestamp> besuchHashMap = new HashMap<>();

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
        for (Person person:personList) {
            if (person.getId() == id) {
                System.out.println(person);
                return person;
            }
        }
        return null;
    }

    /**
     * Gibt immer nur die erste Person mit dem Namen aus
     */

    public Person getPerson (String name) {
        for (Person person: personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public ArrayList<Person> getPersonen (String name){
        ArrayList<Person> personArrayList = new ArrayList<>();
        for (Person mensch: personList ){
            if (mensch.getName().equals(name)){
                personArrayList.add(mensch);
                System.out.println("Mensch hinzugefügt");
            }
        }
        return personArrayList;
    }

    public void addOrt(Ort ort) {
        ortList.add(ort);
    }

    public Ort getOrt(int ortID){
        for (Ort location: ortList){
            if (location.getOrtId() == ortID){
                return location;
            }
        }
      return null;
    }

    public Ort getOrt(String ortName){
        for (Ort location: ortList){
            if (location.getOrtName().equals(ortName)){
                return location;
            }
        }
        return null;
    }

    public void addBegegnung(Person person1, Person person2, Timestamp timestamp){
        Begegnung begegnung = new Begegnung(person1, person2);
        begegnungen.put(person1, person2);
        begegnungHashMap.put(begegnung, timestamp);

    }

    /**
     * Wie soll man die Personen nur mit Name eindeutig feststellen?
     */

    public void addBegegnung(String name1, String name2, Timestamp timestamp) {
        Begegnung begegnung = new Begegnung(getPerson(name1), getPerson(name2));
        begegnungen.put(getPerson(name1), getPerson(name2));
        begegnungHashMap.put(begegnung, timestamp);

    }

    public void addBesuch(Person person, Ort ort){
        besuche.put(person, ort);
    }

    /**
     * Wie soll man die Person und den Ort nur mit Name eindeutig feststellen?
     */

    public void addBesuch(String namePerson, String nameOrt){
        Timestamp ts = new Timestamp(new Date().getTime());
        besuche.put(getPerson(namePerson), getOrt(nameOrt));



    }

    /**
     * Mit der Set
     */

    public List<Ort> besuchteOrte(Person person){
        ArrayList<Ort> orte = new ArrayList<>();
        Set<Person> temp1 = besuche.keySet();
        for (Person i: temp1){

            if(i.equals(person)){
                orte.add(besuche.get(i));
                System.out.println(besuche.get(i));
            }
        }
        return orte;
    }

    public List<Person> begegnetePersonen(Person person){
        ArrayList<Person> personen = new ArrayList<>();
        Set<Person> temp2 = begegnungen.keySet();
        for (Person i: temp2){
            if(i.equals(person)){
                personen.add(begegnungen.get(i));
                System.out.println(begegnungen.get(i));
            }
        }
        for (Person i: temp2){
            if(begegnungen.get(i).equals(person)){
                personen.add(i);
                System.out.println(i);
            }
        }
        return personen;
    }

}
