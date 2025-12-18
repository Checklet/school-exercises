package general.exercise1;

public class Program {
    public static void main(String[] args) {
        int num = 40289;

        if (num > 1000 || num < -1000) {
            System.out.printf("Der Betrag der Zahl %d ist zu groß.\n", num);
        } else {
            System.out.printf("Das Doppelte der Zahl %d ist %d.\n", num, num * 2);
            System.out.printf("Das Quadrat der Zahl %d ist %d.\n", num, num * num);
        }
    }
}
