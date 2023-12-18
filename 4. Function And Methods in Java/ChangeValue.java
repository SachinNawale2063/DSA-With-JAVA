import java.util.*;

public class ChangeValue {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = {1,2,3,4,5};

        change(arr);   //this is going to be change the value at index 0

        System.out.println(Arrays.toString(arr));

        in.close();
    }

    static void change(int[] arr ){
        arr[0] = 99;
    }

}

// Scopes in java
// 1. Function Scope
// 2. Block Scope : values initialize in block remains in that block only
