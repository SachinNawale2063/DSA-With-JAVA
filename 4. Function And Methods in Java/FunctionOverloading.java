import java.util.Scanner;

public class FunctionOverloading {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        fun(20);
        fun("sachin");

        in.close();
    }

    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println(name);

    }
    
}

// two or more function having same name but different number or 
// different types of arguments is called function overloading
// function overloading decide which function to called at compile time
