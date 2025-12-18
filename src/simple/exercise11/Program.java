package simple.exercise11;

public class Program {
    public static void main(String[] args) {
        final int count = 10;
        final char ch = '$';

        for (int row = count; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
