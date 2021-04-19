package de.dhbw.kontakte;

public class Begegnung {

    /**
     * Die Klasse Begegnung dient dazu, dass man der HashMap für die begegneten Personen, eine Begegnung und noch einen
     * Zeitraum hinzufügen kann.
     */

    private Person person1;
    private Person person2;

    public Begegnung(Person person1, Person person2){
        this.person1 = person1;
        this.person2 = person2;
    }

    @Override
    public String toString() {
        return "Begegnung{" +
                "person1=" + person1 +
                ", person2=" + person2 +
                '}';
    }
}
