class Solution {
    public String longestCommonPrefix(String[] strs) {
       
       
        int n = strs.length;
        if(n ==1)return strs[0];
        int min =strs[0].length();
        for(int i =1; i<n; i++){
            min = Math.min(min, strs[i].length());
        }
        String s = "";
        for(int i =0; i<min; i++){
            char p = strs[0].charAt(i);
            boolean flag =true;
            for(int j =1; j<n; j++){
                char t = strs[j].charAt(i);
                 if(p!=t){
                    flag= false;
                   break;
                     
                 }
            }
            if(flag){
                s += p;
            }
            else{
                break;
            }

        }
        return s;
    }
}