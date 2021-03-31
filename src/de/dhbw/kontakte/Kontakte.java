package de.dhbw.kontakte;

import java.util.ArrayList;
import java.util.List;

/**
 *  Um die Interfaces nutzen zu können, müssen diese erst implementiert werden
 */

public class Kontakte implements KontaktDatenbank, Ort, Person{

        /**
         * Hier werden die benötigten Variablen für das Interface KontaktDatenbank erstellt
         */

        private ArrayList<Person> personList = new ArrayList<>();
        private ArrayList<Ort> ortList = new ArrayList<>();
        private ArrayList<Begegnung> begegnungen = new ArrayList<>();
        private ArrayList <Besuch> besuche = new ArrayList<>();


        /**
         * Hier werden die benötigten Variablen für das Interface Ort erstellt
         */

        private int ortID = this.getOrtId();
        private String ortName = this.getOrtName();
        private String ortAdresse = this.getOrtAdresse();
        private Ort ort = this.getOrt(this.ortID);

        /**
         * Hier werden die benötigten Variablen für das Interface Person erstellt
         */

        private int id = this.getId();
        private String name = this.getName();
        private String adresse = this.getAdresse();
        private String tel = this.getTel();
        private String eMail = this.getEMail();
        private Person person = this.getPerson(this.id);

        /**
         * Hier erstelle ich Elemente der Klasse Besuch, um bei addBesuch ein Element der Klasse Besuch hinzuzufügen
         */

        Besuch besuchID = new Besuch(getPerson(getId()), getOrt(getOrtId()));
        Besuch besuchName = new Besuch(getPerson(getName()), getOrt(getOrtName()));

        /**
        * Hier erstelle ich Elemente der Klasse Besuch, um bei addBesuch ein Element der Klasse Begegnung hinzuzufügen
        */

        Begegnung begegnung1 = new Begegnung(getPerson(getId()), getPerson(getId()));
        Begegnung begegnung2 = new Begegnung(getPerson(getName()), getPerson(getName()));


        /**
         * Im folgenden Abschnitt implementiere ich das Interface für KontaktDatenbanken
         *
         * Dafür muss jede Funktion aus KontaktDatenbanken hier formuliert werden.
         * */

        public void addPerson(Person person){
            personList.add(person);
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
            ortList.add(ort);
        }

        public Ort getOrt(int id){
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

        /**
         * Hier implementiere ich das Interface Person in diese Klasse
         **/

        public int getId(){
            return this.id;
        }
        public String getName(){
            return this.name;
        }
        public String getAdresse(){
            return this.adresse;
        }
        public String getTel(){
            return this.tel;
        }
        public String getEMail(){
            return this.eMail;
        }

        /**
         * Hier besteht weiterhin die Main-Funktion
         */

        public static void main(String[] args) {
            System.out.println("Hello World");
        }


    }