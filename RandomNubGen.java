import java.util.Random;

public class RandomNubGen {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 15;
        int max = 30;
        int diff = max - min;
        int randNum = random.nextInt(diff + 1);
        randNum += min;
        System.out.println(randNum);

    }
}
