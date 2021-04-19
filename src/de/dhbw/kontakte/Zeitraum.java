package de.dhbw.kontakte;

import java.sql.Timestamp;

/**
 * Die Klasse Zeitraum dient dazu, dass man der HashMap für die besuchten Orte und der HashMap für die begegneten Personen,
 * eine/n Begegnung/Besuch und noch einen Zeitraum hinzufügen kann.
 */

public class Zeitraum {
    Timestamp anfang;
    Timestamp ende;

    public Zeitraum(Timestamp anfang, Timestamp ende) {
        this.anfang = anfang;
        this.ende = ende;
    }

    @Override
    public String toString() {
        return "Zeitraum{" +
                "anfang = " + anfang +
                ", ende = " + ende +
                '}';
    }
}
