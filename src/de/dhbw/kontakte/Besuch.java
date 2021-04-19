package de.dhbw.kontakte;

public class Besuch {

    /**
     * Die Klasse Besuch dient dazu, dass man der HashMap für die besuchten Orte, einen Besuch und noch einen Zeitraum
     * hinzufügen kann.
     */

    private Person person;
    private Ort ort;

    public Besuch (Person person, Ort ort){
        this.person = person;
        this.ort = ort;
    }
}
