package objectoriented.exercise01;

// Aufgabe 5
public class Railway {

    // Aufgabe 6
    Train train;

    // Aufgabe 7
    void enter(Train train) {

        // Aufgabe 10
        if (!isOccupied()) {
            this.train = train;
        }
    }

    // Aufgabe 8
    void leave() {
        this.train = null;
    }

    // Aufgabe 9
    boolean isOccupied() {
        return train != null;

        /* Alternative:

        if (train == null) {
            return false;
        } else {
            return true;
        }

         */
    }
}
