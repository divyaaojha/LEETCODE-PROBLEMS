class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0; // first row no
        int bottom= matrix.length -1 ; // last row no

        int left=0 ;// first col no
        int right=matrix[0].length -1; // last col no

        List<Integer> ans = new ArrayList<>();


        while(top <= bottom && left <= right){
            //step 1
            //traversing left to right
            for(int i = left; i <= right; i++ ){
                ans.add( matrix[top][i] );
            }
            top++; //top row traversed, so naturally top will comedown, 

            //step 2
            //traversing top to bottom, due to top++ top startes from nxt row, perfect 
            for(int i = top; i <= bottom; i++){
                ans.add( matrix[i][right] );
            }
            right--;

            //step 3
            //traversing right to left, which we will only do if rows remain, so mandatory check top<=bottom, here
            if(top <= bottom){
            for(int i= right; i>=left; i--){
                ans.add( matrix[bottom][i] );
            }
            bottom--;
            }

            //step 4
            //traversing bottom to top, which we will only do if column remain, so mandatory check left<=rightm, here
            if(left <= right){
            for(int i= bottom; i>=top; i--){
                ans.add( matrix[i][left] );
            }
            left++;
            }
            
        }

        return ans;
    }
}