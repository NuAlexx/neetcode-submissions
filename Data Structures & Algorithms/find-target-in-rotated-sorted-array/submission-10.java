class Solution {
    public int binarySearchInSortedArray(int[] nums, int target, int n){
        int start = 0, end = n - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == target){
                return mid;
            }
            //if left side is sorted.
            if(nums[start] <= nums[mid]){

                if(nums[start] <= target && target < nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }//if right side sorted.
            else{
                if(nums[mid] < target && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;

        return binarySearchInSortedArray(nums, target, n);
    }
}
