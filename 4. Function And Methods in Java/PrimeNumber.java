import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number");

        int n = in.nextInt();

        CheckPrime(n);

        in.close();
    }

    static void CheckPrime(int n){
        int i;

        if (n<=1) {
            System.out.println("The given number is not prime");
            return;
        }

        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                System.out.println("The given number is not prime");
                return;
            }            
        }
        System.out.println("The given number is prime number");
    }
    
}
