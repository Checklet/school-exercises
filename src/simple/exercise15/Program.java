package simple.exercise15;

public class Program {
    public static void main(String[] args) {
        int health = 100;
        System.out.printf("Eugene hat %d Lebenspunkte.\n", health);

        while (health > 0) {
            health -= 20;
            System.out.printf("Eugene hat noch %d Lebenspunkte übrig.\n", health);

            if (health <= 0) {
                System.out.println("Eugene ist kampfunfähig.");
            }
        }
    }
}
