class Solution {
    boolean SearchIn2DMatrix(int[][] matrix, int target){

        for(int row = 0; row < matrix.length; row++){

            int start = 0, end = matrix[row].length - 1;

            while(start <= end){

                int mid = (start + end) / 2;

                if(matrix[row][mid] == target){
                    return true;
                }
                if(matrix[row][mid] < target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        return SearchIn2DMatrix(matrix,target);
    }
}
