package de.dhbw.kontakte;

import java.util.List;
import java.sql.Timestamp;


/** Interface für die Kontakt-Datenbank.
 * 
 * Enthält Funktionen zum hinzufügen von Personen und Orten sowie zum Erfassen
 * von Begegnungen zwischen Personen und dem Besuch von Orten.
 **/
public interface KontaktDatenbank {
    
    /** Fügt eine Person zur Datenbank hinzu. **/
    public void addPerson(Person person);

    /** Liefert die Person mit der angegebenen ID. **/
    public Person getPerson(int id);

    /** Liefert die Person mit dem angegebenen Namen. **/
    public Person getPerson (String name);

    /** Liefert alle Personen mit dem angegebenen Namen. **/
    public List<Person> getPersonen(String name);

    /** Fügt einen Ort zur Datenbank hinzu. **/
    public void addOrt(Ort ort);

    /** Liefert den Ort mit der angegebenen ID. **/
    public Ort getOrt(int id);

    /** Registriert eine Begegnung zwischen zwei Personen. **/
    public void addBegegnung(Person person1, Person person2, Timestamp timestamp, Timestamp timestamp2);

    /** Registriert eine Begegnung zwischen zwei Personen anhand der Namen. **/
    public void addBegegnung(String name1, String name2, Timestamp timestamp, Timestamp timestamp2);

    /** Registriert einen Besuch einer Person an einem Ort. **/
    public void addBesuch(Person person, Ort ort, Timestamp anfang, Timestamp ende);

    /** Registriert einen Besuch einer Person an einem Ort anhand der Namen. **/
    public void addBesuch(String namePerson, String nameOrt, Timestamp anfang, Timestamp ende);

    /** Liefert eine Liste der Orte, die eine Person besucht hat. **/
    public List<Ort> besuchteOrte(Person person);

    /** Liefert eine Liste der Personen, denen eine Person begegnet ist. **/
    public List<Person> begegnetePersonen(Person person);
}
