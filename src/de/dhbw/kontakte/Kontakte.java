package de.dhbw.kontakte;

import java.util.*;
import java.util.List;

/**
 *  Um die Interfaces nutzen zu können, müssen diese erst implementiert werden
 *
 *  In Kontakte implementiere ich die KontaktDatenbanken
 */

public class Kontakte implements KontaktDatenbank{

        /**
         * Hier werden die benötigten Variablen für das Interface KontaktDatenbank erstellt
         */

        public List<Person> personList = new ArrayList<>();
        public List<Person> gesundePeople = new ArrayList<>();
        public List<Person> erkranktePeople = new ArrayList<>();
        public ArrayList<Location> ortList = new ArrayList<>();
        public ArrayList<Begegnung> begegnungen = new ArrayList<>();
        public ArrayList <Besuch> besuche = new ArrayList<>();
        public Person person;
        public Location location;

        /**
         * Hier erstelle ich Elemente der Klasse Besuch, um bei addBesuch ein Element der Klasse Besuch hinzuzufügen
         */

        Besuch besuchID = new Besuch(getPerson(person.getId()), getOrt(location.getOrtId()));
        Besuch besuchName = new Besuch(getPerson(person.getName()), getOrt(location.getOrtName()));

        /**
         * Im folgenden Abschnitt implementiere ich das Interface für KontaktDatenbanken
         *
         * Dafür muss jede Funktion aus KontaktDatenbanken hier formuliert werden.
         */

        /**
         * Die addPerson kann zwischen Erkrankten und nicht Erkrankten unterscheiden.
         *
         * Wenn das nicht angegeben ist, wird die Person weder als Krank, noch als Gesund gekennzeichnet
         */

        public void addPerson(Person person){
            if (person.istGesund() == true){
                this.gesundePeople.add(this.person);
                this.personList.add(this.person);
            } else if (person.istGesund() == false){
                this.erkranktePeople.add(this.person);
                this.personList.add(this.person);
            } else {
                this.personList.add(person);
            }
        }

        public Person getPerson(int id){
            return person;
        }

        public Person getPerson (String name){
            return person;
        }

        public List<Person> getPersonen(String name){
            return personList;
        }

        public void addOrt(Ort ort) {
            ortList.add(location);
        }

        public Location getOrt(int ortID){
            return location;
        }

        public Location getOrt(String ortName){
            return location;
        }

    /**
     * Hier erstelle ich Elemente der Klasse Besuch, um bei addBesuch ein Element der Klasse Begegnung hinzuzufügen
     */

    Begegnung begegnung1 = new Begegnung(getPerson(person.getId()), getPerson(person.getId()));
    Begegnung begegnung2 = new Begegnung(getPerson(person.getName()), getPerson(person.getName()));

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

        /**
         * Hier besteht weiterhin die Main-Funktion
         */

        public static void main(String[] args) {

            /**
             * Hier in der Main erstelle ich erstmal die Listen, die wir als Datenbanken verwenden
             */
            ArrayList<Person> kontakte = new ArrayList<>();
            ArrayList<Person> personList = new ArrayList<>();
            ArrayList<GesundePerson> gesundePeople = new ArrayList<>();
            ArrayList<ErkranktePerson> erkranktePeople = new ArrayList<>();
            ArrayList<Ort> ortList = new ArrayList<>();
            ArrayList<Begegnung> begegnungen = new ArrayList<>();
            ArrayList <Besuch> besuche = new ArrayList<>();

            /**
             * Zum Testen müssen wir zuerst Beispiel Objekte erstellen
             *
             * in dem Fall Jakob und Linus. Eine ID wird immer benötigt.
             */

            GesundePerson jakob = new GesundePerson(10);
            GesundePerson linus = new GesundePerson(2);
            ErkranktePerson benjamin = new ErkranktePerson(1);
            Begegnung begegnung1 = new Begegnung(jakob, benjamin);


            /**
             * Alle anderen Variablen können hinzugefügt werden
             */

            jakob.setName("Jakob");
            jakob.setId(1);
            linus.setAdresse("Hünstetten");
            benjamin.setName("Benjamin");
            benjamin.setId(3);
            begegnungen.add(begegnung1);

            /**
             * Um diese Personen in die Datenbank aufzunehmen, muss man sie der entsprechenden Liste hinzufügen
             */

            personList.add(jakob);
            gesundePeople.add(jakob);
            personList.add(linus);
            gesundePeople.add(linus);
            personList.add(benjamin);
            erkranktePeople.add(benjamin);

            /**
             * Zur Kontrolle kann man sich die Listen ausgeben lassen
             */

            System.out.println("Registrierte Personen: " + personList);
            System.out.println( "Gesunde Personen: " + gesundePeople);
            System.out.println("Erkrankte Personen: " + erkranktePeople);
            System.out.println("Registrierte Begegnungen: " + begegnungen);




        }


    }

