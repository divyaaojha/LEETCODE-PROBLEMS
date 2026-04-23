class Solution {
    public String removeOuterParentheses(String s) {
        int i =0;
        StringBuilder sb = new StringBuilder();
        char ch []= s.toCharArray();
        for(char c : ch){
           
                // dont append to string, just add its number and continue
                if( c=='('){
                    if(i!=0){
                    sb.append(c);
                    }
                    i+=1;

                }
                
                else if(c ==')'){
                    i-=1;
                    if(i!=0){
                    sb.append(c);
                    }
                }
            
            
        }
        return sb.toString();
    }
}