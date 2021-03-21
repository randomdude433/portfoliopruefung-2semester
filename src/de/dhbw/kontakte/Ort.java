package de.dhbw.kontakte;

public interface Ort {
    /** Liefert die ID des Ortes.
     * 
     * Die ID muss existieren (darf nicht null sein) und
     * sie muss auch über alle Ort-Datensätze hinweg eindeutig sein.
     **/
    public int getId();

    /** Liefert den Namen des Ortes.
     * 
     * Darf auch null sein.
     **/
    public String getName();

    /** Liefert die Adresse des Ortes.
     * 
     * Darf auch null sein.
     **/
    public String getAddress();
}
