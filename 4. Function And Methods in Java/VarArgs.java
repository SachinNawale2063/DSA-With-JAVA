import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(1,2,3,4,5,5,6,7,8,9,9,0,10 );
    }
    
    static void fun(int ...v){           // variable length arguments
        System.out.println(Arrays.toString(v));
    }
}
