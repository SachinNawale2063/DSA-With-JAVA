import java.util.Scanner;

public class CountOccurance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int n = in.nextInt();

        int count = 0;

        while (number > 0) {
            int rem = number % 10;
            if (rem == n) {
                count++;
            }
            number = number / 10;
        }

        System.out.println("Count : " + count);

        in.close();
    }

}
