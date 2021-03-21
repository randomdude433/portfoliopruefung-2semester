package de.dhbw.kontakte;

/** Interface für Personen mit eindeutiger ID und Kontaktdaten. **/
public interface Person {

    /** Liefert die ID der Person. **/
    public int getId();

    /** Liefert den Namen der Person.
     * 
     * Kann auch null sein.
     **/
    public String getName();

    /** Liefert die Adresse der Person.
     * 
     * Kann auch null sein.
     **/
    public String getAddress();

    /** Liefert die Telefonnummer der Person.
     * 
     * Kann auch null sein.
     **/
    public String getTel();

    /** Liefert die E-Mail-Adresse der Person.
     * 
     * Kann auch null sein.
     **/
    public String getEMail();
}
