import java.util.Scanner;
import java.util.*;

public class ArrayListExample{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //syntax
        ArrayList<Integer> list  = new ArrayList<>(10);

        list.add(67);
        list.add(20);
        list.add(56);
        list.add(89);
        list.add(6);
        list.add(7);
        list.add(97);

        System.out.println(list);

        list.contains(89);
        list.contains(88);

        list.set(0, 99);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(4));


        in.close();
    }
}