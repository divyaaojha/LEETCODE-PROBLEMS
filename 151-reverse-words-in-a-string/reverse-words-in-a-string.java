class Solution {
    public String reverseWords(String s) {

        // all leading and trailing and extra spaces removed 
        String words []= s.trim().replaceAll("\\s+", " ").split(" "); // every word separated now

        StringBuilder sb = new StringBuilder();

        for(int i= words.length -1; i>=0; i--){
            sb.append(words[i]).append(" ");
        }

        return sb.toString().trim();
        
    }
}