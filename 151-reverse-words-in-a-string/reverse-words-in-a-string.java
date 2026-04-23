class Solution {
    public String reverseWords(String s) {
        String str = s.trim().replaceAll("\\s+", " "); // all leading and trailing and extra spaces removed 
        String words []= str.split(" "); // every word separated now
        StringBuilder sb = new StringBuilder();
        for(int i= words.length -1; i>=0; i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");

            }
        }
        return sb.toString();

        


    }
}