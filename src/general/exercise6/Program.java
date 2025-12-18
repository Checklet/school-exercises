package general.exercise6;

public class Program {
    public static void main(String[] args) {
        int count1 = 0;
        int count6 = 0;
        int sum = 0;

        for (int round = 0; round < 10; round++) {
            int current = (int) (Math.random() * 6) + 1;

            for (int cur = 0; cur < current; cur++) {
                System.out.print("• ");
            }

            System.out.printf("(%d)\n", current);

            if (current == 1) {
                count1++;
            }

            if (current == 6) {
                count6++;
            }

            sum += current;
        }

        System.out.printf("Es wurde %d-mal die 1 gewüfelt.\n", count1);
        System.out.printf("Es wurde %d-mal die 6 gewüfelt.\n", count6);
        System.out.printf("Der Durchschnitt beträgt %.2f.\n", sum / 10.0);
    }
}
