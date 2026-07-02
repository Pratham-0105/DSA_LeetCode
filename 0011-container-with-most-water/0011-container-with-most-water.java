class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int n = height.length;
        // for(int i=0; i<n-1; i++){
        //     for(int j=i; j<n; j++){
        //         int h = Math.min(height[i],height[j]);
        //         int w = j-i;
        //         int area = h*w;
        //         maxarea = Math.max(area,maxarea);
        //     }
        // }
        // return maxarea;

        int i=0 , j=n-1;
        while(i<=j){
            int h = Math.min(height[i],height[j]);
            int b = j-i;
            int area = h*b;
            maxarea = Math.max(maxarea,area);
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxarea;
    }
}