package de.dhbw.kontakte;

import java.util.ArrayList;
import java.util.List;

/**
 *  Um die Interfaces nutzen zu können, müssen diese erst implementiert werden
 */

public class Kontakte implements KontaktDatenbank, Ort{

        /**
         * Hier werden die benötigten Variablen für das Interface KontaktDatenbank erstellt
         */

        public ArrayList<Person> personList = new ArrayList<>();
        public ArrayList<Ort> ortList = new ArrayList<>();
        public ArrayList<Begegnung> begegnungen = new ArrayList<>();
        public ArrayList <Besuch> besuche = new ArrayList<>();

        public Mensch mensch;


        /**
         * Hier werden die benötigten Variablen für das Interface Ort erstellt
         */

        private int ortID = this.getOrtId();
        private String ortName = this.getOrtName();
        private String ortAdresse = this.getOrtAdresse();
        private Ort ort = this.getOrt(this.ortID);


        /**
         * Hier erstelle ich Elemente der Klasse Besuch, um bei addBesuch ein Element der Klasse Besuch hinzuzufügen
         */

        Besuch besuchID = new Besuch(getPerson(mensch.getId()), getOrt(getOrtId()));
        Besuch besuchName = new Besuch(getPerson(mensch.getName()), getOrt(getOrtName()));

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
            personList.add(person);
        }
        public Person getPerson(int id){
            return mensch;
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
            return ort;
        }

        public Ort getOrt(String ortName){
            return ort;
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

        /**
         * Hier implementiere ich das Interface Ort
         */

        public int getOrtId() {
            return this.ortID;
        }

        public String getOrtName() {
            return this.ortName;
        }

        public String getOrtAdresse() {
            return this.ortAdresse;
        }

        public void ortToSting(){
            System.out.println( "Ort ID " + ortID + " Name: " + ortName + " Adresse: " + ortAdresse);
        }


        /**
         * Hier besteht weiterhin die Main-Funktion
         */

        public static void main(String[] args) {

            /**
             * Hier in der Main erstelle ich erstmal die Listen, die wir als Datenbanken verwenden
             */

            ArrayList<Person> personList = new ArrayList<>();
            ArrayList<Ort> ortList = new ArrayList<>();
            ArrayList<Begegnung> begegnungen = new ArrayList<>();
            ArrayList <Besuch> besuche = new ArrayList<>();

            /**
             * Zum Testen müssen wir zuerst Beispiel Objekte erstellen
             */

            Mensch jakob = new Mensch(1);
            jakob.setName("Jakob");
            personList.add(jakob);
            System.out.println(personList);


        }


    }

