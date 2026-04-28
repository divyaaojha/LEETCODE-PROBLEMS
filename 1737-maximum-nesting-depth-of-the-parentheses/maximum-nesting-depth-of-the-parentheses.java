class Solution {
    public int maxDepth(String s) {
        int ans=0;
      int bracket=0;
      for(char c : s.toCharArray()){
        
        if(c=='('){
            bracket++;
           
            ans = Math.max(ans, bracket);
        }
        else if(c == ')'){
            bracket--;
           
        }
        
      }  
      return ans;
    }
}