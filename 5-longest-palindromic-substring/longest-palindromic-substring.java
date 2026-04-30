class Solution {
    boolean isplain(String str){
        int i =0;
        int j =str.length()-1;
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int i ;
        int n = s.length();
        String ans ="";
        for(i=0 ; i<n; i++){
            for(int j =i; j<n ;j++){
                if(s.charAt(i) ==s.charAt(j)){
                    if(isplain(s.substring(i,j+1))){
                        ans = (ans.length() > (j-i+1) )?ans:s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
}