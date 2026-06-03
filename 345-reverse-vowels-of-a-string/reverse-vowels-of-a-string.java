class Solution {
    private boolean isVowel(char l){
        
            if(l == 'A' || l =='E' || l == 'I' || l == 'O' || l == 'U' || l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') 
            {
                return true;
            }
            return false;
    }

    public String reverseVowels(String s) {

        int n = s.length();
        char ch[] = s.toCharArray();
        int i =0, j = n-1;

        while(i<j){
            while(i<j &&  !isVowel(ch[i])){
                i++;
            }
            while(i<j && !isVowel(ch[j])){
                j--;
            }
            char c = ch[i];
            ch[i]= ch[j];
            ch[j]= c;
            i++;
            j--;
        }

        return new String(ch);

    }
}


/*
 
        int n = s.length();
        char ch[] = s.toCharArray();
        int i =0, j = n-1;

        while(i<=j){
            char l = ch[i];
            char r = ch[j];

            if( (l == 'A' || l =='E' || l == 'I' || l == 'O' || l == 'U' || l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') && 
            (r == 'A' || r =='E' || r == 'I' || r == 'O' || r == 'U' || r== 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u'))
            {
                char temp = ch[i];
                ch[i]= ch[j];
                ch[j]= temp;

                i++;
                j--;
            }
            else if((l == 'A' || l =='E' || l == 'I' || l == 'O' || l == 'U' || l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u')){
                j--;
            }
            else if((r == 'A' || r =='E' || r == 'I' || r == 'O' || r == 'U' || r== 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u')){
                i++;
            }
            else{
                i++;
                j--;
            }

        }

        return new String(ch);
*/