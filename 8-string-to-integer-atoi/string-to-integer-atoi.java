class Solution {
    public int helper(String s,int i, int sign , long num){

        //base condition
        if(i >= s.length() || !Character.isDigit(s.charAt(i))){
            //reached end return answer
            return (int)(sign * num);
        }
        //update the number
        num = (num * 10) + (s.charAt(i)-'0'); 

         // Overflow handling
        if (sign == 1 && num >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (sign == -1 && -num <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return helper(s, ++i, sign, num);
    }

    public int myAtoi(String s) {
        int sign= +1;
        long num=0;
        int i=0;
        while(i < s.length()  && s.charAt(i) == ' '){
            i++;
        }
        if(i == s.length()) return 0;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if(s.charAt(i) == '+'){
            i++;
        }
        return helper(s, i, sign, num);
       
        // int n = s.length();
        // int i =0;
        // while(i<n && s.charAt(i) == ' ')i++;

        // int sign =1;
        // if(i<n && (s.charAt(i) =='+' || s.charAt(i) == '-') ){
        //     if(s.charAt(i) == '-')sign = -1;
        //     i++;
        // }

        // int result=0;
        // while (i<n && Character.isDigit(s.charAt(i))) {
        //     int digit = s.charAt(i) -'0';
        //     //if number is greater rounding the number to be in range
        //     if(result > (Integer.MAX_VALUE -digit ) /10){
        //         return sign ==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        //     }

        //     result = result *10 + digit;
        //     i++;
        // }
        // return result * sign ;

    }
}