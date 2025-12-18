package simple.exercise16;

public class Program {
    public static void main(String[] args) {
        int health = 100;
        System.out.printf("Eugene hat %d Lebenspunkte.\n", health);

        while (health > 0) {
            health -= 7;

            if (health > 20) {
                System.out.printf("Eugene hat noch %d Lebenspunkte übrig.\n", health);
            } else {
                if (health < 0) {
                    health = 0;
                }

                System.out.printf("Eugene hat nur noch %d Lebenspunkte übrig!\n", health);
            }

            if (health <= 0) {
                System.out.println("Eugene ist kampfunfähig.");
            }
        }
    }
}
