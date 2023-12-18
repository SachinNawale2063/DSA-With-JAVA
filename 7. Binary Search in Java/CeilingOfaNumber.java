public class CeilingOfaNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,26,67,88};

        int target = 35;

        int ceilingnumberindex = binarySearch(arr, target);

        System.out.println("Ceiling of a given number is "+ arr[ceilingnumberindex]);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            
            int mid = start + (end-start)/2 ;

            if (arr[mid] == target) {
                return mid;
            }

            else if(arr[mid] > target){
                end = mid-1;
            }

            else{
                start = mid + 1;
            }
        }

        return start;

    }
}
