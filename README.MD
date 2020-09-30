# DoStuff Web App

## Aufgaben

* Planen von Aufgaben
* Kontrollieren von Aufgaben
* Ändern von Aufgaben 
* Verteilen von Aufgaben


# Seiten Status

### Home

Features:
* Anzeigen der aktuellen Uhrzeit :ok_hand: und das Wetter
* Anzeigen ~~heutiger aller Aufgaben~~ heutiger Aufgaben :ok_hand:
* Begrüssen des Nutzers :ok_hand:

### Planen

Features:
* Schöneres UI :ok_hand:
* Hinzufügen eines Task :ok_hand:
    * Beschreibung eingeben :ok_hand:
        * Begrenzung Anzeigen(0-50 Zeichen)
    * Datum Eingabe :ok_hand:
    * Wiederholungen Dropdown :ok_hand:
        * Auswahl vom Dropdown mit Text :ok_hand:
        * Backend Text → ID  :ok_hand:
    * Personen Zuordnung  :ok_hand:
        * Auswahl mit Dropdown :ok_hand:
        * Backend Person → ID :ok_hand:
    * Speichern :ok_hand:


### Ändern

* Liste aller Task ~~mit an klickbaren Link~~ Button für weiter Anpassung :ok_hand:
    * Jedes Element soll ein :wastebasket: Symbol beinhalten dieser soll mit einer Bestätigung verknüpft sein um dann zu löschen :ok_hand:
* Anklickbarer Link bringt auf eine Planung ähnlich Seite mit vor eingetragenen Werten, diese können dort angepasst werden :ok_hand:

### Kiosk

* Liste aller Kiosks die mit dem System verbunden sind :ok_hand:
* Knöpfe zum ~~Restarten,~~ Reload des Kiosk(Rest API?) :ok_hand:
    * Logic ist Implementiert, muss nur noch umgesetzt werden auf dem Kiosk

## Backend

* CronJob der jeweils um 0:00 alle Task löscht die auf heutiges Datum waren, Task die eine Wiederholung haben werden erweitert :ok_hand:



## Rest API Links

[ip]:12000/erledigt?id=[id] | DB Eintrag wird auf Erledigt oder Unerledigt gesetzt gesetzt

[ip]:12000/ip?ip=[ip]&hostname=[hostname] | IP wird Eingetragen in die Kiosk DB

## ~~Kiosk Rest API Links~~

[ip]~~:12500/?reload | Force Reloaden der Kiosk Einträge~~
