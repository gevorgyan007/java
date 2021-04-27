import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int max = 1500;
        int min = 700;
        int diff = max - min;
        Random rn = new Random();
        int i = rn.nextInt(diff + 1);
        i += min;
        System.out.print("The Random Number is " + i);




    }

}

