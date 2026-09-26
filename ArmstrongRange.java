import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start = input.nextInt();
        int end = input.nextInt();

        for (int number = start; number <= end; number++) {
            int temp = number;
            int digits = 0;

            if (temp == 0) {
                digits = 1;
            } else {
                while (temp > 0) {
                    digits++;
                    temp = temp / 10;
                }
            }

            temp = number;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (int) Math.pow(digit, digits);
                temp = temp / 10;
            }

            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
