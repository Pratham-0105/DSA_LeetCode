class Solution {
    public int searchInsert(int[] nums, int target) {
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] >= target){
        //         return i;
        //     }
        // }
        // return nums.length;
        int low = 0;
        int high = nums.length-1;
        return binary (nums , low, high, target);


    }
    public int binary(int[] nums, int low, int high, int target){
        int mid = low + (high - low)/2;
        if (low > high) return low;

        if(nums[mid] == target) return mid;
        else if (nums[mid] < target){
            low = mid + 1;
            return binary(nums, low, high, target);
        }
        else {
            high = mid - 1;
            return binary(nums, low, high, target);
        }
    }
}
