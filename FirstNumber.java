import java.util.Scanner;

public class FirstNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");

        int number = scanner.nextInt();
        int secondNumber = number / 100;
        System.out.println("The first digit of " + number + " equal " + secondNumber);

    }
}
