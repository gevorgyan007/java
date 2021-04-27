import java.util.Scanner;

public class SecondDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");

        int number = scanner.nextInt();

        int secondNumber = (number / 10) % 10;

        System.out.println("The second digit of " + number + " equal " + secondNumber);

    }
}
