package objectoriented.exercise02;

// Aufgabe 1
public class Person {
    String name;
    String email;

    // Aufgabe 2
    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Aufgabe 9
    void send(EMail mail) {
        System.out.printf("E-Mail gesendet an %s.\n", mail.recipient.name);
    }

    void receive(EMail mail) {
        System.out.printf("E-Mail empfangen von %s.\n", mail.sender.name);
    }
}