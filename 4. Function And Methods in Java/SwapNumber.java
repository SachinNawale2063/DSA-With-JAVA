import java.util.*;

public class SwapNumber {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = in.nextInt();
        System.out.print("Enter the value of b : ");
        int b = in.nextInt();

        System.out.println("value of a and b before swapping a = "+a+" b = "+b);
        
        swap(a,b);         // its not swap the values of a and b
        
        int temp = a;
        a = b;
        b = temp;              // its swap the values of a and b
        System.out.println("value of a and b after swapping a = "+a+" b = "+b);
        
        in.close();
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        // this change is valid only in this function scope
    }

}


// In java there is only pass by value thats why swap function does not swap the values of a and b
// java does not support the pass by reference.....
