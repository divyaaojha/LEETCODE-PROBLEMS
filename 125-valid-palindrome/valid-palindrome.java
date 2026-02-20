class Solution {
    public boolean isPalindrome(String s) {
      
        

        int left =0; int right = s.length()-1;
        while(left < right){

            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;

        }
        return true; 
    }


    //using another string- passed, optimised
    //  StringBuilder sb = new StringBuilder();
    //     for(char c : s.toCharArray()){
    //         if(Character.isLetterOrDigit(c)){
    //             sb.append(Character.toLowerCase(c));
    //         }
    //     }

    //     int left =0; int right = sb.length()-1;
    //     while(left < right){

    //         if(sb.charAt(left)  !=sb.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;

    //     }
    //     return true;


        //*=------------------------------------------------

    // it doesnt ignore uppercase, and alphanumeric characters and spaces
    // private boolean recur(String s, int len){
    //     if(len >= s.length()/2){
    //         return true;
    //     }
    //     if(s.charAt(len) != s.charAt(s.length()- len -1)){
    //         return false;
    //     }
    //     return  recur(s, len+1);
    // }
}