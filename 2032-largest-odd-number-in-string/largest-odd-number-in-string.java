class Solution {
    public String largestOddNumber(String num) {
        
        // ************************** trying to just pass the given test cases- 105/196 test cases passed ****************************************
        //this doesnt handle cases for middle substrings : eg -> 123456= it doesnt evaluate, 23,2345,45 

        // int x = Integer.parseInt(num);
        // if(x%2 !=0)return String.valueOf(x);
        // int rem =x % 10;
        // x=x/10;
        //  int ans=-1;
        // if (rem % 2 != 0){
        //     ans = rem;
        // }
        // while(x!=0){
        //    if(x % 2 !=0){
        //     //x is odd
        //     if(x> ans){
        //         ans = x;
        //     }
        //    }
        //    rem = x%10;
        //    x =x/10;
        // }
        // if(ans != -1){
        //     return String.valueOf(ans);
        // }
        // return "";

        //****************************************************************************************** */
        //substring must start from very beginning of num, and end at the first odd num we encounter- 
        //as a number being odd only depends on the last digit, and it must be largest so it must start from very beginning
        // int n =num.length();
        // String ans ="";
        // //both pointer start from same position
        // int start=0;
        // int end =0;
        // while( end < n){
        //     int digit = num.charAt(end) - '0';
        //     //if current rightmost dig is odd - store as answer and continue
        //     if(digit % 2 != 0 ){
        //         ans = num.substring(start, end+1);
        //     }
        //     end++;

        // }
        // return ans;

        //********************************************************************************************************* */
        // also if i start finding the largest number from right most side, so first valid odd no is the answer itself, -more optimsed
        int n =num.length();
        String ans ="";
        for( int i = n-1; i>=0; i--){
            if((num.charAt(i) -'0' ) % 2 != 0){
                ans = num.substring(0, i+1);
                return ans;
            }
        }

        return ans;

        // Complexity comparison
        // Approach	Time	Notes
        // Yours	O(n²) worst-case	substring called multiple times
        // Optimal	O(n)	only one substring

    }
}