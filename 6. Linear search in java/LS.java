import java.util.Scanner;

public class LS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1,2,3,5,6,8};

        int[] find  = search(arr, 0);

        if (find[0] == -1) {
            System.out.println("Element is not found");
        }
        else{
            System.out.println("Element found at index "+ find[0]);
        }

        in.close();
    }

    static int[] search(int[] arr, int key){
        int[] ans = {-1,-1};

        // int[] ans = {-1,-1};

        for(int i=0; i<arr.length; i++){
            if (arr[i] == key) {
                ans[0] = i;
                ans[1] = arr[i];
            }
        }

        return ans;
    }
}
