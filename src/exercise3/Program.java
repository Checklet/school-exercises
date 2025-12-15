package exercise3;

public class Program {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 7, 10, 4, 6};

        int min = 10;
        int max = 0;
        int sum = 0;

        for (int cursor = 0; cursor < 5; cursor++) {
            if (nums[cursor] < min) {
                min = nums[cursor];
            }

            if (nums[cursor] > max) {
                max = nums[cursor];
            }

            sum += nums[cursor];
        }

        System.out.printf("Minimum: %d - Maximum: %d - Durchschnitt: %.2f\n", min, max, sum / 5.0);
    }
}
