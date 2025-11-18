class Solution {
    public void reverseString(char[] s) {
        // character array given - great 
        //approach: 2 pointers, start and end, and keep swapping and moving them towards right and left respectively
        //array - int /char = .length  same for both

        int start =0; int end = s.length-1;
        while(start<end){
            char  temp = s[start];
            s[start]= s[end];
            s[end]= temp;
            start++;
            end--;

        }



    }
}