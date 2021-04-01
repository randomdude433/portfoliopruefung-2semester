package de.dhbw.kontakte;

public class GesundePerson implements Person{

    private int id;
    private String name;
    private String adresse;
    private String tel;
    private String eMail;

    public GesundePerson(int id) {
        id = this.id;
    }
    public Boolean istGesund(){
        return true;
    }

    public int getId(){
        return this.id + 1;
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

    @Override
    public String toString() {
        return "Gesunde Person " +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", adresse = '" + adresse + '\'' +
                ", tel = '" + tel + '\'' +
                ", eMail = '" + eMail + '\'' +
                '}';
    }
}
