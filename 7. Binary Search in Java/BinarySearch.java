public class BinarySearch {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int found = bs(arr,8,0,8);

        if (found!=-1) {
            System.out.println("The element is found at index "+ found);
        }
        else{
            System.out.println("Element is not found");
        }
    }
    
    static int bs(int[] arr, int key, int start, int end){
        while(start<=end){
            int mid = (start+(end-start)/2);

            if(key < arr[mid]){
                end = mid-1;
            }
            else if(key>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}


// For this algorithm the array must be sorted
// Time complexity  logN
// total comparison in worst case is (logN)