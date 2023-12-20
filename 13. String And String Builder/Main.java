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
        
        

    }
}


// String is another datatype in Java
// Strings are immutable in java because of some security reason 
// Every string we create it is a object of type string which is already predefined

//How to create diff object of same value


// command line arguments are store in the String[] args