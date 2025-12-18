# Aufgabe 1

Erstellen Sie eine Klasse `Person`, die eine Person repräsentieren soll. Der Name und die E-Mail-Adresse der Person soll
gespeichert werden.

# Aufgabe 2

Erstellen Sie einen Konstruktor für `Person`, um die Attribute zu befüllen.

# Aufgabe 3

Erstellen Sie eine Klasse `EMail`, die eine E-Mail darstellen soll.

# Aufgabe 4

Jede E-Mail soll einen Verkehr von Informationen (Text) zwischen zwei Personen darstellen. Geben Sie `EMail` die
passenden Attribute.

# Aufgabe 5

Geben die `EMail` ebenfalls das Attribut `subject` (Betreff).

# Aufgabe 6

Implementieren Sie für `EMail` für den Inhalt und den Betreff eine *Setter*-Methode.

# Aufgabe 7

Implementieren Sie für `EMail` jeweils eine Methode, die eine Variable vom Typ `Person` annimmt, um den Sender/Empfänger
zuzuweisen.

# Aufgabe 8

Implementieren Sie ebenfalls dieselbe Methode für `EMail`, die nur die E-Mail-Adresse annimmt, und eine neue Person in
der Methode erstellt und speichert (es kann ein Platzhalter wie "-" genutzt werden als Name).

# Aufgabe 9

Implementieren Sie für `Person` eine Methode, die eine Benachrichtigung gibt (eine Ausgabe in die Konsole), wenn eine
E-Mail von einer Person versendet wurde, und ebenfalls wenn eine empfangen wurde.

# Aufgabe 10

Implementieren Sie für `EMail` eine Methode, die die E-Mail sendet (der Sender und Empfänger bekommen entsprechend eine
Benachrichtigung).

# Aufgabe 11

Überscheiben Sie die `toString()`-Methode von `EMail` um eine E-Mail im folgenden Format zu beschreiben:

```
Von <Sendername> (<Sender-E-Mail-Adresse>)
An <Empfängername> (<Empfänger-E-Mail-Adresse>)

    <Betreff>
    
<Inhalt>
```

*Nutzen Sie idealerweise die Funktion `String.format()`.*

