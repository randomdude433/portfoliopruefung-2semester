package de.dhbw.kontakte;

public class Location implements Ort{

    public Location() {
        ortID = this.getOrtId();
        ortName = this.getOrtName();
        ortAdresse = this.getOrtAdresse();
    }

    /**
     * Hier werden die benötigten Variablen für das Interface Ort erstellt
     */

    private int ortID = this.getOrtId();
    private String ortName = this.getOrtName();
    private String ortAdresse = this.getOrtAdresse();

    /**
     * Hier implementiere ich das Interface Ort
     */

    public int getOrtId() {
        return this.ortID;
    }

    public void setOrtID(int ortID) {
        this.ortID = ortID;
    }

    public String getOrtName() {
        return this.ortName;
    }

    public void setOrtName(String ortName) {
        this.ortName = ortName;
    }

    public String getOrtAdresse() {
        return this.ortAdresse;
    }

    public void setOrtAdresse(String ortAdresse) {
        this.ortAdresse = ortAdresse;
    }

    public void ortToSting(){
        System.out.println( "Ort ID " + ortID + " Name: " + ortName + " Adresse: " + ortAdresse);
    }
}
