class Solution {
    public boolean isSubsequence(String s, String t) {
        int slen=0;
        int tlen=0;

        while(slen< s.length() && tlen <t.length()){
            if(s.charAt(slen) == t.charAt(tlen)){
                slen++;
                tlen++;
            }
            else{
                tlen++;
            }
        }

        if(slen == s.length())return true;
        return false;
    }
}