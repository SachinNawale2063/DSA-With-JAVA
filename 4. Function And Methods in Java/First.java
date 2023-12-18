import java.util.*;

public class First {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int ans = sum2(num1, num2);

        System.out.println("Sum of two numbers is "+ans);

        in.close();
    }

    static void sum(int num1, int num2){
        System.out.println("Sum of given two numbers is "+ (num1+num2));
    }
    static int sum2(int num1, int num2){
        return num1+num2;
    }
    
}
