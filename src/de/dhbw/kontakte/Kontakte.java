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

    /**
     * Hier werden die benötigten Variablen für das Interface Person erstellt
     */

    private int id = this.getId();
        private String name = this.getName();
        private String adresse = this.getAdresse();
        private String tel = this.getTel();
        private String eMail = this.getEMail();


    /**
     * Hier erstelle ich Elemente der Klasse Besuch, um bei addBesuch ein Element der Klasse Besuch hinzuzufügen
     */

    Besuch besuch1 = new Besuch(getPerson(getId()), getOrt(getId()));

    /**
     * Im folgenden Abschnitt implementiere ich das Interface für KontaktDatenbanken
     *
     * Dafür muss jede Funktion aus KontaktDatenbanken hier formuliert werden.
     * */

    public void addPerson(Person person){
        personList.add(person);
    }
    public Person getPerson(int id){
        return personList.get(id);
    }

    public List<Person> getPersonen(String name){
        return this.getPersonen(getName());
    }

    public void addOrt(Ort ort) {
    }

    public Ort getOrt(int id){
        return getOrt(ortID);
    }

    public void addBegegnung(Person person1, Person person2){
    }

    public void addBegegnung(String name1, String name2){

    }

    public void addBesuch(Person person, Ort ort){
        besuche.add(besuch1);
    }

    public void addBesuch(String namePerson, String nameOrt){

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