import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        number = Math.abs(number);

        int sum = 0;
        int product = 1;
        int count = 0;

        if (number == 0) {
            sum = 0;
            product = 0;
            count = 1;
        } else {
            while (number > 0) {
                int digit = number % 10;

                sum = sum + digit;
                product = product * digit;
                count++;

                number = number / 10;
            }
        }

        double average = (double) sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
    }
}
