import java.util.Arrays;

public class Cycle {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };

        cyclesort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void cyclesort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] - 1;
            if (index != i) {
                int temp = arr[i];
                arr[i]  =  arr[index];
                arr[index] = temp;
            }
        }
    }
}

// When numbers given from 1 to N ===> use Cyclic sort
// Verrry verry important

// 3  5  2  1  4

// index = value - 1

// 2  5  3  1  4      first pass
// 2  4  3  1  5      second pass
// 2  4  3  1  5      third pass
// 1  4  3  2  5      fourth pass
// 1  2  3  4  5      fifth pass
