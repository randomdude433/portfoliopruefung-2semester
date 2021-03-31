package de.dhbw.kontakte;

public class Mensch implements Person{

    private int id;
    private String name;
    private String adresse;
    private String tel;
    private String eMail;

    public Mensch(int id) {
        id = this.getId();
        String name = this.getName();
        String adresse = this.getAdresse();
        String tel = this.getTel();
        String eMail = this.getEMail();
    }
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

}
