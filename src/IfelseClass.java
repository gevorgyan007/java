import java.util.Scanner;

public class IfelseClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int legCheck = scanner.nextInt();

        if (legCheck == 98) {
            System.out.println("you are health");
        }else if (legCheck == 70)
        {
            System.out.println("its normal health");
        }else if (legCheck == 50)
        {
            System.out.println("not bed");
        }else if (legCheck == 30)
        {
            System.out.println("bed");
        }else if (legCheck == 0)
        {
            System.out.println("death");
        }

    }


}


