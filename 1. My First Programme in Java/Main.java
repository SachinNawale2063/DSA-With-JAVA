import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world");

        Scanner input = new Scanner(System.in);

        // System.out.println(input.nextInt());
        // System.out.println(input.next());
        // System.out.println(input.nextLine());
        // System.out.println(input.nextBoolean());
        // System.out.println(input.nextFloat());

        // int rollno = 64;
        // char letter = 'r';
        // float marks = 95.6f;
        // double largedecimalnumber = 45645545.22546546;
        // long largeinteger = 55445468784165464L;
        // boolean check = true;

        int rollno;
        System.out.print("Please enter some input : ");
        rollno = input.nextInt();
        System.out.println("Your Roll Number is "+rollno);


        input.close();

    }

}

// Public means this class can be access from anywhere that is
// from any classes or files
// programme execution is start from the public static void main
// String[] args means command line arguemnt basically it is collection of
// strings
// it store command line arguments in it
// there is static in psvm because we want to run main function without
// creating object of class Main

// to run java code first we have to compile it
// javac Main.java it creates the byte code that is Main.class
// javac -d . Main.java if we want byte code in same file
// javac -d .. Main.java if we want byte code in previous directory
// javac -d ./path if we want byte code in perticular path
// java Main.java this is used to run the java code

// Packages in Java ?

// Inputs in java

// Primittive Data types:
// int rollno = 64
// char letter = 'r'
// float marks = 95.6f
// double largedecimalnumber = 45645545.22546546
// long largeinteger = 55445468784165464L;
// boolean check = true; or false

// non primittice data types: it is break into another data types that is string
// is break into characters
// String = "sachinn"

// type casting 
// int num = (int)(67.56f)

// byte variable range is from 1 to 256