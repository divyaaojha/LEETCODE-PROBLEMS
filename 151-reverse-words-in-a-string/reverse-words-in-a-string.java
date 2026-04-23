class Solution {
    void swapping(char ch[], int i , int j){
        while(i<=j){
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]= temp;
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        char ch  []=s.trim().replaceAll("\\s+", " ").toCharArray();
        
        swapping(ch, 0, ch.length-1); 

        int start=0;

        for(int i =0; i <=ch.length; i++){
            if(i == ch.length || ch[i] == ' '){ // because after last elemet space isnt there so it isnt getting reversed
                swapping(ch, start, i-1); // swap till before the space
                start=i+1;
            }
          
        }
 
        return new String(ch).strip();

        // ACCEPTED SOLUTION 

        // // all leading and trailing and extra spaces removed 
        // String words []= s.trim().replaceAll("\\s+", " ").split(" "); // every word separated now

        // StringBuilder sb = new StringBuilder();

        // for(int i= words.length -1; i>=0; i--){
        //     sb.append(words[i]).append(" ");
        // }

        // return sb.toString().trim();

    }
}