package general.exercise4;

public class Program {
    public static void main(String[] args) {
        String[] texts = new String[]{"Albert", "Benedict", "Charlotte", "Darius"};

        for (int current = 0; current < texts.length; current++) {
            String name = texts[current];

            if (name.length() > 6) {
                System.out.printf("%s hat einen langen Namen.\n", name);
            } else {
                System.out.printf("%s hat einen kurzen Namen.\n", name);
            }

            int count = 0;
            for (int cursor = 0; cursor < name.length(); cursor++) {
                if (name.charAt(cursor) == 't') {
                    count++;
                }
            }

            System.out.printf("%s hat auch %d-mal \"t\" in dem Namen.\n", name, count);
        }
    }
}
