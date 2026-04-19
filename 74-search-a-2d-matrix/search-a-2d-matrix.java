class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int totalelements = rows *cols;
        int low = 0; 
        int high = totalelements -1 ;


        // since rows are sorted, only
        //But here the property is: First element of a row > last element of previous row
        // this property basically means  - the whole array is sorted , and on flateening it will become one sorted 1d array
        // so we ll do exactly that- and flatten the array,
        while( low <= high){
            int mid = low + (high -low)/2;
            //mapping logic 2d -> 1d
            int r = mid/cols;
            int c = mid % cols;
            if(matrix[r][c] == target){
                return true;
            }
            else if(  target > matrix[r][c] ){
                low = mid + 1;

            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}