# DoStuff Web App

## Aufgaben

* Planen von Aufgaben
* Kontrollieren von Aufgaben
* Ändern von Aufgaben 
* Verteilen von Aufgaben


# Seiten Status

### Home

Features:
* Anzeigen der aktuellen Uhrzeit und das Wetter
* Anzeigen heutiger Aufgaben :ok_hand:
* Begrüssen des Nutzers :ok_hand:

### Planen

Features:
* Schöneres UI
* Hinzufügen eines Task
    * Beschreibung eingeben :ok_hand:
        * Begrenzung Anzeigen(0-50 Zeichen)
    * Datum Eingabe :ok_hand:
    * Wiederholungen Dropdown
        * Auswahl vom Dropdown mit Text
        * Backend Text → ID 
    * Personen Zuordnung 
        * Auswahl mit Dropdown
        * Backend Person → ID
    * Speichern 


### Ändern

* Liste aller Task mit an klickbaren Link für weiter Anpassung
    * Jedes Element soll ein :wastebasket: Symbol beinhalten dieser soll mit einer Bestätigung verknüpft sein
* Anklickbarer Link bringt auf eine Planung ähnlich Seite mit vor eingetragenen Werten, diese können dort angepasst werden

### Kiosk

* Liste aller Kiosks die mit dem System verbunden sind
* Knöpfe zum Restarten, Reload des Kiosk(Rest API?)

## Backend

* CronJob der jeweils um 0:00 alle Task löscht die auf heutiges Datum waren, Task die eine Wiederholung haben werden erweitert

