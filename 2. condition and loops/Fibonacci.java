import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please Enter the range : ");

        int range = in.nextInt();

        int first = 0;
        int second = 1;
        int count = 2;
        System.out.println(first);
        
        while (count <= range) {
            
            int temp = second;
            second = second + first;
            first = temp;
            System.out.println(first);
            
            count++;
            
        }

        in.close();
    
    }
}
