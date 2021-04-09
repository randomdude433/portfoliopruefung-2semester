package de.dhbw.kontakte;

import java.util.ArrayList;

public class Kontakte {

        public static void main(String[] args) {

            /**
             * Hier in der Main erstelle ich erstmal die Listen, die wir als Datenbanken verwenden
             */
            Kontaktdaten k = new Kontaktdaten();

            /**
             * Zum Testen müssen wir zuerst Beispiel Objekte erstellen
             *
             * in dem Fall Jakob und Linus. Eine ID wird immer benötigt.
             */

            Mensch jakob = new Mensch();
            Mensch linus = new Mensch();
            Location hollywood = new Location();

            /**
             * Alle anderen Variablen können hinzugefügt werden
             */

            jakob.setName("Jakob");
            linus.setAdresse("Hünstetten");
            linus.setName("Linus");

            /**
             * Um diese Personen in die Datenbank aufzunehmen, muss man sie der entsprechenden Liste hinzufügen
             */

            k.addPerson(jakob);
            k.addPerson(linus);
            System.out.println(k.personIDList + " " + k.personNameList + " " + k.personList);
            /**
             * Zur Kontrolle kann man sich die Liste ausgeben lassen
             */


        }


    }

