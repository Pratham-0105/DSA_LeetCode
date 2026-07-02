class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int currcount = 0;
        int maxcount = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                currcount++;
            }
            else{
                maxcount = Math.max(currcount,maxcount);
                currcount = 0;
            }
        }
        return Math.max(maxcount,currcount);
    }
}