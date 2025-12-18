package simple.exercise10;

public class Program {
    public static void main(String[] args) {
        final int count = 10;
        final char ch = '$';

        for (int row = 1; row <= count; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
