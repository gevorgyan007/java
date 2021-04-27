import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter number");

        int number = scanner.nextInt();

        boolean checkIn = ((number % 2)==0);

        System.out.println(checkIn);
    }
}
