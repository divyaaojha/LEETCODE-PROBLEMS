class Solution {
   
    
    public boolean rotateString(String s, String goal) {

        //optimised, smart solution
        // if(s.length() != goal.length())return false;
        // String str = s+s;
        // if(str.contains(goal)){
        //     return true;
        // }
        // return false;
         if (s.length() != goal.length()) return false;

        int n = s.length();

        for (int k = 0; k < n; k++) {
            int i = 0;
            for (; i < n; i++) {
                if (s.charAt((i + k) % n) != goal.charAt(i)) {
                    break;
                }
            }
            if (i == n) return true; // full match
        }

        return false;



//only half correct- not working for aaab-> abaa kinda case 42/62 test cases 

// Wrong Answer
// 42 / 62 testcases passed
// submitted at Apr 26, 2026 10:17


// Input
// s =
// "defdefdefabcabc"
// goal =
// "defdefabcabcdef"

// Use Testcase
// Output
// false
// Expected
// true
        
        // if(s.length() != goal.length())return false;
        // int n = s.length();
        // char a []= s.toCharArray();
        // char b []=goal.toCharArray();
        // int k =0;
        // int index=0;
        // for(int i =0; i<n ; i++){
        //     if(a[i] != b[index])k++;
        //     else{
        //         break;
        //     }
        // }
        // for(int  i=0; i<n; i++){
        //     if(a[(i+k )%n] != b[i])return false;
        // }

        // return true;


        // convert both in char array, and then check rotation in array*****
        //Just trying

        // int i =0, j =0;
        // if(s.length() != goal.length())return false;
        // int index =0;
        // while(i <s.length() && j< goal.length()){
        //     if(s.charAt(i) != goal.charAt(j)){
        //         i++;
        //     }
        //     else{
        //         index=i;
        //         while(i <s.length() && j< goal.length()){
        //             if(s.charAt(i) != goal.charAt(j)){
        //                 return false;
        //             }
        //             i++;
        //             j++;
        //         }
        //     }
        // }
        // return true;
        
    }
}