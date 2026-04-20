class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col =mat[0].length;

        //we are fixing col by finding col max, and so we will compare with left and right- so left and right boundary are col boundary
        int low =0;
        int high = col-1;

        while(low <= high){
            int mid = low + (high-low)/2;
            //mid is column, as we are doing binary search on column- so now we selected the col - 
            //now find the row which has max element in this col

            int maxi=-1;
            int maxrow =0;
            for(int i =0; i< row; i++){
                if(mat[i][mid] > maxi){ 
                maxi = mat[i][mid]; 
                maxrow=i;
                }
            }
            // row = maxrow, col =mid
            //check left and right now, and move direction also left/right only
            int left = (mid > 0) ? mat[maxrow][mid - 1] : -1;
            int right = (mid < col - 1) ? mat[maxrow][mid + 1] : -1;
            int curr = mat[maxrow][mid];
            if( curr > left && curr > right){
                return new int[]{maxrow,mid};
            }
            else if( left > curr ){
                high = mid-1;
            }
            else{
                low = mid+1;
            }


        }

       
      
    
    return new int []{0,0};

    //57 / 59 testcases passed---- read approach, did it myself**********************
    //this is luck by chance - be happy cuz you tried, dont be happy cus it passed test cases, 
    //because you have no idea why the rest 2 test cases failed why your code didnt work- you need to debug*****
    //these are the important question one has to ask / seek


        // int row = mat.length;
        // int col =mat[0].length;
       
        // for(int j =0; j< col; j++){
        //     // fixed the row 
           
     
        //         int low = 0;
        //         int high = row-1;

        //         while( low <= high){
        //         int mid = low + (high -low)/2;
        //         int top = (mid ==0) ? -1 : mat[mid-1][j];
        //         int bottom = (mid== (row-1)) ? -1 : mat[mid+1][j];
        //          int curr = mat[mid][j];
        //         if(curr > top && curr > bottom ){
        //         int left = (j ==0) ? -1: mat[mid][j-1];
        //         int right = (j == (col-1)) ? -1:mat[mid][j+1] ;
        //          if( curr > left && curr >right ){
        //             return new int []{mid,j};
        //          }

        //         }

        //         if(top> curr){
        //             high =mid-1;
        //         }
        //         else{
        //             low = mid+1;
        //         }
        //     }
        // }
        // return new int []{0,0};
// Step 1: Recognize Pattern

// This is similar to:
// 👉 1D Peak Element problem (Leetcode 162)
// Where we use binary search on array

// Step 2: Extend 1D → 2D
// We can't binary search both dimensions.
// So we:
// 👉 Fix one dimension
// 👉 Binary search on the other
//************************************************************************************************************ */







        // BRUTE FORCE - PASSED ALL CASES- STANDARD*******************************************************
        //concept -  ******** we ll check the boundary only if they exist ********
        // int row = mat.length;
        // int col =mat[0].length;
        // for(int i =0; i<row; i++){
        //     for(int j =0; j<col; j++){
                
        //         int curr = mat[i][j];
        //         // we ll check the boundary only if they exist
        //         int top = (i ==0) ? -1 : mat[i-1][j];
        //         int left = (j ==0) ? -1: mat[i][j-1];
        //         int right = (j == (col-1)) ? -1:mat[i][j+1] ;
        //         int bottom = (i== (row-1)) ? -1 : mat[i+1][j];
        //         if(curr >top && curr >bottom && curr >left && curr > right ) return new int[]{i,j};

        //     }
        // }
        // return new int[]{0,0};


        //***********************************FIRST TRY************************************************* */
        // // its a 2d array- peak element must be greater than all its neighbour, left right top, bottom
        // // return index as an array {i, j}

        // // lets try to solve the question first brute force

        // int row = mat.length-1;
        // int col = mat[0].length-1;
        // for(int i = 0; i< mat.length ; i++){
        //     for(int j =0; j< mat[0].length; j++){

        //         //check if corner elements

        //         //top left element
        //         if(i==0 && j ==0){
        //             //only compare with right and down element
        //             if((mat[i][j] > mat[i][j+1]) && mat[i][j] > mat[i+1][j]) return new int[]{i,j};
        //         }
        //         //bottom right element
        //         if(i == row && j ==col ){
        //             if((mat[i][j] > mat[i][j-1]) && mat[i][j] > mat[i-1][j]) return new int[]{i,j};
        //         }
        //         //top right ele
        //         if(i == 0 && j ==col ){
        //             if((mat[i][j] > mat[i][j-1]) && mat[i][j] > mat[i+1][j]) return new int[]{i,j};
        //             else{
        //                 continue;
        //             }
        //         }
        //         // bottom left
        //         if(i == row && j ==0 ){
        //             if((mat[i][j] > mat[i][j+1]) && mat[i][j] > mat[i-1][j]) return new int[]{i,j};
        //             else continue;
        //         }

        //         int curr = mat[i][j];

        //         if(i==0){
        //             //dont check top
        //             if(curr > mat[i][j+1] && curr > mat[i][j-1]  && curr > mat[i+1][j]) return new int[]{i,j};
        //             else continue;
        //         }
        //         if(i==row){
        //             //dont check bottom
        //             if(curr > mat[i][j+1] && curr > mat[i][j-1]  && curr > mat[i-1][j]) return new int[]{i,j};
        //             else continue;
        //         }

        //         if(j ==0){
        //           //dont check left
        //           if(curr > mat[i][j+1] && curr > mat[i-1][j]  && curr > mat[i+1][j]) return new int[]{i,j};
        //           else continue;
        //         }

        //         if(j ==col){
        //             //dont check right
        //             if(curr > mat[i][j-1] && curr > mat[i-1][j]  && curr > mat[i+1][j]) return new int[]{i,j};
        //             else continue;
        //         }

                
        //         if(curr > mat[i][j-1] && curr > mat[i-1][j]  && curr > mat[i+1][j] && curr > mat[i][j+1]) return new int[]{i,j};



        //     }
        // }
        // return new int[2];

    }
}