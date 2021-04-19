package de.dhbw.kontakte;

import java.util.Random;

public class Mensch implements Person{

    /**
     * Durch den Zähler, der nach Erstellung einer Person +1 macht, bekommt jede Person eine eigene ID
     */

    private static int zähler = 1;
    private int id;
    private String name;
    private String adresse;
    private String tel;
    private String eMail;
    private boolean erkrankt;

    public Mensch(String name, String adresse, String tel, String eMail, boolean erkrankt) {
        this.id = zähler;
        this.name = name;
        this.adresse = adresse;
        this.tel = tel;
        this.eMail = eMail;
        this.erkrankt = erkrankt;
        zähler++;
    }

    /**
     * Hier werden die Methoden für das Interface Person erstellt
     */

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public String getTel(){
        return this.tel;
    }

    public String getEMail(){
        return this.eMail;
    }

    @Override
    public String toString() {
        return "Mensch {" +
                "id = " + id +
                ", name = '" + this.name + '\'' +
                ", adresse = '" + this.adresse + '\'' +
                ", tel = '" + this.tel + '\'' +
                ", eMail = '" + this.eMail + '\'' +
                ", erkrankt = " + this.erkrankt + '\'' +
                '}';
    }
}
