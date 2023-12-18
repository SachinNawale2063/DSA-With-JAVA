public class RotatedBinaraySearch {
    
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};

        int target = 0;

        int ans = search(nums, target);

        System.out.println(ans);
    }

    static int findPivot(int [] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            //four cases over here
            int mid = start + (end-start)/2;

            if((mid<end) && (nums[mid]>nums[mid+1])){
                return mid;
            }
            if((mid>start) && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<=nums[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    static int bs(int[] nums, int key, int start, int end){
        while(start<=end){
            int mid = (start+(end-start)/2);

            if(key < nums[mid]){
                end = mid-1;
            }
            else if(key>nums[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        int ans = bs(nums,target,0, pivot);

        if (ans == -1) {
            return bs(nums, target, pivot+1, nums.length);
        }

        return ans;

    }

}
