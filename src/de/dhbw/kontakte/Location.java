package de.dhbw.kontakte;

import java.util.Random;

public class Location implements Ort{

    private static int zähler = 1;
    private int ortID;
    private String ortName;
    private String ortAdresse;
    private int eid;

    public Location(String ortName, String ortAdresse) {
        this.ortID = zähler;
        this.ortName = ortName;
        this.ortAdresse = ortAdresse;
        zähler++;
    }

    /**
     * Hier werden die benötigten Variablen für das Interface Ort erstellt
     */



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

    @Override
    public String toString() {
        return "Location {" +
                "ortID = " + ortID +
                ", ortName = '" + ortName + '\'' +
                ", ortAdresse = '" + ortAdresse + '\'' +
                '}';
    }
}
