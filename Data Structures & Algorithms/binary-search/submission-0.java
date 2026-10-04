class Solution {
    int SearchInArray(int[] nums, int target, int n ){
        int start = 0, end = n - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid] > target){
               end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;

        return SearchInArray(nums, target, n);
    }
}
