package objectoriented.exercise02;

// Aufgabe 3
public class EMail {

    // Aufgabe 4
    Person recipient;
    Person sender;
    String subject;

    // Aufgabe 5
    String content;

    // Aufgabe 6
    void setSubject(String subject) {
        this.subject = subject;
    }

    void setContent(String content) {
        this.content = content;
    }

    // Aufgabe 7
    void setSender(Person sender) {
        this.sender = sender;
    }

    void setRecipient(Person recipient) {
        this.recipient = recipient;
    }

    // Aufgabe 8
    void setSender(String email) {
        this.sender = new Person("-", email);
    }

    void setRecipient(String email) {
        this.recipient = new Person("-", email);
    }

    // Aufgabe 10
    void send() {
        sender.send(this);
        recipient.receive(this);
    }

    @Override
    public String toString() {
        return String.format(
            "Von %s (%s)\nAn %s (%s)\n\n\t%s\n\n%s\n",
            sender.name,
            sender.email,
            recipient.name,
            recipient.email,
            subject,
            content
        );
    }
}
