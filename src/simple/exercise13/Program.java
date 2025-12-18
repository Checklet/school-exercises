package simple.exercise13;

public class Program {
    public static void main(String[] args) {
        for (int num = 1; num <= 30; num++) {
            if (num % 2 == 0) {
                System.out.printf("%d ist durch 2 teilbar.\n", num);
            }

            if (num % 3 == 0) {
                System.out.printf("%d ist durch 3 teilbar.\n", num);
            }

            if (num % 5 == 0) {
                System.out.printf("%d ist durch 5 teilbar.\n", num);
            }
        }
    }
}
