import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int original = number;
        int temp = Math.abs(number);
        int digits = 0;

        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }
        }

        temp = Math.abs(number);
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (number == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
