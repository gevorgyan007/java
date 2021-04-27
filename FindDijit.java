import java.util.Scanner;

public class FindDijit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter number");
        int digit = scanner.nextInt();
        int lastDigit = digit % 10;
        System.out.println(lastDigit);

    }
}
