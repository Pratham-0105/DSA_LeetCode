class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};


// Below code will not be give the corret output if array is not sorted 
        // int i = 0;
        // int j = nums.length-1;

        // while (i<j){
        //     int a = nums[i] + nums[j];
        //     if (a>target){
        //         j--;
        //     }
        //     else if (a>target){
        //         i++;
        //     }
        //     else{
        //         return new int[] {i,j};
        //     }
        // }
        // return new int []{};
    }
}