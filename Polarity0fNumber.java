import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number = input.nextDouble();

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("neutral");
        }
    }
}
