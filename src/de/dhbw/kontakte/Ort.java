package de.dhbw.kontakte;

/** Interface für Orte mit eindeutiger ID und Kontaktdaten. **/
public interface Ort {
    /** Liefert die ID des Ortes.
     * 
     * Die ID muss existieren (darf nicht null sein) und
     * sie muss auch über alle Ort-Datensätze hinweg eindeutig sein.
     **/
    public int getOrtId();

    /** Liefert den Namen des Ortes.
     * 
     * Darf auch null sein.
     **/
    public String getOrtName();

    /** Liefert die Adresse des Ortes.
     * 
     * Darf auch null sein.
     **/
    public String getOrtAdresse();

}
