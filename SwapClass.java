import java.util.Scanner;

public class SwapClass {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number");
        int number2 = scanner.nextInt();

        number1 = number1 - number2;
        number2 = number1 + number2;
        number1 = number2 - number1;

         System.out.println("Number1 = " + number1 + "::" + "Number2 = " + number2);
     }

}
