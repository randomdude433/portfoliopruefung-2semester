package de.dhbw.kontakte;

import java.sql.Timestamp;

public class Kontakte {

        public static void main(String[] args) {

            /**
             * Hier in der Main erstelle ich erstmal die Listen, die wir als Datenbanken verwenden
             */
            Kontaktdaten k = new Kontaktdaten();

            /**
             * Zum Testen müssen wir zuerst Beispiel Objekte erstellen
             */

            Mensch nuller = new Mensch("null", null, null, null, true);
            Mensch jakob = new Mensch("Jakob", "Hünstetten", "32432546", "jakobthomas2@t-online.de", false);
            Mensch jakob2 = new Mensch("Jakob", "Wiesbaden", "4535434534", null, false);

            Location hollywood = new Location("L.A.", "Broadway");

            /**
             * Um diese Personen in die Datenbank aufzunehmen, muss man sie der entsprechenden Liste hinzufügen
             */

            k.addPerson(jakob);
            k.addPerson(nuller);
            k.addPerson(jakob2);
            k.addOrt(hollywood);
            k.addBegegnung(nuller, jakob, Timestamp.valueOf("2020-12-23 12:31:32"), Timestamp.valueOf("2020-12-24 15:34:12"));
            k.addBesuch(jakob, hollywood, Timestamp.valueOf("2020-12-23 12:31:32"), Timestamp.valueOf("2020-12-23 15:31:32"));
            k.besuchteOrte(jakob);
            k.begegnetePersonen(jakob);


            for(Person person: k.getPersonen("Jakob")){
                System.out.println(person);
            }

            /**
             * Zur Kontrolle kann man sich die Listen ausgeben lassen
             */

            System.out.println(k.personList +
                    "\n" + k.ortList +
                    "\n" + "BegegnungenTime" + k.begegnungHashMap +
                    "\n" + "Begegnungen: " +  k.begegnungen +
                    "\n" + "Besuche" + k.besuche);

            System.out.println(nuller);
            System.out.println(k.personList);



        }


    }

