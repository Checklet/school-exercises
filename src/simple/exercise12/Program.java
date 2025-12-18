package simple.exercise12;

public class Program {
    public static void main(String[] args) {
        for (int num = 1; num <= 30; num++) {
            if (num % 2 == 0) {
                System.out.printf("%d ist durch 2 teilbar.\n", num);
            } else {
                System.out.printf("%d ist nicht durch 2 teilbar.\n", num);
            }
        }
    }
}
