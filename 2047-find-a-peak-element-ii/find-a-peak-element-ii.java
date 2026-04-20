class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col =mat[0].length;
        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                
                int curr = mat[i][j];
                // we ll check the boundary only if they exist
                int top = (i ==0) ? -1 : mat[i-1][j];
                int left = (j ==0) ? -1: mat[i][j-1];
                int right = (j == (col-1)) ? -1:mat[i][j+1] ;
                int bottom = (i== (row-1)) ? -1 : mat[i+1][j];
                if(curr >top && curr >bottom && curr >left && curr > right ) return new int[]{i,j};

            }
        }
        return new int[]{0,0};


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