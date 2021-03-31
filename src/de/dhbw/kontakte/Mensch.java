package de.dhbw.kontakte;

public class Mensch implements Person{

    private int id;
    private String name;
    private String adresse;
    private String tel;
    private String eMail;

    public Mensch(int id) {
        id = this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public void setTel(String tel){
        this.tel = tel;
    }

    public String getTel(){
        return this.tel;
    }

    public void setEMail(String eMail){
        this.eMail = eMail;
    }

    public String getEMail(){
        return this.eMail;
    }

}
