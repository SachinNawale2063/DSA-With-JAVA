import java.util.Scanner;

public class Armstrong {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int n = in.nextInt();
        // boolean ans = check(n);
        // if (ans) {
        //     System.out.println("The given number is Armstrong number");
        // }
        // else{
        //     System.out.println("The given number is NOT Armstrong number");
        // }

        for (int i = 100; i < 1000; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
        in.close();
    }

    static boolean check(int n){
        int number = n;
        int ans = 0;
        while (n>0) {
            int rem = n%10;
            int temp = rem*(rem*rem);
            ans += temp;
            n /= 10;
        }
        if (number == ans) {
            return true;
        }
        return false;
        
    }
}
