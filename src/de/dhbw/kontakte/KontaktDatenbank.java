package de.dhbw.kontakte;

import java.util.List;

/** Interface für die Kontakt-Datenbank.
 * 
 * Enthält Funktionen zum hinzufügen von Personen und Orten sowie zum Erfassen
 * von Begegnungen zwischen Personen und dem Besuch von Orten.
 **/
public interface KontaktDatenbank {
    
    /** Fügt eine Person zur Datenbank hinzu. **/
    public void addPerson(Person person);

    /** Fügt einen Ort zur Datenbank hinzu. **/
    public void addOrt(Ort ort);

    /** Registriert eine Begegnung zwischen zwei Personen. **/
    public void addBegegnung(Person person1, Person person2);

    /** Registriert eine Begegnung zwischen zwei Personen anhand der Namen. **/
    public void addBegegnung(String name1, String name2);

    /** Registriert einen Besuch einer Person an einem Ort. **/
    public void addBesuch(Person person, Ort ort);

    /** Registriert einen Besuch einer Person an einem Ort anhand der Namen. **/
    public void addBesuch(String namePerson, String nameOrt);

    /** Liefert eine Liste der Orte, die eine Person besucht hat. **/
    public List<Ort> besuchteOrte(Person person);

    /** Liefert eine Liste der Personen, denen eine Person begegnet ist. **/
    public List<Person> begegnetePersonen(Person person);
}
