package general.exercise5;

public class Program {
    public static void main(String[] args) {
        int size = 2;
        char border = '.';

        for (int topBorder = 0; topBorder < size + 2; topBorder++) {
            System.out.print(border);
        }
        System.out.println();

        for (int space = 0; space < size; space++) {
            System.out.print(border);
            for (int inside = 0; inside < size; inside++) {
                System.out.print(' ');
            }
            System.out.print(border);
            System.out.println();
        }

        for (int lowerBorder = 0; lowerBorder < size + 2; lowerBorder++) {
            System.out.print(border);
        }
        System.out.println();
    }
}
