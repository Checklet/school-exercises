package exercise7;

public class Program {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;

        int lcm = a * b;
        int ma = b;
        int mb = a;

        for (int multipleA = 0; multipleA < b; multipleA++) {
            for (int multipleB = 0; multipleB < a; multipleB++) {
                if (multipleA * a == multipleB * b) {
                    lcm = multipleA * a;
                    ma = multipleA;
                    mb = multipleB;
                    break;
                }
            }
        }

        System.out.printf("Das kleinste gemeinsame Vielfache von %d und %d ist %d.\n", a, b, lcm);
        System.out.printf("( %d * %d = %d ) und ( %d * %d = %d )\n", a, ma, lcm, b, mb, lcm);
    }
}
