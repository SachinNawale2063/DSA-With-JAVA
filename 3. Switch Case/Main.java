import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // if (fruit.equals("mango")) {
        // System.out.println("King of Fruits");
        // }
        // else if(fruit.equals("apple")){
        // System.out.println("a sweet red fruit");
        // }

        switch (fruit) {
            case "mango":
                System.out.println("King of Fruits");
                break;

            case "apple":
                System.out.println("a sweet red fruit");
                break;

            default:
                System.out.println("Fruit unknown");
                break;
        }

        in.close();

    }
}
