import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int ans = 0;

        while (number>0) {
            int rem = number%10;
            ans = ans*10 + rem;
            number = number/10;
        }

        System.out.println("Reverse : "+ans);

        in.close();
    }
}
