class Solution {
    public void moveZeroes(int[] nums) {
        // int i = 0;
        // int j = 1;

        // while(i<j){
        //     if(nums[j] == 0) j++;
        //     else if (nums[i] != 0 ) {
        //         i++;
        //         j++;
        //     }
        //     else{
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //     }
        // }
        // return ;
        int i = 0;
        for (int j=0; j<=nums.length-1; j++){
            if (nums[j] != 0){
               int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}