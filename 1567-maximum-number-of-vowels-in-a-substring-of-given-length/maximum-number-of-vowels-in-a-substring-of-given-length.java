class Solution {
    public boolean vowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
            return true;
        }

        return false;
    }
    public int maxVowels(String s, int k) {
        int n = s.length();
        char [] ch = s.toCharArray();
        int maxcount =0; int count=0;
        for(int i=0; i< k; i++){
            if(vowel(ch[i])){
                count++;
            }
        }

        maxcount=Math.max(maxcount, count);
        for(int i =k; i<n; i++){
            char b=ch[i-k];
            char e=ch[i];
            if(vowel(b)){
                count--;
            }
            if(vowel(e)){
                count++;
            }
             maxcount=Math.max(maxcount, count);
        }
            return maxcount;
    }
}