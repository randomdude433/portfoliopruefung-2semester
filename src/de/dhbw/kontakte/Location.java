package de.dhbw.kontakte;

public class Location {

    /**
     * Hier werden die benötigten Variablen für das Interface Ort erstellt
     */

    private int ortID;
    private String ortName;
    private String ortAdresse;

    public Location(int ortID) {
        ortID = this.ortID;

    }




    /**
     * Hier implementiere ich das Interface Ort
     */

    public int getOrtId() {
        return ortID;
    }

    public String getOrtName() {
        return this.ortName;
    }

    public String getOrtAdresse() {
        return this.ortAdresse;
    }

    public void setOrtID(int ortID){
        this.ortID = ortID;
    }

    public void setOrtName (String name){
        this.ortName = name;
    }

    public void setOrtAdresse (String adresse){
        this.ortAdresse = adresse;
    }
}
