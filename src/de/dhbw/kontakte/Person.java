package de.dhbw.kontakte;

/** Interface für Personen mit eindeutiger ID und Kontaktdaten. **/
public interface Person {

    /** Liefert die ID der Person.
     * 
     * Die ID muss existieren (darf nicht null sein) und
     * sie muss auch über alle Personen-Datensätze hinweg eindeutig sein.
     **/
    public int getId();

    /** Liefert den Namen der Person.
     * 
     * Darf auch null sein.
     **/
    public String getName();

    /** Liefert die Adresse der Person.
     * 
     * Darf auch null sein.
     **/
    public String getAdresse();

    /** Liefert die Telefonnummer der Person.
     * 
     * Darf auch null sein.
     **/
    public String getTel();

    /** Liefert die E-Mail-Adresse der Person.
     * 
     * Darf auch null sein.
     **/
    public String getEMail();
}
