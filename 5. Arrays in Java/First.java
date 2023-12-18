import java.util.Arrays;
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // for (int num : arr) {   // for every element of the array print the element
        //     System.out.print(num + " ");
        // }

        System.out.println(Arrays.toString(arr));

        in.close();
    }
    
}

// syntax 
// datatype[] variable_name = new datatype[size];
// int[] arr;
// arr = new arr[5]    actual memory allocation happen in heap memory
// it is called as dynamic memory allocation that is at the run time memory is allocated to the arr
// it assign continuos memory to the array object
// 1. Array object are in heap
// 2. heap object are not continuos ---- it depends on JVM (Java Virtual Machine)
// 3. Dynamic memory allocation
// new keyword is use to create object in heap memory

// default value is null to empty array
