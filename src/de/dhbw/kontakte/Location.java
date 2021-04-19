package de.dhbw.kontakte;


public class Location implements Ort{

    /**
     * Ein statischer Zähler, der dem ersten Ort als ortID gegeben wird. Jedes Mal wenn ein neuer Ort erstellt wird,
     * erhöht der Zähler sich. Somit hat jeder neue Ort, die nächst höhere ID
     */

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
