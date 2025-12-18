package simple.exercise6;

public class Program {
    public static void main(String[] args) {
        for (int x = -10; x <= 10; x++) {
            System.out.printf("f(%d) = %d   g(%d) = %d\n", x, x * 3 + 2, x, x * x - 2 * x - 10);
        }
    }
}
