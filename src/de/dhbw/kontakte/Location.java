package de.dhbw.kontakte;

import java.util.Random;

public class Location implements Ort{

    private int ortID;
    private String ortName;
    private String ortAdresse;
    private int eid;

    public Location(String ortName, String ortAdresse) {
        this.ortID = erstelleID();
        this.ortName = ortName;
        this.ortAdresse = ortAdresse;
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

    public int erstelleID(){
        Random random = new Random();
        eid = random.nextInt();
        if(eid <= 0 || eid == getOrtId()){
            erstelleID();
        } else {
            System.out.println(eid);
        }
        return eid;
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
