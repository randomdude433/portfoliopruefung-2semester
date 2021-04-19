package de.dhbw.kontakte;

import java.sql.Timestamp;
import java.util.*;

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
    public HashMap<Begegnung, Zeitraum> begegnungHashMap = new HashMap<>();
    public HashMap<Besuch, Zeitraum> besuchHashMap = new HashMap<>();

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
     * die getPerson gibt immer nur die erste Person mit dem Namen aus -> Problem bei mehreren Personen mit dem gleichen Namen
     * Sie wird aber in der addBesuch und addBegegnung verwendet
     */

    public Person getPerson (String name) {
        for (Person person: personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    /**
     * Die getPersonen gibt eine Liste mit allen Personen mit dem gleichen Namen zurück
     */


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

    /**
     * Die getOrt gleicht die angegebene OrtID mit den vorhandenen OrtIDs ab.
     * Findet sie die gleiche ID wird der Ort zurück gegeben
     */

    public Ort getOrt(int ortID){
        for (Ort location: ortList){
            if (location.getOrtId() == ortID){
                return location;
            }
        }
      return null;
    }

    /**
     * Gleiches Problem wie mit der getPerson (String name), es ist keine Eindeutigkeit gegeben
     */

    public Ort getOrt(String ortName){
        for (Ort location: ortList){
            if (location.getOrtName().equals(ortName)){
                return location;
            }
        }
        return null;
    }

    /**
     * Der addBegegnung konnte man anfangs nur zwei Personen übergeben und diese wurden als Key und Value in die HashMap
     * gelegt. Durch die Erstellung der Klassen Begegnung und Zeitraum, kann/muss man 2 Personen angeben, die als Begegnung
     * zusammengefasst werden und ein Start- und ein Enddatum, was als Zeitraum gefasst wird.
     * Es existiert weiterhin die HashMap ohne den Zeitraum, damit man in der Funktion begegnetePersonen die Listen besser
     * auswerten kann.
     */

    public void addBegegnung(Person person1, Person person2, Timestamp anfang, Timestamp ende){
        Begegnung begegnung = new Begegnung(person1, person2);
        Zeitraum zeitraum = new Zeitraum(anfang, ende);
        begegnungen.put(person1, person2);
        begegnungHashMap.put(begegnung, zeitraum);

    }

    /**
     * Diese Funktion funktioniert wie die darüber, nur dass sie die Personen anhand der Namen erkennt. Das Problem ist,
     * sobald man mehrere Personen mit dem gleichen Namen hat, wird nur die erste Person in der Liste mit dem Namen erkannt.
     * Wie soll man die Personen nur mit Name eindeutig feststellen?
     */

    public void addBegegnung(String name1, String name2, Timestamp anfang, Timestamp ende) {
        Begegnung begegnung = new Begegnung(getPerson(name1), getPerson(name2));
        Zeitraum zeitraum = new Zeitraum(anfang, ende);
        begegnungen.put(getPerson(name1), getPerson(name2));
        begegnungHashMap.put(begegnung, zeitraum);
    }

    /**
     * Die addBesuch funktioniert auch wie die addBegegnungen, einziger Unterschied Besuche ist eine Person mit einen Ort,
     * statt zwei Personen
     */

    public void addBesuch(Person person, Ort ort, Timestamp anfang, Timestamp ende){
        Besuch besuch = new Besuch(person, ort);
        Zeitraum zeitraum = new Zeitraum(anfang, ende);
        besuche.put(person, ort);
        besuchHashMap.put(besuch, zeitraum);
    }

    /**
     * Wie soll man die Person und den Ort nur mit Name eindeutig feststellen?
     */

    public void addBesuch(String namePerson, String nameOrt, Timestamp anfang, Timestamp ende){
        Besuch besuch = new Besuch(getPerson(namePerson), getOrt(nameOrt));
        Zeitraum zeitraum = new Zeitraum(anfang, ende);
        besuche.put(getPerson(namePerson), getOrt(nameOrt));
        besuchHashMap.put(besuch, zeitraum);

    }

    /**
     * Mit der Set<Person> bekomme ich die Values der Person, also die besuchten Orte.
     */

    public List<Ort> besuchteOrte(Person person){
        ArrayList<Ort> orte = new ArrayList<>();
        Set<Person> set1 = besuche.keySet();

        /**
         * Die for-Schleife läuft das gesamte set1 durch und vergleicht die Keys - also die Person in der HashMap - mit
         * der angegbenen Person. Wird er fündig fügt er den dazugehörigen Ort einer Liste zu, sucht aber weiter, da es
         * auch mehrere Besuche der gleichen Person geben kann
         */

        for (Person i: set1){
            if(i.equals(person)){
                orte.add(besuche.get(i));
                System.out.println(besuche.get(i));
            }
        }
        return orte;
    }

    /**
     * Die begegnetePersonen arbeitet ähnlich wie die besuchteOrte, nur dass die HashMap zwei Personen beinhaltet.
     * Daher muss man auch beide Seiten überprüfen. In der ersten for-Schleife werden die Keys mit der eingegebenen Person
     * abgeglichen und dann der entsprechende Value der Liste hinzugefügt
     */

    public List<Person> begegnetePersonen(Person person){
        ArrayList<Person> personen = new ArrayList<>();
        Set<Person> set2 = begegnungen.keySet();
        for (Person i: set2){
            if(i.equals(person)){
                personen.add(begegnungen.get(i));
                System.out.println(begegnungen.get(i));
            }
        }

        /**
         * In der zweiten for-Schleife werden die Values überprüft und der entsprechende Key wird der Personenliste hinzugefügt.
         * Mit der zweiten Schleife wird egalisiert, an welcher Stelle welche Person in der addBegegnung eingetragen wird.
         */

        for (Person i: set2){
            if(begegnungen.get(i).equals(person)){
                personen.add(i);
                System.out.println(i);
            }
        }
        return personen;
    }

}
