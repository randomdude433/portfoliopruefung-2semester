# Aufgaben für die Kontaktverfolgungs-Aufgabe.

## Basis-Aufgaben

Im Quell-Ordner sind eine Main-Klasse und eine Reihe von *Interfaces* vorgegeben.
Ein Interface ist sozusagen eine leere Klassenvorlage, die vorgibt, welche Methoden
eine Klasse haben muss.

Ihre Aufgaben bestehen zunächst darin, diese Interfaces zu implementieren,
d. h. Sie sollen Klassen bereitstellen, die die Methoden der Interfaces implementieren.

Dabei verwendet man das Schlüsselwort ```implements```, um dem Compiler
mitzuteilen, dass man ein bestimmtes Interface implementiert.
Der Compiler prüft dann den eigenen Code darauf, ob das Interface korrekt 
umgesetzt wurde.

Ihre Klassen dürfen darf neben den vom Interface vorgegebenen Methoden noch weitere
enthalten, wenn Sie das für sinnvoll halten.

Am Ende dieses Abschnitts sollte eine einfache, funktionierende Anwendung stehen,
mit der Kontakte/Begegnungen zwischen Personen registriert und abgefragt werden können.

### Implementieren Sie das Interface ```Person```.

Implementieren Sie das Interface ```Person``` aus der Datei ```Person.java```.

Der Konstruktor muss die Eindeutigkeit der ID garantieren.
Überlegen Sie sich, wie Sie dies erreichen können.


### Implementieren Sie das Interface ```Ort```.

Implementieren Sie das Interface ```Ort``` aus der Datei ```Ort.java```.

Der Konstruktor muss die Eindeutigkeit der ID garantieren.
Überlegen Sie sich, wie Sie dies erreichen können.

### Implementieren Sie das Interface ```KontaktDatenbank```.

Implementieren Sie das Interface ```KontaktDatenbank```
aus der Datei ```KontaktDatenbank.java```.

Überlegen Sie sich, welche Datenstrukturen Sie intern verwenden
wollen, um die Methoden möglichst einfach/effizient zu implementieren.

### Schreiben Sie eine Demo-Anwendung zur Kontaktverfolgung.

Schreiben Sie ein Programm, das die Funktionalität der Kontaktverfolgung demonstriert.
Das Programm sollte folgende Möglichkeiten bieten:

- Hinzufügen von Orten und Personen zur Datenbank.
- Registrieren von Begegnungen und Ortsbesuchen.
- Abfragen von Begegnungen und Ortsbesuchen.


## Erweiterung des Systems

Bei den folgenden Aufgaben geht es darum, die Funktionalität des Grundsystems zu
erweitern und zu verbessern.
Um diese Aufgaben zu erfüllen, müssen die Interfaces und Klassen des Grundsystems
ggf. verändert/erweitert werden.

### Daten und/oder Uhrzeiten bei Begegnungen und Besuchen.

Für eine effektivere Kontaktverfolgung wäre es sinnvoll, bei Begegnungen und Besuchen
ein Datum oder evtl. sogar eine Uhrzeit zu erfassen.

Erweitern Sie also die Methoden des Grundsystems so, dass man ggf. Datum und/oder
Uhrzeit mit erfassen und abfragen kann.

### Abfrage von Begegnungen/Besuchen zu Zeitpunkten oder Zeiträumen.

Fügen Sie die Möglichkeit hinzu, bei einer Abfrage eine Zeitangabe oder einen Zeitraum
anzugeben. Als Ergebnis sollen dann nur Begegnungen oder Besuche geliefert werden,
die zur Abfrage passen.

### Registrierung von Erkrankungen.

Fügen Sie die Möglichkeit hinzu, die Erkrankung einer Person zu erfassen.
Es sollte dann möglich sein, alle Personen zu bestimmen, denen diese Person in einem
gewissen Zeitraum begegnet ist.

### Demo-Anwendung der erweiterten Funktionalität.

Schreiben Sie eine Demo-App, die die gesamte zur Verfügung stehende Funktionalität
demonstriert. 


## Bonus- / Zusatzaufgaben

Die folgenden Aufgaben geben der Anwendung den letzten Schliff.
Sie sind teilweise komplizierter und sollten als Erweiterungsideen gesehen
werden. Wenn Ihnen andere interessante Erweiterungen/Verbesserungen einfallen,
können Sie gerne auch diese umsetzen.

### Abspeichern und Laden der Datenbank von/auf der Festplatte

Überlegen Sie sich ein Konzept zur Speicherung der Datenbank auf der Festplatte
und setzen Sie es um.
Sie können z. B. mit die Datenformate *JSON* oder *XML* verwenden.
Dazu müssten Sie sich einerseits mit den Formaten vertraut machen und andererseits
ggf. einen Parser für Ihr Format schreiben oder finden und verwenden.

### Grafische Benutzeroberfläche

Entwickeln Sie ein Graphical User Interface (GUI) für das System, z. B. mit JavaFX oder ein einfaches Webinterface.
