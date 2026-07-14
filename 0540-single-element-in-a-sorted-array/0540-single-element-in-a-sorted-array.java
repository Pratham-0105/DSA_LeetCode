class Solution {
    public int singleNonDuplicate(int[] arr) {
        if (arr.length == 1) return arr[0];
        int lo = 0 , hi = arr.length-1;
        while(hi>=lo){
            int mid = (lo+hi)/2;
            
            if (mid == 0 || mid == arr.length - 1)
                return arr[mid];
            if (arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            int f = mid ,s = mid;
            if(arr[mid-1]==arr[mid]) f = mid - 1;
            else s = mid + 1;

            int leftcount = f - lo;
            int rightcount = hi - s;
            if(leftcount % 2 == 0) lo = s+1;
            else hi = f - 1;
        }
        return 0;
    }
}