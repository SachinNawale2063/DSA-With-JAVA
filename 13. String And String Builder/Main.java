import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        // int[] arr = new int[10];

        String name = "Sachin Nawale";

        System.out.println(name);

        String a  = "abc";
        String b = "abc";
        System.out.println(a==b);
        //This gives the ture value
        // Even the values are same but theey pointing towards the same object

        String s1 = new String("sachin");
        String s2 = new String("sachin");
        System.out.println(s1==s2);
        //This gives the false value
        // Even the values are same but theey pointing towards the different object

        System.out.println(s1.equals(s2));
        //It gives me the TRUE because it only cares the values of the string

        System.out.println(s1.charAt(5));
        //It print character at index 5 in string s1

        System.out.println(new int[] {1,2,3,4,5});
        System.out.println(Arrays.toString(new int[] {1,2,3,4,5}));
        
        System.out.printf("my name is %s and my sap id is %s \n","Sachin", "60009210052");

        System.out.println('a' + 'b'); //195
        System.out.println("a" + "b"); //ab
        System.out.println('a' + 3); //100
        System.out.println((char)('a' + 3)); //d
        System.out.println("a" + 1); //a1
        System.out.println("Sachin" + new ArrayList<>()); //Sachin[]


        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder); //abcdefghijklmnopqrstuwxyz


    }
}


// String is another datatype in Java
// Strings are immutable in java because of some security reason 
// Every string we create it is a object of type string which is already predefined

//How to create diff object of same value


// command line arguments are store in the String[] args

// In Java Operator Overloading is not supported like other languages that is css, python


// string builder make one object and whatever changes we done that can affect only on that new one object, no other object has been created like normal string method in java