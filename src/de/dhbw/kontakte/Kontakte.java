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
             */

            Mensch nuller = new Mensch("null", null, null, null);
            Mensch jakob = new Mensch("Jakob", "Hünstetten", "32432546", "jakobthomas2@t-online.de");


            /**
             * Um diese Personen in die Datenbank aufzunehmen, muss man sie der entsprechenden Liste hinzufügen
             */

            k.addPerson(jakob);
            k.addPerson(nuller);

            /**
             * Zur Kontrolle kann man sich die Listen ausgeben lassen
             */

            System.out.println(k.personList +
                    "\n" + k.ortList +
                    "\n" + k.personArrayList +
                    "\n" + k.begegnungen +
                    "\n" + k.besuche);

            System.out.println(nuller);
            System.out.println(k.personList);



        }


    }

