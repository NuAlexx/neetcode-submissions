class Solution {
    int [] TwoSum(int[] numbers, int target, int n){
        int start = 0, end = n - 1;

        while(start < end){
            int sum = numbers[start] + numbers[end];

            if(sum == target){
                return new int[]{start + 1, end + 1};
            }
            
            if (sum < target){
                start++;
            }else{
                end--;
            }
        }
         return new int[]{};

    }
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        return TwoSum(numbers,target,n);
    }
}
