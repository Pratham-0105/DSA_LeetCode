class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        return binary( nums,low,high,target);
        
    }

    public int binary(int[] nums, int low, int high, int target){
        if(high < low) return -1;
        while(low<=high){
            int mid = low + ( high - low)/2;
            if(nums[mid] == target) return  mid;
            else if (nums[mid] < target){
                low = mid+1;
                return binary( nums,low,high,target);
            }
            else{
                high = mid-1;
                return binary( nums,low,high,target);
            }
        }
        return -1;
    }
}