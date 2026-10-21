class Solution {
    public boolean isValidSudoku(char[][] board) {

        boolean[][] row= new boolean[9][10];
        boolean[][] col= new boolean[9][10];
        boolean[][] box= new boolean[9][10];

        for(int i =0; i<9; i++){
            for(int j =0; j<9; j++){
                char ch = board[i][j];

                if(ch == '.'){
                    continue;
                }

                int num = ch -'0'; //converted '1' to 1 int

                int boxind = (i/3)*3 + (j/3);

                if(row[i][num] || col[j][num] || box[boxind][num]){
                    return false;
                }
                row[i][num]= true;
                col[j][num]= true;
                box[boxind][num]=true;
            }
        }

        return true;
        
    }
}

/*
1.we ll make a visited row array- initialised with false,on encounter(1-9) update to true, if any true encountered, return false,
for every row, we traverse each row and in every iteration we travel all columns of each rpw so
for(i ....){
for(j){
arr[i][j];
}
}
2.we ll make a visited column array- initialised with false,on encounter(1-9) update to true, if any true encountered, return false,
arr[j][i];


3.
now for each 3x3 box, guess we can come up with a formula , or if we have all elemnts of each box in an array, we can repeat the visited check
using a formula to index each box, and just checking for duplicayes again




00 01 02 03 04 05 06 07 08 
10 11 12 13 14 15 16 17 18
20 21 22 23 24 25 26 27 28
30 31 32 33 34 35 36 37 38
40 41 42 43 44 45 46 47 48
50 51 52 53 54 55 56 57 58
60 61 
70 71
80 81


*/
